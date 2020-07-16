package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jiakaiyang.lib.SpannableTextView;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;
import com.tusu.santoecomerch.Adapter.ProductShopAdapter;
import com.tusu.santoecomerch.Pojo_Class.Payment;
import com.tusu.santoecomerch.Pojo_Class.Products;

import java.util.ArrayList;
import java.util.List;

import static com.tusu.santoecomerch.MainActivity.USER_SECURITY_KEY;
import static com.tusu.santoecomerch.MainActivity.USER_TIME_STAMP;

public class PaymentActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView totalPriceTV,nameET,locationET,mobileNumberET,tranictionNumberET;
    private String adressAutoCompleteTV;
    private AutoCompleteTextView actv;
    private Button bkashBTN,cashOnBTN,dbblBTN,cardBTN,paymentKnowMyINFOBTN,paymentLIKEFACEBOOKBTN;
    private SpannableTextView paymethod_showTV;

    private String name="",iuniyon="",address="",mobile="",paymentMethod="bkash",tranistionID="";
    private String totalPrice;
    private List<Products> products=new ArrayList<>();
    private DatabaseReference paymentRoot,orderRoot;
    private Animation boundsAnimations;
    private UserAuthintication userAuthintication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        totalPriceTV=toolbar.findViewById(R.id.toolprice);

        nameET=findViewById(R.id.payment_nameET);
        locationET=findViewById(R.id.paymenAddressET);
        mobileNumberET=findViewById(R.id.paymentMobileET);
        tranictionNumberET=findViewById(R.id.paymentTranictionNumberET);
        bkashBTN=findViewById(R.id.bkashBTN);
        cashOnBTN=findViewById(R.id.cashonBTN);
        paymethod_showTV=findViewById(R.id.paymethod_showTV);
        boundsAnimations= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bound2);
        paymentKnowMyINFOBTN=findViewById(R.id.paymentKnowMyINFOBTN);
        paymentLIKEFACEBOOKBTN=findViewById(R.id.paymentLIKEFACEBOOKBTN);
        userAuthintication=new UserAuthintication(this);

        paymentRoot= FirebaseDatabase.getInstance().getReference("Payment").child(userAuthintication.getTimeStamp());
        orderRoot= FirebaseDatabase.getInstance().getReference("Order_now").child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey());


        orderRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProducts=d.getValue(Products.class);

                    String keyName=allProducts.getProductNameKey();
                    String aName=allProducts.getProductName();
                    int aCount=allProducts.getCount();
                    int aCurrentPrice=allProducts.getCurrentPrice();
                    int aProductCountPrice=allProducts.getProductCountPrice();
                    String aQuentityShow=allProducts.getQuentityShow();
                    String aUpdatePrice=allProducts.getUpdatePrice();
                    String productImages=allProducts.getImageUrl();

                    String productNameKey; String productName1; String updatePrice1; String quentityShow1; int currentPrice; int count1; int productCountPrice;

                    products.add(new Products(keyName,aName,aUpdatePrice,aQuentityShow,aCurrentPrice,aCount,aProductCountPrice,productImages));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        totalPrice=getIntent().getStringExtra("total_price");
        totalPriceTV.setText(totalPrice+" ৳");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, getResources().getStringArray(R.array.village_suggestions));

        actv = (AutoCompleteTextView) findViewById(R.id.paymentAutocompleteTV);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                adressAutoCompleteTV=actv.getText().toString();
                Toast.makeText(PaymentActivity.this, ""+adressAutoCompleteTV, Toast.LENGTH_SHORT).show();

            }
        });

        bkashBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bkashBTN.startAnimation(boundsAnimations);
                paymentMethod="bkash";
                Dialog dialog=new Dialog(PaymentActivity.this);
                dialog.setContentView(R.layout.payment_method_show);
                TextView methodName=dialog.findViewById(R.id.patmentMethodTV);
                TextView methodDescription=dialog.findViewById(R.id.patmentMethodDescriptionTV);
                methodName.setText("বিকাশের মাধ্যমে মূল্য পরিশোধ করার নিয়মঃ");
                methodDescription.setText("step 1: Dial *247#" +
                        "\nstep 2:Select option 1(Send Money)" +
                        "\nstep 3: Enter this Number (+8801711130560)" +
                        "\nstep 4:Enter Amount" +
                        "\nstep 5:Enter Reference like(1234)" +
                        "\nstep6:Enter Your Pin number" +
                        "\nstep 7:Copy Tranistion number and Paste Below Box.");
                dialog.show();
                tranictionNumberET.setVisibility(View.VISIBLE);
            }
        });

        cashOnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cashOnBTN.startAnimation(boundsAnimations);
                paymentMethod="Cash On";
                tranictionNumberET.setVisibility(View.GONE);
            }
        });


        paymentKnowMyINFOBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paymentKnowMyINFOBTN.startAnimation(boundsAnimations);
                startActivity(new Intent(PaymentActivity.this,AboutUsActivity.class));
            }
        });
    }

    public void order_now(View view) {

        if (nameET.getText().toString().isEmpty()){
            nameET.setError("Fill in the blank must");
        }else if (actv.getText().toString().isEmpty()){
            actv.setError("Fill in the blank must");
        }else if (mobileNumberET.getText().toString().isEmpty()){
            mobileNumberET.setError("Fill in the blank must");
        }else {

            try {

                name=nameET.getText().toString();
                iuniyon=actv.getText().toString();
                address=locationET.getText().toString();
                mobile=mobileNumberET.getText().toString();
                tranistionID=tranictionNumberET.getText().toString();

                Payment payment=new Payment(name,iuniyon,address,mobile,paymentMethod,tranistionID);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("Products").setValue(products);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("payment").setValue(payment);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("Total Price").setValue(totalPrice);

                Toast.makeText(this, "Success Add Payment Method", Toast.LENGTH_SHORT).show();

                String key=name+"("+mobile+")";

                startActivity(new Intent(PaymentActivity.this,ReportActivity.class)
                        .putExtra("key",key));


            }catch (RuntimeException e){

                name=nameET.getText().toString();
                iuniyon=actv.getText().toString();
                address=locationET.getText().toString();
                mobile=mobileNumberET.getText().toString();


                Payment payment=new Payment(name,iuniyon,address,mobile,paymentMethod);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("Products").setValue(products);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("payment").setValue(payment);
                paymentRoot.child(name+"("+mobile+")").child(userAuthintication.getDeviceKey()).child("Total Price").setValue(totalPrice);

                Toast.makeText(this, "Success Add Payment Method", Toast.LENGTH_SHORT).show();

                String key=name+"("+mobile+")";

                startActivity(new Intent(PaymentActivity.this,ReportActivity.class)
                        .putExtra("key",key));


            }

            nameET.setText("");
            actv.setText("");
            locationET.setText("");
            mobileNumberET.setText("");
            tranictionNumberET.setText("");


        }

    }

    public void know_my_details(View view) {

    }

    public void likeFacebook(View view) {

        Intent openURL = new Intent(android.content.Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://web.facebook.com/All-Martcom-111210340562232/?ref=bookmarks&_rdc=1&_rdr"));
        startActivity(openURL);
    }
}
