package com.tusu.santoecomerch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tusu.santoecomerch.Pojo_Class.Comments;
import com.tusu.santoecomerch.R;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.MyViewHolder> {

    private Context context;
    private List<Comments> comments;

    public CommentsAdapter(Context context, List<Comments> comments) {
        this.context = context;
        this.comments = comments;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.comments_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameTV.setText(comments.get(position).getName());
        holder.AddressTV.setText(comments.get(position).getAddress());
        holder.comentsTV.setText(comments.get(position).getComents());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        protected TextView nameTV,AddressTV,comentsTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV=itemView.findViewById(R.id.commentsNameTV);
            AddressTV=itemView.findViewById(R.id.commentsAddressTV);
            comentsTV=itemView.findViewById(R.id.commentsTV);
        }
    }
}
