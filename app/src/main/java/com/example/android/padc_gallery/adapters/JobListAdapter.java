package com.example.android.padc_gallery.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.padc_gallery.R;
import com.example.android.padc_gallery.data.vos.JobVO;

import java.util.List;

/**
 * Created by nawthuellay on 01/07/2016.
 */
public class JobListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;
    List<JobVO> jobVOList;

    public JobListAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setJobVOList(List<JobVO> jobVOList){
        this.jobVOList = jobVOList;
    }

    @Override
    public int getCount() {
        return jobVOList.size();
    }

    @Override
    public long getItemId(int i) {
        return jobVOList.get(i).getId();
    }

    @Override
    public Object getItem(int i) {
        return jobVOList.get(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(R.layout.job_search_item_layout,viewGroup,false);

        ImageView ivJobPhoto = (ImageView) view.findViewById(R.id.iv_job_photo);
        ivJobPhoto.setImageResource(jobVOList.get(i).getJobPhotoId());

        TextView tvJobPost= (TextView) view.findViewById(R.id.tv_jobsearch_post);
        tvJobPost.setText(jobVOList.get(i).getJobPost());

        TextView tvJobCompany= (TextView) view.findViewById(R.id.tv_jobsearch_company);
        tvJobCompany.setText(jobVOList.get(i).getJobCompany());

        TextView tvJobCountry= (TextView) view.findViewById(R.id.tv_jobsearch_country);
        tvJobCountry.setText(jobVOList.get(i).getJobCountry());

        return view;
    }
}
