package com.tusu.santoecomerch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutDeveloperActivity extends AppCompatActivity {

    private TextView nameTv,designationTV,teamdescriptionTV,mobileTV,emailTV,facebookTV;
    private ImageButton shuvoIB,rafatIB,tanniIB;
    private Button visionBTN,sologanBTN;
    private CardView visionCV,sologanCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);

        initlizeVariable();
        shuvoIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTv.setText("Md.Mehedi Hasan Shuvo");
                designationTV.setText("Apps Developer");
                mobileTV.setText("+8801303129515");
                emailTV.setText("duetinmehedishuvo@gmail.com");
                facebookTV.setText("https://www.facebook.com/m.mehedihasanshuvo.in");
                rafatIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                tanniIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                shuvoIB.setBackgroundColor(Color.parseColor("#1D0097A7"));
            }
        });

        rafatIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTv.setText("Md.Rafatul Islam");
                designationTV.setText("Graphics Designer");
                mobileTV.setText("+8801811635119");
                emailTV.setText("rafatulislam999@gmail.com");
                facebookTV.setText("https://www.facebook.com/rafatul.islam.549");
                rafatIB.setBackgroundColor(Color.parseColor("#1D0097A7"));
                tanniIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                shuvoIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
            }
        });

        tanniIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTv.setText("Kaniz Fatima");
                designationTV.setText("Informer");
                mobileTV.setText("");
                emailTV.setText("engrkanizfatema@gmail.com");
                facebookTV.setText("");
                rafatIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                tanniIB.setBackgroundColor(Color.parseColor("#1D0097A7"));
                shuvoIB.setBackgroundColor(Color.parseColor("#00FFFFFF"));
            }
        });

        visionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamdescriptionTV.setText("তথ্য ও প্রযুক্তির ব্যবহার সবার হাতে হাতে পোঁছে দেওয়া।");
                visionCV.setCardBackgroundColor(Color.parseColor("#B7512DA8"));
                sologanCV.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                visionBTN.setTextColor(Color.parseColor("#FFFFFF"));
                sologanBTN.setTextColor(Color.parseColor("#000000"));
            }
        });

        sologanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamdescriptionTV.setText("Let Our Family Show Your Family The Way Home");

                visionCV.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                sologanCV.setCardBackgroundColor(Color.parseColor("#B7512DA8"));

                visionBTN.setTextColor(Color.parseColor("#000000"));
                sologanBTN.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
    }

    private void initlizeVariable() {
        nameTv=findViewById(R.id.teampersonNameTV);
        designationTV=findViewById(R.id.teamPersonDesignationTV);
        teamdescriptionTV=findViewById(R.id.teamDescriptionTV);
        mobileTV=findViewById(R.id.teamPersonPhoneTV);
        emailTV=findViewById(R.id.teamPersonEmailTV);
        facebookTV=findViewById(R.id.teamPersonFBTV);
        shuvoIB=findViewById(R.id.teamShuvoIB);
        rafatIB=findViewById(R.id.teamRafatIB);
        tanniIB=findViewById(R.id.teamKanizIB);
        visionBTN=findViewById(R.id.teamOurVisionBTN);
        sologanBTN=findViewById(R.id.teamOurSologanBTN);
        visionCV=findViewById(R.id.cardViewVision);
        sologanCV=findViewById(R.id.cardViewsologan);
    }
}
