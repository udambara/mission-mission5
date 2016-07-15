package com.example.android.ex5_addlistanddetail;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by Krivnon on 2016-07-15.
 */
public class ListClass extends ActionBarActivity {

    TextView tvname;
    TextView tvteam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lcdetail);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        init();
    }

    void init(){
        tvname = (TextView)findViewById(R.id.listname);
        tvteam = (TextView)findViewById(R.id.listteam);
        //이전 페이지에서 넘어온 값 처리
        Intent i = getIntent();
        //각각 name과 team이라는 이름으로 보냈으므로 각각 받아줌
        String rcvname = i.getStringExtra("name");
        String rcvteam = i.getStringExtra("team");
        this.setTitle(rcvname);
        tvname.setText(rcvname);
        tvteam.setText(rcvteam);

        android.view.MenuItem item = null;
        this.onOptionsItemSelected(item);

    }

}
