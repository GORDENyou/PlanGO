package com.plango.gordenyou.plango;

import android.os.Bundle;
import android.widget.Button;

public class PlanSActivity extends BaseActivity {

    private Button btn_year;
    private Button btn_month;
    private Button btn_week;
    private Button btn_day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plans);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_plans);

        btn_year = findViewById(R.id.btn_year);
        btn_month = findViewById(R.id.btn_month);
        btn_week = findViewById(R.id.btn_week);
        btn_day = findViewById(R.id.btn_day);
    }

    @Override
    protected void loadData() {

    }
}
