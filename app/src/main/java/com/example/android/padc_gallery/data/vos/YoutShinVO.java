package com.example.android.padc_gallery.data.vos;

import android.content.Context;

import com.example.android.padc_gallery.PADC_GalleryApp;
import com.example.android.padc_gallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nawthuellay on 01/07/2016.
 */
public class YoutShinVO {
    private String tvtheatre;
    private String tvmoviePlace;
    private String tvmovieTime;

    private List<YoutShinVO> YoutShinVOList;

    public YoutShinVO() {
        initializeData();
    }

    YoutShinVO(String theatre, String moviePlace, String movieTime) {
        this.tvtheatre = theatre;
        this.tvmoviePlace = moviePlace;
        this.tvmovieTime = movieTime;
    }

    private void initializeData() {
        Context context = PADC_GalleryApp.getContext();
        YoutShinVOList = new ArrayList<>();
        YoutShinVOList.add(new YoutShinVO(context.getString(R.string.youtshin_movie1), context.getString(R.string.youtshin_place), context.getString(R.string.youtshin_time)));
        YoutShinVOList.add(new YoutShinVO(context.getString(R.string.youtshin_movie1), context.getString(R.string.youtshin_place), context.getString(R.string.youtshin_time)));
        YoutShinVOList.add(new YoutShinVO(context.getString(R.string.youtshin_movie1), context.getString(R.string.youtshin_place), context.getString(R.string.youtshin_time)));
    }

    public String getTvmoviePlace() {
        return tvmoviePlace;
    }

    public String getTvmovieTime() {
        return tvmovieTime;
    }

    public String getTvtheatre() {

        return tvtheatre;
    }

    public List<YoutShinVO> getYoutShinVOList() {
        return YoutShinVOList;
    }
}
