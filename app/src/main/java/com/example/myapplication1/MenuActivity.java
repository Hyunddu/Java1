package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {
//    TextView menu_text1;
    String id;
    TextView menu_count1;
    Button menu_plus1;
    Button menu_minus1;
    TextView menu_price1;
    TextView menu_count2;
    Button menu_plus2;
    Button menu_minus2;
    TextView menu_price2;
    TextView menu_count3;
    Button menu_plus3;
    Button menu_minus3;
    TextView menu_price3;
    TextView menu_count4;
    Button menu_plus4;
    Button menu_minus4;
    TextView menu_price4;

    TextView total_price;

    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int total = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        menu_plus1 = findViewById(R.id.menu_plus1);
        menu_minus1 = findViewById(R.id.menu_minus1);
        menu_count1 = findViewById(R.id.menu_count1);
        menu_price1 = findViewById(R.id.menu_price1);

        menu_plus2 = findViewById(R.id.menu_plus2);
        menu_minus2 = findViewById(R.id.menu_minus2);
        menu_count2 = findViewById(R.id.menu_count2);
        menu_price2 = findViewById(R.id.menu_price2);

        menu_plus3 = findViewById(R.id.menu_plus3);
        menu_minus3 = findViewById(R.id.menu_minus3);
        menu_count3 = findViewById(R.id.menu_count3);
        menu_price3 = findViewById(R.id.menu_price3);

        menu_plus4 = findViewById(R.id.menu_plus4);
        menu_minus4 = findViewById(R.id.menu_minus4);
        menu_count4 = findViewById(R.id.menu_count4);
        menu_price4 = findViewById(R.id.menu_price4);

        total_price = findViewById(R.id.total_price);
//        menu_text1 = findViewById(R.id.menu_text1);
        getData();

        menu_plus1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count1++;
                menu_count1.setText(Integer.toString(count1));
                menu_price1.setText("가격 : "+(Integer.toString(count1*3000))+"원");

                total += 3000;
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");

            }

        });
        menu_minus1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count1--;
                if (count1 < 0){
                    count1 = 0;
                }
                menu_price1.setText("가격 : "+(Integer.toString(count1*3000))+"원");
                menu_count1.setText(Integer.toString(count1));
                total -= 3000;
                if (total < 0){
                    total = 0;
                }
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");

            }
        });
        menu_plus2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count2++;
                menu_count2.setText(Integer.toString(count2));
                menu_price2.setText("가격 : "+(Integer.toString(count2*4000))+"원");
                total += 4000;
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");

            }
        });
        menu_minus2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count2--;
                if (count2 < 0){
                    count2 = 0;
                }
                menu_price2.setText("가격 : "+(Integer.toString(count2*4000))+"원");
                menu_count2.setText(Integer.toString(count2));
                total -= 4000;
                if (total < 0){
                    total = 0;
                }
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");
            }
        });
        menu_plus3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count3++;
                menu_count3.setText(Integer.toString(count3));
                menu_price3.setText("가격 : "+(Integer.toString(count3*5000))+"원");
                total += 5000;
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");

            }
        });
        menu_minus3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count3--;
                if (count3 < 0){
                    count3 = 0;
                }
                menu_price3.setText("가격 : "+(Integer.toString(count3*5000))+"원");
                menu_count3.setText(Integer.toString(count3));
                total -= 5000;
                if (total < 0){
                    total = 0;
                }
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");
            }
        });
        menu_plus4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count4++;
                menu_count4.setText(Integer.toString(count4));
                menu_price4.setText("가격 : "+(Integer.toString(count4*6000))+"원");
                total += 6000;
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");

            }
        });
        menu_minus4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count4--;
                if (count4 < 0){
                    count4 = 0;
                }
                menu_price4.setText("가격 : "+(Integer.toString(count4*6000))+"원");
                menu_count4.setText(Integer.toString(count4));
                total -= 6000;
                if (total < 0){
                    total = 0;
                }
                total_price.setText("총가격 : "+(Integer.toString(total))+"원");
            }
        });


    }

    void total_cal(){

    }

    //함수 정의 (생성)
    void getData(){
        id = getIntent().getStringExtra("myId");
//        menu_text1.setText(id);
    }
}