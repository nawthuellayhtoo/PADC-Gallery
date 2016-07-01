package com.example.android.padc_gallery.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.padc_gallery.PADC_GalleryApp;
import com.example.android.padc_gallery.R;
import com.example.android.padc_gallery.adapters.YoutShinAdpater;
import com.example.android.padc_gallery.data.vos.YoutShinVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nawthuellay on 30/06/2016.
 */
public class YoutShinFragment extends Fragment {
    private RecyclerView youtShinRecyclerView;
    private RecyclerView.Adapter youtShinAdapter;
    private RecyclerView.LayoutManager youtShinLayoutManager;
    private List<YoutShinVO> youtShinVOs;
    YoutShinVO youtShinVO;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_youtshin, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_youtshin);
        rv.setHasFixedSize(true);
        Context context = PADC_GalleryApp.getContext();
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rv.setLayoutManager(llm);
        youtShinVO = new YoutShinVO();
        youtShinVOs = youtShinVO.getYoutShinVOList();
        YoutShinAdpater adapter = new YoutShinAdpater(youtShinVOs);
        rv.setAdapter(adapter);
        return view;
    }
}
