package com.example.android.ex5_addlistanddetail;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.NavUtils;
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
public class ListClass extends AppCompatActivity {

    TextView tvname;
    TextView tvteam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lcdetail);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);//뒤로가기 버튼

        init();
    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //NavUtils.navigateUpFromSameTask(this); //뒤로가기 버튼을 눌렀을때 이전의 기록이 지워지지않게 보존한다.
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
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

//        android.view.MenuItem item = null;
//        this.onOptionsItemSelected(item);

    }

}
