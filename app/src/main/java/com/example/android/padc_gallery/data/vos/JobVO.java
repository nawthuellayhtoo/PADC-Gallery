package com.example.android.padc_gallery.data.vos;

import android.content.Context;

import com.example.android.padc_gallery.PADC_GalleryApp;
import com.example.android.padc_gallery.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nawthuellay on 01/07/2016.
 */
public class JobVO
{
    long id;
    private int jobPhotoId;
    private String jobPost;
    private String jobCompany;
    private String jobCountry;

    private List<JobVO> jobVOList;

    public JobVO(){
        initializeData();
    }
    JobVO(int jobPhotoId, String jobPost, String jobCompany, String jobCountry) {
        this.jobPhotoId = jobPhotoId;
        this.jobPost = jobPost;
        this.jobCompany = jobCompany;
        this.jobCountry = jobCountry;
    }

    private void initializeData() {
        Context context = PADC_GalleryApp.getContext();
        jobVOList = new ArrayList<>();
        jobVOList.add(new JobVO(R.drawable.job1, context.getString(R.string.jobsearch_post1), context.getString(R.string.jobsearch_company1),context.getString(R.string.jobsearch_country)));
        jobVOList.add(new JobVO(R.drawable.job2, context.getString(R.string.jobsearch_post2), context.getString(R.string.jobsearch_company2),context.getString(R.string.jobsearch_country)));
        jobVOList.add(new JobVO(R.drawable.job3, context.getString(R.string.jobsearch_post1), context.getString(R.string.jobsearch_company1),context.getString(R.string.jobsearch_country)));
        jobVOList.add(new JobVO(R.drawable.job4, context.getString(R.string.jobsearch_post2), context.getString(R.string.jobsearch_company2),context.getString(R.string.jobsearch_country)));
        jobVOList.add(new JobVO(R.drawable.job3, context.getString(R.string.jobsearch_post1), context.getString(R.string.jobsearch_company1),context.getString(R.string.jobsearch_country)));
        jobVOList.add(new JobVO(R.drawable.job4, context.getString(R.string.jobsearch_post2), context.getString(R.string.jobsearch_company2),context.getString(R.string.jobsearch_country)));
    }
    public long getId() {
        return id;
    }
    public int getJobPhotoId() {
        return jobPhotoId;
    }

    public String getJobPost() {
        return jobPost;
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public String getJobCountry() {
        return jobCountry;
    }

    public List<JobVO> getJobVOList() {
        return jobVOList;
    }
}
