package com.tusu.santoecomerch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.tusu.santoecomerch.Aauthentication.UserAuthintication;
import com.tusu.santoecomerch.Adapter.ProductAdapter;
import com.tusu.santoecomerch.Adapter.ProductShopAdapter;
import com.tusu.santoecomerch.InterfaceClass.ProductAddBTNInterface;
import com.tusu.santoecomerch.InterfaceClass.ProductMINUSBTNInterface;
import com.tusu.santoecomerch.Pojo_Class.Products;

import java.util.ArrayList;
import java.util.List;

public class ProductAddBTNClickActivity extends AppCompatActivity implements ProductAddBTNInterface, ProductMINUSBTNInterface {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Products> products=new ArrayList<>();
    private List<Products> productsTotalSum=new ArrayList<>();
    private DatabaseReference productRoot,userChooseRoot;
    private MaterialSearchView searchView;
    private Toolbar toolbar;
    private CardView cardView;
    private TextView totalPriceTV;
    private Animation bounchanimation;
    private UserAuthintication userAuthintication;
    private TextView toolname;
    private LinearLayout orderNowLL;


    private DatabaseReference totalPriceRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_click);
        recyclerView=findViewById(R.id.recyClerView);
        cardView=findViewById(R.id.cardView);
        totalPriceTV=findViewById(R.id.buttom_shit_count_price);
        orderNowLL=findViewById(R.id.orderNowLL);
        userAuthintication=new UserAuthintication(this);

        cardView.setVisibility(View.GONE);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        toolname=toolbar.findViewById(R.id.toolname);

        searchViewCode();
        bounchanimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

        String product_key=getIntent().getStringExtra("product_key");
        toolname.setText(getIntent().getStringExtra("name"));
        productRoot= FirebaseDatabase.getInstance().getReference("Products").child(product_key);
        userChooseRoot= FirebaseDatabase.getInstance().getReference("User_Choose_product");

        totalPriceRoot= FirebaseDatabase.getInstance().getReference("User_Choose_product").child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey());


        adapter=new ProductAdapter(products,this,this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        productRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProducts=d.getValue(Products.class);
                    products.add(allProducts);

                    adapter=new ProductAdapter(products, ProductAddBTNClickActivity.this, ProductAddBTNClickActivity.this,ProductAddBTNClickActivity.this);
                    recyclerView.setLayoutManager(new LinearLayoutManager(ProductAddBTNClickActivity.this,LinearLayoutManager.VERTICAL,false));
                    recyclerView.setAdapter(adapter);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        orderNowLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductAddBTNClickActivity.this,ShopListActivity.class));
            }
        });


    }

    private void searchViewCode() {
        searchView = (MaterialSearchView) findViewById(R.id.searchView);
        searchView.setHint("Enter Product Name.....");
        //searchView.setSuggestions(getResources().getStringArray(R.array.query_suggestions));

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                newText = newText.toLowerCase();
                ArrayList<Products> newList = new ArrayList<>();
                for (Products searchProduct: products){
                    String channelName = searchProduct.getProductName().toLowerCase();
                    String channelKeyName = searchProduct.getProductNameKey().toLowerCase();
                    if (channelName.contains(newText)||channelKeyName.contains(newText)){
                        newList.add(searchProduct);
                    }
                }
                adapter.setFilter(newList);
                return true;
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

        int count=desertNumber;
        int totalPrice= (int) (price*count);

        String productImages=product.getImageUrl();
        Products saveUserChooseProducts=new Products(productKey,productName,updatePrice,quentityShow,price,count,totalPrice,productImages);
        userChooseRoot.child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey()).child(productKey).setValue(saveUserChooseProducts);
        totalPriceTV.startAnimation(bounchanimation);

        cardView.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Name: "+productName+"\nPrice"+totalPrice, Toast.LENGTH_SHORT).show();

        totalPriceRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                productsTotalSum.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProducts=d.getValue(Products.class);
                    productsTotalSum.add(allProducts);

                    int intotalPrice=0;
                    for (int i=0;i<productsTotalSum.size();i++){
                        intotalPrice=intotalPrice+productsTotalSum.get(i).getProductCountPrice();
                    }
                    totalPriceTV.setText(String.valueOf(intotalPrice)+" ৳");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user_menu, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_shop:
                startActivity(new Intent(ProductAddBTNClickActivity.this,ShopListActivity.class));
                break;
        }

        return super.onOptionsItemSelected(item);
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
        int count=desertNumber;
        int totalPrice= (int) (price*count);
        String productImages=product.getImageUrl();


        String productNameKey; String productName1; String updatePrice1; String quentityShow1; int currentPrice; int count1; int productCountPrice; String imageUrl ;

        Products saveUserChooseProducts=new Products(productKey,productName,updatePrice,quentityShow,price,count,totalPrice,productImages);

        userChooseRoot.child(userAuthintication.getTimeStamp()).child(userAuthintication.getDeviceKey()).child(productKey).setValue(saveUserChooseProducts);


        totalCountPrice=totalCountPrice+totalPrice;

        Toast.makeText(this, "Name: "+productName+"\nPrice"+totalCountPrice, Toast.LENGTH_SHORT).show();

        cardView.setVisibility(View.VISIBLE);

        totalPriceRoot.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                productsTotalSum.clear();
                for (DataSnapshot d:dataSnapshot.getChildren()){
                    Products allProducts=d.getValue(Products.class);
                    productsTotalSum.add(allProducts);

                    int intotalPrice=0;
                    for (int i=0;i<productsTotalSum.size();i++){
                        intotalPrice=intotalPrice+productsTotalSum.get(i).getProductCountPrice();
                    }
                    totalPriceTV.setText(String.valueOf(intotalPrice)+" ৳");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
