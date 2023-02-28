package com.example.moviedexv7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemenu);


        configureADDButton();
        configureSEARCHButton();
    }

    private void configureADDButton() {

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

    private void configureSEARCHButton() {
        Button searchMovieButton = (Button) findViewById(R.id.GoToSearch);

        searchMovieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivityMain.class);
                startActivity(intent);
            }
        });
    }

    ;
}






