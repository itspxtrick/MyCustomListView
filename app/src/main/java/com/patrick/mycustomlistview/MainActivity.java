package com.patrick.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    int[] logos;
    String[] codeNames, versions, apis, dates;
    ArrayList <AndroidVersion> arrayList;
    CustomAdapter adapter;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndroidVersions = (ListView) findViewById(R.id.lview);
        logos = new int[](R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
                R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ics,
                R.drawable.jelly, R.drawable.kit, R.drawable.lolli, R.drawable.marshmallow, R.drawable.nougat,
                R.drawable.oreo);
        codeNames = getResources().getStringArray(R.array.codename);
        versions = getResources().getStringArray(R.array.version);
        apis = getResources().getStringArray(R.array.api);
        dates = getResources().getStringArray(R.array.release_date);
        arrayList = new ArrayList<AndroidVersion>();
        for (int i = 0; i  < codeNames.length; i++ ) {
            AndroidVersion android = new AndroidVersion(logos[i]), codeNames[i], versions[i], apis[i], dates[i]);
        }
        adapter = new CustomAdapter(this, arrayList);
    }
}
