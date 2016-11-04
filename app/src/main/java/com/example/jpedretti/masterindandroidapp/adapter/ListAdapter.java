package com.example.jpedretti.masterindandroidapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpedretti.masterindandroidapp.R;

import java.util.ArrayList;

/**
 * Created by jpedretti on 04/11/2016.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.JobsViewHolder> {

    private ArrayList<String> mMainData;

    public ListAdapter(ArrayList<String> data) {
        mMainData = data;
    }

    @Override
    public ListAdapter.JobsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list, parent, false);

        return new JobsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JobsViewHolder holder, int position) {
        holder.detailText.setText(mMainData.get(position));
    }

    @Override
    public int getItemCount() {
        return mMainData.size();
    }

    public static class JobsViewHolder extends RecyclerView.ViewHolder {

        TextView detailText;

        public JobsViewHolder(View itemView) {
            super(itemView);

            this.detailText = (TextView) itemView.findViewById(R.id.detail_text);
        }
    }
}
