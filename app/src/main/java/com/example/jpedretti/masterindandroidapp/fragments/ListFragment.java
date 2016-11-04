package com.example.jpedretti.masterindandroidapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jpedretti.masterindandroidapp.R;
import com.example.jpedretti.masterindandroidapp.adapter.ListAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<String> data = new ArrayList<>();
        data.add("teste 1");
        data.add("teste 2");
        data.add("teste 2");

        RecyclerView recycler = (RecyclerView) view.findViewById(R.id.recycler);
        recycler.setAdapter(new ListAdapter(data));
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(manager);

        return view;
    }
}
