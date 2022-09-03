package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View) {
                Intent numbersIntent = new Intent(MainActivity.this, Number.class);
                startActivity(numbersIntent);
            }
            });


            TextView Family = (TextView) findViewById(R.id.family);
       Family.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View View) {
                    Intent familyIntent = new Intent(MainActivity.this, Family.class);
                    startActivity(familyIntent);
                }
                });


                TextView Colors = (TextView) findViewById(R.id.colors);
                Colors.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View View) {
                        Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                        startActivity(colorsIntent);
                    }
                });

        TextView Phrases = (TextView) findViewById(R.id.phrases);
        Phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View) {
                Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(phrasesIntent);
            }
        });

    }

    public void openNumberList(View View) {
        Intent i = new Intent(this, Numbers.class);
        startActivity(i);
    }
}