package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.tusu.santoecomerch.Adapter.CommentsAdapter;
import com.tusu.santoecomerch.Pojo_Class.Comments;

import java.util.ArrayList;
import java.util.List;

public class CommentsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Comments> comments=new ArrayList<>();
    private CommentsAdapter adapter;
    private Toolbar toolbar;
    private DatabaseReference comentsRoot;
    private Animation boundsAnimations;
    private Button addComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        recyclerView=findViewById(R.id.recyClerView);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        boundsAnimations= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        addComments=findViewById(R.id.addComments);

        adapter=new CommentsAdapter(this,comments);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        comentsRoot= FirebaseDatabase.getInstance().getReference("comments");
        comentsRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                comments.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Comments allComments=d.getValue(Comments.class);
                    comments.add(allComments);
                    adapter=new CommentsAdapter(CommentsActivity.this,comments);
                    recyclerView.setLayoutManager(new LinearLayoutManager(CommentsActivity.this,LinearLayoutManager.VERTICAL,false));
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    public void gotoAddComentsActivity(View view) {
        addComments.startAnimation(boundsAnimations);
        startActivity(new Intent(this,Add_ComentsActivity.class));
    }
}
