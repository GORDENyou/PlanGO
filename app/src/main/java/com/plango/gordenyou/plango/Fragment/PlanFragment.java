package com.plango.gordenyou.plango.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.plango.gordenyou.plango.Activity.PlanSActivity;
import com.plango.gordenyou.plango.Adapter.ListAdapter;
import com.plango.gordenyou.plango.Entity.CardItem;
import com.plango.gordenyou.plango.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gordenyou on 2017/12/27.
 */

public class PlanFragment extends Fragment {

    private List<CardItem> list = new ArrayList<>();
    private ListAdapter madapter;

    private ListView lt;
    private Button btn_changeplan;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_plan,null);

        //FirstView(contentView);
        OtherView(contentView);
        return contentView;
    }

    private void OtherView(View contentView) {
        lt = contentView.findViewById(R.id.plan_listview);
        CardItem cardItem = new CardItem();
        cardItem.setTitle("今天的计划");
        list.add(cardItem);
        madapter = new ListAdapter(getContext(), list);
        lt.setAdapter(madapter);
    }

    private void FirstView(View contentView) {
        btn_changeplan = contentView.findViewById(R.id.btn_changeplan);
        btn_changeplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlanSActivity.class);
                startActivity(intent);
            }
        });
    }

    private class PlanAdapter extends BaseAdapter{

        //要绑定的数目的数目，比如格子的数量
        @Override
        public int getCount() {
            return 0;
        }
        //根据一个索引（位置）获取改位置的对象
        @Override
        public Object getItem(int i) {
            return null;
        }
        //获取条目的id
        @Override
        public long getItemId(int i) {
            return 0;
        }
        //获取该条目要显示的界面
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}
