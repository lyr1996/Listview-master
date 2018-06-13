package com.example.dell_.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private ArrayList<Map<String,String>> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.list);
        datalist=new ArrayList<Map<String,String>>();
        simpleAdapter=new SimpleAdapter(this,getData(),R.layout.items,new String[]{"one","two"},new int[]{R.id.item1,R.id.item2});
        listView.setAdapter(simpleAdapter);
    }
    private ArrayList<Map<String,String>> getData(){
        for(int i=0;i<10;i++){
            Map<String,String> map=new HashMap<String, String>();
            map.put("one","事件"+i+"");
            map.put("two",i+9+"");
            datalist.add(map);
        }
        return datalist;
    }
}
