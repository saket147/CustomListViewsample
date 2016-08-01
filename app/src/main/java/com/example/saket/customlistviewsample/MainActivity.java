package com.example.saket.customlistviewsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    Context context;
    TextView textView;
    ListView listView;
    public static int[] programImages={R.drawable.image,R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    public static String[] programNameList={"python","python1","c++","android","javascript","apache"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        textView=(TextView)findViewById(R.id.languages);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(new CustomAdapter(this,programNameList,programImages));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Clicked in Acti",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
