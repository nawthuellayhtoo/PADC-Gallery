package com.example.android.padc_gallery.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.padc_gallery.R;
import com.example.android.padc_gallery.adapters.JobListAdapter;
import com.example.android.padc_gallery.data.vos.JobVO;

import java.util.List;

/**
 * Created by nawthuellay on 01/07/2016.
 */
public class JobSearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_job_search, container, false);
        JobVO jobVo = new JobVO();
        List<JobVO> jobVOList = jobVo.getJobVOList();

        ListView listView = (ListView) view.findViewById(R.id.lv_job_search_list);
        JobListAdapter adapter= new JobListAdapter(this.getActivity());

        adapter.setJobVOList(jobVOList);
        listView.setAdapter(adapter);

        return view;
    }
}
