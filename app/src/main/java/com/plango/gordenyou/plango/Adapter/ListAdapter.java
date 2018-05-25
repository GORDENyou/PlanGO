package com.plango.gordenyou.plango.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.plango.gordenyou.plango.Activity.PlanSActivity;
import com.plango.gordenyou.plango.Entity.CardItem;
import com.plango.gordenyou.plango.R;

import java.util.List;

/**
 * Created by Gordenyou on 2018/1/5.
 */

public class ListAdapter extends BaseAdapter {

    private Context context;
    private List<CardItem> list;
    private Button btn_changeplan;

    public ListAdapter(Context context, List<CardItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            view = View.inflate(context, R.layout.cardview_first, null);

            btn_changeplan = view.findViewById(R.id.btn_changeplan);
            btn_changeplan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PlanSActivity.class);
                    context.startActivity(intent);
                }
            });
            return view;
        }
        ViewHolder holder = null;
        if (view == null || view.getTag() == null) {
            view = View.inflate(context, R.layout.cardview_normal, null);
            holder = new ViewHolder();
            holder.title = view.findViewById(R.id.title);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.title.setText(list.get(i).getTitle());
        return view;
    }

    private class ViewHolder {
        private TextView title;

        private ViewHolder() {
            title = null;
        }
    }

}
