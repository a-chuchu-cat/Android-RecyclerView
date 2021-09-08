package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Huoying> huoyingList;
    private RecyclerView recyclerView;
    private HuoYingAdapter huoYingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        huoyingList = new ArrayList<>(7);
        huoyingList.add(new Huoying(1, "千手柱间", "木遁"));
        huoyingList.add(new Huoying(2, "千手扉间", "水遁"));
        huoyingList.add(new Huoying(3, "猿飞日斩", "猿魔"));
        huoyingList.add(new Huoying(4, "波风水门", "飞雷神"));
        huoyingList.add(new Huoying(5, "千手纲手", "百豪之术"));
        huoyingList.add(new Huoying(6, "旗木卡卡西", "雷切"));
        huoyingList.add(new Huoying(7, "漩涡鸣人", "螺旋丸"));

        recyclerView=findViewById(R.id.recycle_view);
        huoYingAdapter=new HuoYingAdapter(huoyingList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(huoYingAdapter);

    }
}