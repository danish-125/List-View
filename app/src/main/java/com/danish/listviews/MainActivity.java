package com.danish.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.text.Transliterator.*;

public class MainActivity extends AppCompatActivity {

    ListView list;
    TextView txtV1;
    String[] festival={"eid mubarak","independance day","defence day","Moharam","23 march"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list_view1);
        txtV1=findViewById(R.id.txtV_1);

        final ArrayAdapter adapter=new ArrayAdapter(this,R.layout.list_view,R.id.txtV_1,festival);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String value="clicked on"+adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();;
            }
        });

    }
}