package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button button1;
    String m_id = "dfd";
    String m_pass = "1234";
    String input1="", input2 = "";
    TextView text1;
    ImageView logo1;
    int logo_flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.setContentView(R.layout.activity_menu);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        button1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.text1);
        logo1 = findViewById(R.id.logo1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1 = edit1.getText().toString();
                input2 = edit2.getText().toString();
                if (input1.equals(m_id) && input2.equals(m_pass)) {
                    Intent intent = new Intent(MainActivity.this,ItemActivity.class);
                    intent.putExtra("myId", m_id);
                    startActivity(intent);
//                    finish();
                    text1.setText("로그인");
                } else {
                    text1.setText("실패");
                }
            }
        });
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage(logo_flag);
                logo_flag ++;

            }
        });


    }
    void changeImage(int flag){
        if (flag == 1){
            logo1.setImageResource(R.drawable.a);
        }
        else if (flag == 2){
            logo1.setImageResource(R.drawable.b);
        }
        else if (flag == 3){
            logo1.setImageResource(R.drawable.c);
        }
        else{
            logo_flag = 0;
            logo1.setImageResource(R.drawable.logo);
        }

    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"빠이빠이",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}