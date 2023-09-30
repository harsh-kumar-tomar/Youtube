package com.example.javaappversion20.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaappversion20.Models.subscriptionRoundModel;
import com.example.javaappversion20.R;

import java.util.ArrayList;

public class ChannelRoundAdapter extends RecyclerView.Adapter<ChannelRoundAdapter.ViewHolder> {
    Context context ;
    ArrayList<subscriptionRoundModel> dataList;

    public ChannelRoundAdapter(Context context, ArrayList<subscriptionRoundModel> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.adapter_channel_subscription_round , parent , false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.channelImage.setImageResource(dataList.get(position).getChannelImage());
        holder.channelName.setText(dataList.get(position).getChannelName());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView channelImage;
        TextView channelName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            channelImage = itemView.findViewById(R.id.channelLogo);
            channelName = itemView.findViewById(R.id.channelName);

        }
    }
}
