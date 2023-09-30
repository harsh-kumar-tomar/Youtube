package com.example.javaappversion20.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javaappversion20.Adapters.ChannelRoundAdapter;
import com.example.javaappversion20.Adapters.VideoAdapter;
import com.example.javaappversion20.Models.subscriptionRoundModel;
import com.example.javaappversion20.Models.videoModel;
import com.example.javaappversion20.R;

import java.util.ArrayList;

public class subscription_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_subscription_, container, false);

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




        RecyclerView rvSubscriptionLogoList = view.findViewById(R.id.rvSubscriptionLogoList);
        ArrayList<subscriptionRoundModel> dataList ;
        dataList = new ArrayList<>();
        dataList.add(new subscriptionRoundModel(R.drawable.technical_guruji , "India"));
        dataList.add(new subscriptionRoundModel(R.drawable.anirudh , "UK"));
        dataList.add(new subscriptionRoundModel(R.drawable.dhirendra , "Japan"));
        dataList.add(new subscriptionRoundModel(R.drawable.nisha_madulika , "America"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon4 , "China"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon5 , "Sri Lanka"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon , "India"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon1 , "UK"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon2 , "Japan"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon3 , "America"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon4 , "China"));
        dataList.add(new subscriptionRoundModel(R.drawable.small_icon5 , "Sri Lanka"));

        ChannelRoundAdapter stories_adapter = new ChannelRoundAdapter(getContext() , dataList);
//        rvSubscriptionLogoList.setNestedScrollingEnabled(false);
        rvSubscriptionLogoList.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));
        rvSubscriptionLogoList.setAdapter(stories_adapter);







        return view;
    }
}