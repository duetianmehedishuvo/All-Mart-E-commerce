package com.tusu.santoecomerch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tusu.santoecomerch.Pojo_Class.Products;
import com.tusu.santoecomerch.R;

import java.util.List;

public class ReportRowAdapter extends RecyclerView.Adapter<ReportRowAdapter.MyViewolder> {

    private Context context;
    private List<Products> products;

    public ReportRowAdapter(Context context, List<Products> products) {
        this.context = context;
        this.products = products;
    }



    @NonNull
    @Override
    public MyViewolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.report_row,parent,false);
        return new MyViewolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewolder holder, int position) {

        holder.productName.setText(products.get(position).getProductName());
        holder.productPrice.setText(String.valueOf(products.get(position).getProductCountPrice())+" ৳");
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewolder extends RecyclerView.ViewHolder {

        protected TextView productName,productPrice;

        public MyViewolder(@NonNull View itemView) {
            super(itemView);

            productName=itemView.findViewById(R.id.reportProductName);
            productPrice=itemView.findViewById(R.id.reportProductPrice);
        }
    }
}
