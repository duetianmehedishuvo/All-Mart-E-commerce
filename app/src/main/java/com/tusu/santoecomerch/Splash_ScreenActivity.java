package com.tusu.santoecomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Splash_ScreenActivity extends AppCompatActivity {

    private Animation fadeinAnimation;
    private ImageView splashRL;

    private SimpleDateFormat formatter;
    private DatabaseReference root;
    private UserAuthintication userAuthintication;


    public static String userTimeStamp="TIME_STAMP";
    public static String userSecurityKey="SECURITY_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        userAuthintication=new UserAuthintication(this);

        root= FirebaseDatabase.getInstance().getReference("Products");
        root.keepSynced(true);


        fadeinAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bound2);
        splashRL=findViewById(R.id.splashRL);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        fadeinAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Dialog dialog=new Dialog(Splash_ScreenActivity.this);
                dialog.setContentView(R.layout.user_choose);
                Button choose1=dialog.findViewById(R.id.choose1);
                Button choose2=dialog.findViewById(R.id.choose2);
                Button choose3=dialog.findViewById(R.id.choose3);

                choose1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Date date = new Date();
                        Timestamp ts=new Timestamp(date.getTime());
                        formatter= new SimpleDateFormat("dd-MM-yyyy");
                        userTimeStamp=formatter.format(ts);
                        userSecurityKey=root.push().getKey();

                        userAuthintication.saveUserinfo(userTimeStamp,userSecurityKey);

                        startActivity(new Intent(getBaseContext(),MainActivity.class).putExtra("User","newUser"));
                        finish();
                    }
                });

                choose2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getBaseContext(),MainActivity.class).putExtra("User","olduser"));
                        finish();
                    }
                });

                choose3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Date date = new Date();
                        Timestamp ts=new Timestamp(date.getTime());
                        formatter= new SimpleDateFormat("dd-MM-yyyy");
                        userTimeStamp=formatter.format(ts);
                        userSecurityKey=root.push().getKey();

                        userAuthintication.saveUserinfo(userTimeStamp,userSecurityKey);


                        startActivity(new Intent(getBaseContext(),MainActivity.class).putExtra("User","newUser"));
                        finish();
                    }
                });

                dialog.setCancelable(false);
                dialog.show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        splashRL.startAnimation(fadeinAnimation);
    }
}
