package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    static TextView item_total;
    GridView grid_View;
    static int total_price = 0;
    String pdt_name[] = {"상품1","상품2","상품3","상품4","상품5","상품6","상품7","상품8","상품9"};
    int pdt_photo[] = {R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.logo};
    int pdt_price[] = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000};
    int pdt_count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_item);

        item_total = findViewById(R.id.item_total);
        grid_View = findViewById(R.id.grid_view);

        item_total.setText("총 가격 : "+addComma(total_price)+"원");

        itemAdapter adapter = new itemAdapter(ItemActivity.this, pdt_name,pdt_photo,pdt_price,pdt_count);
        grid_View.setAdapter(adapter);
    }
    public  String addComma(int number){
        String result = "";
        StringBuffer sb = new StringBuffer();
        result = ""+number;
        sb.append(result);
        if(number < 1000){
        }else if(number < 100000){
            if(number < 10000){
                sb.insert(1,",");
            }else if(number < 100000){
                sb.insert(2,",");
            }else{
                sb.insert(3,",");
            }
        }else if (number<1000000000){
            if(number<10000000){
                sb.insert(4,",");
                sb.insert(1,",");
            }else if(number < 100000000){
                sb.insert(5,",");
                sb.insert(2,",");
            }else{
                sb.insert(6,",");
                sb.insert(3,",");
            }
        }
        return sb.toString();

    }
}