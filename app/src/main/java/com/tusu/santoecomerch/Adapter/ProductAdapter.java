package com.tusu.santoecomerch.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.tusu.santoecomerch.InterfaceClass.ProductMINUSBTNInterface;
import com.tusu.santoecomerch.Pojo_Class.Products;
import com.tusu.santoecomerch.InterfaceClass.ProductAddBTNInterface;
import com.tusu.santoecomerch.R;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private List<Products> products;
    private Context context;
    private ProductAddBTNInterface productAddBTNInterface;
    private ProductMINUSBTNInterface productMINUSBTNInterface;
    private Animation boundsAnimation;


    public void setFilter(List<Products> newList){
        products = new ArrayList<>();
        products.addAll(newList);
        notifyDataSetChanged();
    }

    public ProductAdapter(List<Products> products, Context context, ProductAddBTNInterface productAddBTNInterface,ProductMINUSBTNInterface productMINUSBTNInterface) {
        this.products = products;
        this.context = context;
        this.productAddBTNInterface = productAddBTNInterface;
        this.productMINUSBTNInterface=productMINUSBTNInterface;
        boundsAnimation= AnimationUtils.loadAnimation(context,R.anim.move);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.product_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.productName.setText(products.get(position).getProductName());
        if (products.get(position).getLastPrice().equals("0")){
            holder.productLastPrice.setText("");
        }else {
            holder.productLastPrice.setText(products.get(position).getLastPrice()+" ৳");
        }
        holder.productCurrentPrice.setText(products.get(position).getUpdatePrice()+" ৳");
        holder.productQuentity.setText(products.get(position).getQuentityShow());
        Picasso.with(context).load(Uri.parse(products.get(position).getImageUrl())).into(holder.productIV);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        protected ImageView productIV;
        protected ImageButton plusBTN,minusBTN;
        protected TextView productName,productLastPrice,productCurrentPrice,productQuentity,productCount;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            productIV=itemView.findViewById(R.id.productIV);
            plusBTN=itemView.findViewById(R.id.product_addBTN);
            minusBTN=itemView.findViewById(R.id.product_DOWNBTN);
            productName=itemView.findViewById(R.id.product_name);
            productLastPrice=itemView.findViewById(R.id.product_last_price);
            productCurrentPrice=itemView.findViewById(R.id.product_currentPrice);
            productQuentity=itemView.findViewById(R.id.product_quentity);
            productCount=itemView.findViewById(R.id.dessert_number);


            plusBTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    plusBTN.startAnimation(boundsAnimation);

                    if (productAddBTNInterface !=null){
                        int position=getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            int desertNumber=0;
                            String quantityString = productCount.getText().toString();
                            desertNumber = Integer.parseInt(quantityString);
                            desertNumber += 1;
                            productCount.setText(String.valueOf(desertNumber));
                            productAddBTNInterface.onItemClick(position,desertNumber);

                        }
                    }


                }
            });

            minusBTN.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (productAddBTNInterface !=null){
                        int position=getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            int desertNumber=0;
                            String quantityString = productCount.getText().toString();
                            desertNumber = Integer.parseInt(quantityString);
                            desertNumber -= 1;

                            if (desertNumber < 0) {
                                desertNumber = 0;
                                Toast.makeText(context, "Can not be less than 0", Toast.LENGTH_SHORT).show();
                            }
                            productCount.setText(String.valueOf(desertNumber));
                            productMINUSBTNInterface.onMinusItemClick(position,desertNumber);
                        }
                    }
                }
            });

        }
    }
}
