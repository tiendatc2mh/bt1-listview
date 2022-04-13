package com.example.listviewthuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        final String[] data ={"Hồ Tây", "Tháp Rùa", "Chùa Một Cột", "Quốc Tử Giám", "Lăng Bác", "Thư Viện QG"};

        ArrayAdapter<String> adapter =new ArrayAdapter<>(MainActivity.this, R.layout.list,R.id.list_content,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,"position: "+
//                        position+" - value: "+data[position],Toast.LENGTH_SHORT
//                ).show();
                // Intent intent = new Intent(MainActivity.this,com.example.explicitintent.Activity2.class);

                Intent intent=new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);



                intent.putExtra("index",position);

                startActivity(intent);
            }
        });
    }
}