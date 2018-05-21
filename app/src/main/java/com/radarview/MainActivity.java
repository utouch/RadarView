package com.radarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.library.RadarData;
import com.library.RadarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RadarView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.radarView);
        viewById.setData(getData(),10);
        viewById.setNum(5);
    }

    private List<RadarData> getData(){
        List<RadarData> data = new ArrayList<>();
        data.add(new RadarData("助攻",10));
        data.add(new RadarData("生存",6));
        data.add(new RadarData("击杀",4));
        data.add(new RadarData("金钱",8));
        data.add(new RadarData("防御",7));
        data.add(new RadarData("魔法",9));
        data.add(new RadarData("物理",3));
        return data;
    }
}
