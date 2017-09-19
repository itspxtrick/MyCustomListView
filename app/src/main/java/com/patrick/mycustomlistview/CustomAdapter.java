package com.patrick.mycustomlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by poros_000 on 9/14/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context ctx;
    ArrayList<AndroidVersion> androidVersions;
    ImageView ivLogo;
    TextView tvCodename, tvVersion, tvApi, tvDate;

    public CustomAdapter(Context ctx, ArrayList<AndroidVersion> androidVersions) {
        this.ctx = ctx;
        this.androidVersions = androidVersions;
    }

    @Override
    public int getCount() {
        return androidVersions.size();
    }

    @Override
    public Object getItem(int i) {
        return androidVersions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(ctx, R.layout.row_layout, null);
        ivLogo = v.findViewById(R.id.iv_logo);
        tvCodename = v.findViewById(R.id.tv_codename);
        tvVersion = v.findViewById(R.id.tv_version);
        tvApi = v.findViewById(R.id.tv_api);
        tvDate = v.findViewById(R.id.tv_date);
        ivLogo.setImageResource(androidVersions.get(i).getLogo());
        tvCodename.setText(androidVersions.get(i).getCodename());
        tvVersion.setText(androidVersions.get(i).getVersion());
        tvApi.setText(androidVersions.get(i).getApi());
        tvDate.setText(androidVersions.get(i).getDate());

        return v;
    }
}
