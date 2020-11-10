package com.example.foody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {

    private TabLayout mTapLayout;
    private ViewPager mViewPager;


    TextView thong_bao,logout;
    ImageButton btnsystem;
    Button btnsave,btnhome,btnlist,btnnotification,btnperson;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        mTapLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);


        btnsave = (Button) findViewById(R.id.tab_save);
        btnhome = (Button) findViewById(R.id.tab_home);
        btnlist = (Button) findViewById(R.id.tab_list);
        btnperson = (Button) findViewById(R.id.tab_person);
        btnnotification = (Button) findViewById(R.id.tab_notification);
        btnsystem = (ImageButton) findViewById(R.id.btnimgsystem);
        //Listview
        lv = (ListView) findViewById(R.id.list_foods);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","10p"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.now, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));

        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);



        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_home();
            }
        });
        btnnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_notification();
            }
        });
        btnsystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_system();
            }
        });
    }

    void xml_system(){
        Intent intent = new Intent(Notification.this,System.class);
        this.startActivity(intent);
    }
    void xml_home(){
        Intent intent = new Intent(this,Home.class);
        this.startActivity(intent);
    }
    void xml_notification(){
        Intent intent = new Intent(this,Notification.class);
        this.startActivity(intent);
    }
}