package com.plango.gordenyou.plango;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Gordenyou on 2017/12/25.
 */

public class GoToolbar extends Toolbar {

    private LayoutInflater mInflater;
    private View mView;

    private Button mButton;
    private TextView mTextview;

    public GoToolbar(Context context) {
        super(context);
        setContentInsetsRelative(0,0);
        initView();
    }

    private void initView() {
        mInflater = LayoutInflater.from(getContext());
        mView = mInflater.inflate(R.layout.toolbar, null);

        mTextview = mView.findViewById(R.id.title);
        mButton = mView.findViewById(R.id.btn_back);

        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        addView(mView, lp);
    }

    public GoToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GoToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    @Override
    public void setTitle(CharSequence title) {
        initView();
        if (mTextview != null) {
            mTextview.setText(title);
        }
    }

    public void setLeftButtonIcon(int icon){
        setLeftButtonIcon(getResources().getDrawable(icon));
    }

    public void setLeftButtonIcon(Drawable icon){
        if(mButton != null){
            mButton.setBackground(icon);
        }
    }


}
