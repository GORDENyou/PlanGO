package com.plango.gordenyou.plango;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;


/**
 * Created by Gordenyou on 2017/12/22.
 */

public abstract class BaseActivity extends Activity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //StatebarInvisible();
        initVariables();
        initViews(savedInstanceState);
        loadData();
    }

//    隐藏状态栏
    private void StatebarInvisible() {
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
    }

    //初始化变量
    protected abstract void initVariables();
    //初始化控件
    protected abstract void initViews(Bundle savedInstanceState);
    //获取数据
    protected abstract void loadData();
}
