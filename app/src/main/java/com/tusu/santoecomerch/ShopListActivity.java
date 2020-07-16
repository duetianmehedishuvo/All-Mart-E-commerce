package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;
import com.tusu.santoecomerch.Adapter.ProductAdapter;
import com.tusu.santoecomerch.Adapter.ProductShopAdapter;
import com.tusu.santoecomerch.InterfaceClass.ProductAddBTNInterface;
import com.tusu.santoecomerch.InterfaceClass.ProductMINUSBTNInterface;
import com.tusu.santoecomerch.Pojo_Class.Products;

import java.util.ArrayList;
import java.util.List;

import static com.tusu.santoecomerch.MainActivity.USER_SECURITY_KEY;
import static com.tusu.santoecomerch.MainActivity.USER_TIME_STAMP;

public class ShopListActivity extends AppCompatActivity implements ProductAddBTNInterface, ProductMINUSBTNInterface {

    private DatabaseReference shopRoot,orderNowRoot;
    private List<Products> products=new ArrayList<>();
    private List<Products> orderProductsNow=new ArrayList<>();
    private List<String> productNameKey=new ArrayList<>();
    private ProductShopAdapter adapter;
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private TextView buttomShitCurrentPrice,totalCurrentPriceTV,totalMoneyTV;
    private LinearLayout orderPriceLL;
    private Animation boundsAnimation;
    private UserAuthintication userAuthintication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        recyclerView=findViewById(R.id.recyClerView);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));

        totalCurrentPriceTV=toolbar.findViewById(R.id.toolprice);
        buttomShitCurrentPrice=findViewById(R.id.buttom_shit_count_price);
        totalMoneyTV=findViewById(R.id.totalMoneyTV);
        orderPriceLL=findViewById(R.id.orderPage);
        userAuthintication=new UserAuthintication(this);

        boundsAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

        shopRoot= FirebaseDatabase.getInstance().getReference("User_Choose_product").child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey());

        orderNowRoot= FirebaseDatabase.getInstance().getReference("Order_now").child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey());

        adapter=new ProductShopAdapter(products,this,this,this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        shopRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();
                orderProductsNow.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProducts=d.getValue(Products.class);
                    products.add(allProducts);
                    orderProductsNow.add(allProducts);

                    productNameKey.add(allProducts.getProductNameKey());

                    adapter=new ProductShopAdapter(products, ShopListActivity.this, ShopListActivity.this,ShopListActivity.this);
                    recyclerView.setLayoutManager(new LinearLayoutManager(ShopListActivity.this,LinearLayoutManager.VERTICAL,false));
                    recyclerView.setAdapter(adapter);

                    int intotalPrice=0,productPrice=0;
                    for (int i=0;i<products.size();i++){
                        intotalPrice=intotalPrice+products.get(i).getProductCountPrice();
                    }

                    productPrice=intotalPrice;

                    if (intotalPrice>0&&intotalPrice<200){
                        intotalPrice=intotalPrice+20;
                        buttomShitCurrentPrice.setText(String.valueOf(productPrice)+" ৳ + 20 ৳");
                        totalCurrentPriceTV.setText(String.valueOf(intotalPrice)+" ৳");
                        totalMoneyTV.setText(String.valueOf(intotalPrice));
                    }else if (intotalPrice>=200&&intotalPrice<400){
                        intotalPrice=intotalPrice+30;
                        buttomShitCurrentPrice.setText(String.valueOf(productPrice)+" ৳ + 30 ৳");
                        totalCurrentPriceTV.setText(String.valueOf(intotalPrice)+" ৳");
                        totalMoneyTV.setText(String.valueOf(intotalPrice));
                    }else {
                        intotalPrice=intotalPrice+40;
                        buttomShitCurrentPrice.setText(String.valueOf(productPrice)+" ৳+ 40 ৳");
                        totalCurrentPriceTV.setText(String.valueOf(intotalPrice)+" ৳");
                        totalMoneyTV.setText(String.valueOf(intotalPrice));
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



        orderPriceLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                orderPriceLL.startAnimation(boundsAnimation);

                    orderNowRoot.setValue(orderProductsNow, new DatabaseReference.CompletionListener() {
                        @Override
                        public void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference databaseReference) {
                            Toast.makeText(ShopListActivity.this, "Please Create Payment Option.", Toast.LENGTH_SHORT).show();
                        }
                    });
                    //orderNowRoot.child("Total_price").setValue(totalMoneyTV.getText().toString());

                    startActivity(new Intent(ShopListActivity.this,PaymentActivity.class)
                            .putExtra("total_price",totalMoneyTV.getText().toString()));

            }
        });


    }

    @Override
    public void onItemClick(int position, int desertNumber) {

        int totalCountPrice=0;
        Products product=products.get(position);
        Log.e("Demo", "Product Name: "+product.getProductName()+"\nDesert Number: "+desertNumber );

        String productName=product.getProductName();
        String productKey=product.getProductNameKey();
        String updatePrice=product.getUpdatePrice();
        int price=product.getCurrentPrice();
        String quentityShow=product.getQuentityShow();
        double quentity=product.getQuentity();
        int count=desertNumber;
        int totalPrice= (int) (price*count);
        String productImages=product.getImageUrl();

        String productNameKey; String productName1; String updatePrice1; String quentityShow1; int currentPrice; int count1; int productCountPrice; double quentity1 ;

        Products saveUserChooseProducts=new Products(productKey,productName,updatePrice,quentityShow,price,count,totalPrice,productImages);

        shopRoot.child(productKey).setValue(saveUserChooseProducts);

        totalCountPrice=totalCountPrice+totalPrice;


    }

    @Override
    public void onMinusItemClick(int position, int desertNumber) {
        int totalCountPrice=0;
        Products product=products.get(position);
        Log.e("Demo", "Product Name: "+product.getProductName()+"\nDesert Number: "+desertNumber );

        String productName=product.getProductName();
        String productKey=product.getProductNameKey();
        String updatePrice=product.getUpdatePrice();
        int price=product.getCurrentPrice();
        String quentityShow=product.getQuentityShow();
        double quentity=product.getQuentity();
        int count=desertNumber;
        int totalPrice= (int) (price*count);
        String productImages=product.getImageUrl();

        String productNameKey; String productName1; String updatePrice1; String quentityShow1; int currentPrice; int count1; int productCountPrice; double quentity1 ;

        Products saveUserChooseProducts=new Products(productKey,productName,updatePrice,quentityShow,price,count,totalPrice,productImages);

        shopRoot.child(productKey).setValue(saveUserChooseProducts);

    }
}
