package com.plango.gordenyou.plango.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.plango.gordenyou.plango.R;

import butterknife.ButterKnife;

public class PlanYearFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_year, null);
        ButterKnife.bind(this, view);
        return view;
    }
}
