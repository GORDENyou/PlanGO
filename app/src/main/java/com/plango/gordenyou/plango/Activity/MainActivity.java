package com.plango.gordenyou.plango.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;

import com.plango.gordenyou.plango.Adapter.FragmentAdapter;
import com.plango.gordenyou.plango.Fragment.FindFragment;
import com.plango.gordenyou.plango.Fragment.HomeFragment;
import com.plango.gordenyou.plango.Fragment.PlanFragment;
import com.plango.gordenyou.plango.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Gordenyou on 2017/12/26.
 */

public class MainActivity extends BaseActivity {

    private ViewPager mViewpager;
    private BottomNavigationView mBottom;
    private static final String TAG = "MainActivity";
    private MenuItem mMenuitem;


    @Override
    protected void initVariables() {


    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        mViewpager = findViewById(R.id.main_viewpager);
        mBottom = findViewById(R.id.main_bottom);

        android.support.v4.app.FragmentManager fg = getSupportFragmentManager();
        List<Fragment> list = new ArrayList<>();
        PlanFragment pf = new PlanFragment();
        FindFragment ff = new FindFragment();
        HomeFragment hf = new HomeFragment();
        list.add(pf);
        list.add(ff);
        list.add(hf);
        final FragmentAdapter fragmentAdapter = new FragmentAdapter(fg, list);
        mViewpager.setAdapter(fragmentAdapter);

        mViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

                mMenuitem = mBottom.getMenu().getItem(position);
                mMenuitem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.d(TAG, "onNavigationItemSelected: " + item.getItemId());
                int fragmentid = 0;
                switch (item.getItemId()) {
                    case R.id.item_plan:
                        fragmentid = 0;
                        break;
                    case R.id.item_find:
                        fragmentid = 1;
                        break;
                    case R.id.item_home:
                        fragmentid = 2;
                        break;
                }
                mViewpager.setCurrentItem(fragmentid);
                return true;
            }
        });
    }

    @Override
    protected void loadData() {

    }
}
