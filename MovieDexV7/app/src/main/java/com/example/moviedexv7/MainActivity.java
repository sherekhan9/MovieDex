package com.example.moviedexv7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemenu);

        configureADDButton();
        configureSEARCHButton();
    }

    private void configureADDButton(){

        Button addMovieButton = (Button) findViewById(R.id.GoToAdd);
        addMovieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAddMovieActivity();
            }
            private void startAddMovieActivity() {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });

    }
    private void configureSEARCHButton(){
            Button searchMovieButton = (Button) findViewById(R.id.GoToSearch);
            searchMovieButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                    startActivity(intent);
                }
            });


        };


    }






