package com.example.javademoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javademoproject.Model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        Button b_detail = findViewById(R.id.b_detail);
        b_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Temur", 19);
                        OpenDetailActivity(user);
            }
        });
    }
    void OpenDetailActivity(User user){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}