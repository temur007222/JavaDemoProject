package com.example.javademoproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javademoproject.Model.User;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initViews();
    }
    void initViews(){
        TextView tv_detail = findViewById(R.id.tv_detail);
       User user = (User) getIntent().getSerializableExtra("user".toString());
        Log.d(TAG,user.toString());

        tv_detail.setText(user.toString());
    }
}
