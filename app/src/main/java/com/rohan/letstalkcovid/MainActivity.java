package com.rohan.letstalkcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView statsImageView=findViewById(R.id.stats);
        statsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Statistics.class);
                startActivity(intent);
            }
        });

        ImageView masksImageView=findViewById(R.id.masksImage);
        masksImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MaskHelp.class);
                startActivity(intent);
            }
        });

        ImageView coronaVirusImageView=findViewById(R.id.coronavirusImageView);
        coronaVirusImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CoronaVirus.class);
                startActivity(intent);
            }
        });

        ImageView preventionImageView=findViewById(R.id.coronavirusImageView);
        preventionImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CoronaVirus.class);
                startActivity(intent);
            }
        });

        ImageView faqView=findViewById(R.id.faqView);
        faqView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),FAQ.class);
                startActivity(intent);
            }
        });

        ImageView aboutImageView=findViewById(R.id.aboutImageView);
        aboutImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),About.class);
                startActivity(intent);
            }
        });
    }
}
