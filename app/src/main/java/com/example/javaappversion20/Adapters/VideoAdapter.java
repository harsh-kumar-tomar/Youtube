package com.example.javaappversion20.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javaappversion20.Models.videoModel;
import com.example.javaappversion20.R;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {
    private final Context context;
    private ArrayList<videoModel> DataList;

    public VideoAdapter(Context context, ArrayList<videoModel> dataList) {
        this.context = context;
        DataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_adapter_view , parent , false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        videoModel tempDataList = DataList.get(position);

        holder.imgVideo.setImageResource(tempDataList.getImgVideo());
        holder.lengthVideo.setText(tempDataList.getLengthVideo());
        holder.channelVideo.setImageResource(tempDataList.getChannelVideo());
        holder.TitleVideo.setText(tempDataList.getTitleVideo());
        holder.NameVideo.setText(tempDataList.getNameVideo());
        holder.ViewsVideo.setText(tempDataList.getViewsVideo());
        holder.PeriodVideo.setText(tempDataList.getPeriodVideo());

    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgVideo;
        TextView lengthVideo;
        ImageView channelVideo;
        TextView TitleVideo;
        TextView NameVideo;
        TextView ViewsVideo;
        TextView PeriodVideo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

             imgVideo = itemView.findViewById(R.id.imageVideo);
             lengthVideo = itemView.findViewById(R.id.lengthVideo);
             channelVideo = itemView.findViewById(R.id.channelVideo);
             TitleVideo = itemView.findViewById(R.id.titleVideo);
            NameVideo = itemView.findViewById(R.id.channelNameVideo);
            ViewsVideo = itemView.findViewById(R.id.viewsVideo);
            PeriodVideo = itemView.findViewById(R.id.periodVideo);



        }
    }
}
