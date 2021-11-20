package com.example.restarurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public MainActivity getThis() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button table1 = (Button) findViewById(R.id.button);

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Pop.class));
            }
        });

        ImageButton addButton = (ImageButton) findViewById(R.id.imageButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button myButton = new Button(getThis());
                myButton.setText("Press Me");
                LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
                layout.addView(myButton);

            }
        });

    }


}