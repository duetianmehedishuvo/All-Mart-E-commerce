package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;

import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    public static String USER_TIME_STAMP="TIME_STAMP";
    public static String USER_SECURITY_KEY="SECURITY_KEY";


    private DrawerLayout drawerLayout;
    private LinearLayout line,bajarListLL;
    private Toolbar toolbar;
    private Animation moveAnimation;
    private ImageView confectioneryIV,cosmeticIV,crockeriesIV,drinkDesertIV,electronicsIV,fishMeatIV,fruitsVegitableIV,groceryIV,kidsToysIV,medicineIV;
    private UserAuthintication userAuthintication;

    private ImageView studyToolsBTN,snacksBTN,gasBTN,quranBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerlayout);
        bajarListLL=findViewById(R.id.bajar_listLL);
        line=findViewById(R.id.line);
        toolbar=findViewById(R.id.toolBar);
        NavigationView navigationView=findViewById(R.id.navigationView);
        setSupportActionBar(toolbar);
        Window window=getWindow();
        confectioneryIV=findViewById(R.id.confectioneryIV);
        cosmeticIV=findViewById(R.id.cosmeticsIV);
        crockeriesIV=findViewById(R.id.crockeriesIV);
        drinkDesertIV=findViewById(R.id.drinkDessertIV);
        electronicsIV=findViewById(R.id.electronicsIV);
        fishMeatIV=findViewById(R.id.fishMeatIV);
        fruitsVegitableIV=findViewById(R.id.fruitsVegitableIV);
        groceryIV=findViewById(R.id.groceryIV);
        kidsToysIV=findViewById(R.id.kidsToolsIV);
        medicineIV=findViewById(R.id.medicineIV);

        studyToolsBTN=findViewById(R.id.StudyToolsBTN);
        snacksBTN=findViewById(R.id.snacksBTN);
        gasBTN=findViewById(R.id.gasBTN);
        quranBtn=findViewById(R.id.quranBTN);


        userAuthintication=new UserAuthintication(this);


        moveAnimation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.SOFT_INPUT_MASK_ADJUST);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_navigation_drawer,R.string.close_navigation_drawer){
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                float sidebar=drawerView.getWidth()*slideOffset;
                line.setTranslationX(sidebar);
            }
        };

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                    case R.id.action_live_comments:
                        startActivity(new Intent(MainActivity.this,CommentsActivity.class));
                        break;
                    case R.id.action_today_shop:
                        startActivity(new Intent(MainActivity.this,ShopListActivity.class));
                        break;
                    case R.id.action_terms_condition:
                            openTermsandCondition();
                        break;
                    case R.id.action_kivabe_bajar_korbo:
                            kivabeBazarKorben();
                        break;
                    case R.id.action_avout_us:
                        startActivity(new Intent(MainActivity.this,AboutUsActivity.class));
                        break;
                    case R.id.action_developer:
                        startActivity(new Intent(MainActivity.this,AboutDeveloperActivity.class));
                        break;
                }
                return false;
            }
        });

        bajarListLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ShopListActivity.class));
            }
        });


        confectioneryIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Confectionary").putExtra("name","Confectionery"));
                confectioneryIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });


        cosmeticIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","cosmetic Product").putExtra("name","Cosmetics"));
                cosmeticIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        crockeriesIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Crockeries").putExtra("name","Crockeries"));
                crockeriesIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        drinkDesertIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Drinks-Dessert").putExtra("name","Drink and Desert"));
                drinkDesertIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        electronicsIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Electronics").putExtra("name","Electronics"));
                electronicsIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        fishMeatIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Fish-Meat").putExtra("name","Fish and Meat"));
                fishMeatIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        fruitsVegitableIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Fruits-Vegitable").putExtra("name","Fruits and Vegetable"));
                fruitsVegitableIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        groceryIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Grocery").putExtra("name","Grocery"));
                groceryIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        kidsToysIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Upcoming Feathers", Toast.LENGTH_SHORT).show();
            }
        });

        medicineIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Medicine").putExtra("name","Medicine"));
                medicineIV.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

        studyToolsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Study Tools").putExtra("name","Study Tools"));
                studyToolsBTN.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });
        snacksBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Snacks").putExtra("name","Snacks"));
                snacksBTN.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });
        gasBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Gas").putExtra("name","Gas"));
                gasBTN.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });
        quranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductAddBTNClickActivity.class)
                        .putExtra("product_key","Quran Hadis").putExtra("name","Quran and Hadis"));
                quranBtn.startAnimation(moveAnimation);
                Log.e("MainActivity", "timeStamp     "+userAuthintication.getTimeStamp()+"\nkey    "+userAuthintication.getDeviceKey() );
            }
        });

    }

    private void kivabeBazarKorben() {
        BottomSheetDialog dialog=new BottomSheetDialog(this);
        View view=getLayoutInflater().inflate(R.layout.kivabe_bajar_korben,null);
        dialog.setContentView(view);
        dialog.show();
    }

    private void openTermsandCondition() {
        BottomSheetDialog dialog=new BottomSheetDialog(this);
        View view=getLayoutInflater().inflate(R.layout.terms_condition,null);
        dialog.setContentView(view);
        dialog.show();
    }

    @Override
    public void onBackPressed() {

        final Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.exit_option);
        Button yesBTN=dialog.findViewById(R.id.yesBTN);
        Button noBTN=dialog.findViewById(R.id.noBTN);

        yesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        noBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
