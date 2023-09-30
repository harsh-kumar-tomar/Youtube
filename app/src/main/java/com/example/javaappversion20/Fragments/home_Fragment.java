package com.example.javaappversion20.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javaappversion20.Adapters.VideoAdapter;
import com.example.javaappversion20.Models.videoModel;
import com.example.javaappversion20.R;

import java.util.ArrayList;


public class home_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        RecyclerView recyclerView;
        VideoAdapter adapter;
        ArrayList<videoModel> DataList = new ArrayList<>();

        DataList.add(new videoModel(R.drawable.darlinginthefranxx ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "50K" , "10 days ago"));
        DataList.add(new videoModel(R.drawable.deathnote ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "150K" , "14 days ago"));
        DataList.add(new videoModel(R.drawable.demonslayer ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "520K" , "16 days ago"));
        DataList.add(new videoModel(R.drawable.konosuba ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "510K" , "12 days ago"));
        DataList.add(new videoModel(R.drawable.rentagirlfriend ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "10K" , "16 days ago"));
        DataList.add(new videoModel(R.drawable.relife ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "150K" , "17 days ago"));
//        DataList.add(new videoModel(R.drawable.space ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "510K" , "18 days ago"));
        DataList.add(new videoModel(R.drawable.journeyofelaina ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "5K" , "18 days ago"));
        DataList.add(new videoModel(R.drawable.rentagirlfriend ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "1K" , "19 days ago"));
        DataList.add(new videoModel(R.drawable.darlinginthefranxx ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "30K" , "17 days ago"));
        DataList.add(new videoModel(R.drawable.demonslayer ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "60K" , "2 days ago"));
        DataList.add(new videoModel(R.drawable.konosuba ,"2:12", R.drawable.aries , "Review of Anime" , "Aries Spring" , "70K" , "1 day ago"));



        adapter = new VideoAdapter(getContext() , DataList );

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);



        return view;
    }
}