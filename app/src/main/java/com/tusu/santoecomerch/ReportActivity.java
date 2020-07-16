package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;
import com.tusu.santoecomerch.Adapter.ReportRowAdapter;
import com.tusu.santoecomerch.Pojo_Class.Payment;
import com.tusu.santoecomerch.Pojo_Class.Products;

import java.util.ArrayList;
import java.util.List;

import static com.tusu.santoecomerch.MainActivity.USER_SECURITY_KEY;
import static com.tusu.santoecomerch.MainActivity.USER_TIME_STAMP;

public class ReportActivity extends AppCompatActivity {

    private TextView uName,uPhone,uAddress,uTotalCost,productNameShowOrder,finisActivity;
    private RecyclerView recyclerView;
    private List<Products> products=new ArrayList<>();
    private ReportRowAdapter adapter;
    private DatabaseReference productsRoot;
    private Animation boundsAnimation;
    private UserAuthintication userAuthintication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        uName=findViewById(R.id.areportUserName);
        uPhone=findViewById(R.id.areportUserMobile);
        uAddress=findViewById(R.id.areportUserAddress);
        uTotalCost=findViewById(R.id.reportUserTotalCost);
        recyclerView=findViewById(R.id.recyClerView);
        productNameShowOrder=findViewById(R.id.productNameShowOrder);
        finisActivity=findViewById(R.id.finisActivity);
        userAuthintication=new UserAuthintication(this);

        String userKey=getIntent().getStringExtra("key");
        boundsAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);


        adapter=new ReportRowAdapter(this,products);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        productsRoot= FirebaseDatabase.getInstance().getReference("Payment")
                .child(userAuthintication.getTimeStamp())
                .child(userKey)
                .child(userAuthintication.getDeviceKey());
        productsRoot.child("Products").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProduct=d.getValue(Products.class);
                    products.add(allProduct);
                    adapter=new ReportRowAdapter(ReportActivity.this,products);
                    recyclerView.setLayoutManager(new LinearLayoutManager(ReportActivity.this,LinearLayoutManager.VERTICAL,false));
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        productsRoot.child("payment").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Payment payment=dataSnapshot.getValue(Payment.class);
                Log.e("get Data", "onDataChange: "+payment.getName() );

                uName.setText(payment.getName());
                uPhone.setText(payment.getMobile());
                uAddress.setText(payment.getAddress()+","+payment.getIuniyon());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        productsRoot.child("Total Price").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String total=dataSnapshot.getValue(String.class);
                    uTotalCost.setText(total+" ৳");

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        productNameShowOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productNameShowOrder.startAnimation(boundsAnimation);
                startActivity(new Intent(ReportActivity.this,CommentsActivity.class));
                finish();
            }
        });

        finisActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finisActivity.startAnimation(boundsAnimation);
                startActivity(new Intent(ReportActivity.this,MainActivity.class));
                finish();
            }
        });

    }
}
