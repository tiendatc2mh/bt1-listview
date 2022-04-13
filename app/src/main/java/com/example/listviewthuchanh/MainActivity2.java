package com.example.listviewthuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgView;
    TextView txtDienTich, txtDanSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtDanSo= findViewById(R.id.txtDanSo);
        txtDienTich= findViewById(R.id.txtDienTich);
        imgView = findViewById(R.id.imgView);

        Intent intent=getIntent();

        int index =intent.getIntExtra("index",-1);
        int danso = 0;
        float dientich = 0;
        switch (index)
        {
            case 0:
                danso=1000000;
                dientich=123456;
                break;
            case 1:
                danso=123456;
                dientich=234567;
                break;
        }
        txtDanSo.setText("Dân sô: "+danso);
        txtDienTich.setText("Diện tích: "+dientich);
        //Toast.makeText(MainActivity2.this,index+"",Toast.LENGTH_SHORT).show();
    }
}