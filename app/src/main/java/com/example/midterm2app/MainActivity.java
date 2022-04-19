package com.example.midterm2app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String weatherWebserviceURL = "http://api.openweathermap.org/data/2.5/weather?q=London,tn&appid=6f932cc63869dc33defa3617abd482ed&units=metric";

        TextView temperature, description;
        JSONObject jsonObj;
        Button btnS = (Button) findViewById(R.id.btnS);
        temperature = (TextView) findViewById(R.id.temperature);
        description = (TextView) findViewById(R.id.description);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DataDisplayactual.class);
                startActivity(intent);
            }
        });{


        }




    }
}
