package com.tusu.santoecomerch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tusu.santoecomerch.Pojo_Class.Comments;

import static com.tusu.santoecomerch.MainActivity.USER_TIME_STAMP;

public class Add_ComentsActivity extends AppCompatActivity {

    private EditText nameTV,addTV,commentsTV;
    private DatabaseReference commentsRoot;
    private Toolbar toolbar;
    private Button addComments;
    private Animation boundsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__coments);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        addComments=findViewById(R.id.addComments);
        boundsAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bound2);

        nameTV=findViewById(R.id.commentsADDNameTV);
        addTV=findViewById(R.id.commentsADDAddressTV);
        commentsTV=findViewById(R.id.commentsADDTV);

        addComments=findViewById(R.id.addComments);


        commentsRoot= FirebaseDatabase.getInstance().getReference("comments");
    }

    public void saveCommants(View view) {

        addComments.startAnimation(boundsAnimation);
        if(nameTV.getText().toString().isEmpty()){
            nameTV.setError("Please Set Name.");
        }else if (addTV.getText().toString().isEmpty()){
            addTV.setError("Please Write Address");
        }else if (commentsTV.getText().toString().isEmpty()){
            commentsTV.setError("Write Somethings...");
        }else {

            Comments comments=new Comments(nameTV.getText().toString(),addTV.getText().toString(),commentsTV.getText().toString());
            commentsRoot.push().setValue(comments);
            Toast.makeText(this, "Add Your comments Publicly Succesfully", Toast.LENGTH_SHORT).show();
            this.finish();


        }
    }
}
