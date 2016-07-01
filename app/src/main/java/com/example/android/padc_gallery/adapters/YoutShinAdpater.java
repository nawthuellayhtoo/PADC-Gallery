package com.example.android.padc_gallery.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.android.padc_gallery.R;
import com.example.android.padc_gallery.data.vos.YoutShinVO;

import java.util.List;

/**
 * Created by nawthuellay on 30/06/2016.
 */
public class YoutShinAdpater extends RecyclerView.Adapter<YoutShinAdpater.YoutShinViewHolder> {

    public static class YoutShinViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView theatre;
        TextView moviePlace;
        TextView movieTime;
        ImageButton btnLink;
        ImageButton btnPhone;

        YoutShinViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_youtshin);
            theatre = (TextView) itemView.findViewById(R.id.tv_youtshin_title);
            moviePlace = (TextView) itemView.findViewById(R.id.tv_movie_place);
            movieTime = (TextView) itemView.findViewById(R.id.tv_movie_time);
            btnLink = (ImageButton) itemView.findViewById(R.id.img_link);
            btnPhone = (ImageButton) itemView.findViewById(R.id.img_phone);

        }
    }

    List<YoutShinVO> youtShinVOs;

    public YoutShinAdpater(List<YoutShinVO> youtShinVOs) {

        this.youtShinVOs = youtShinVOs;
    }

    @Override
    public int getItemCount() {
        return youtShinVOs.size();
    }

    @Override
    public YoutShinViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.youtshin_card_layout, viewGroup, false);
        YoutShinViewHolder pvh = new YoutShinViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(YoutShinViewHolder youtShinViewHolder, int i) {
        youtShinViewHolder.theatre.setText(youtShinVOs.get(i).getTvtheatre());
        youtShinViewHolder.moviePlace.setText(youtShinVOs.get(i).getTvmoviePlace());
        youtShinViewHolder.movieTime.setText(youtShinVOs.get(i).getTvmovieTime());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
