package com.example.ivan.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bAdd = (Button) findViewById(R.id.bAdd);
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getSupportFragmentManager().findFragmentById(R.id.fragmentContainer)==null){

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragmentContainer,new FirstFragment())
                        .commit();
            }else{

                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(getSupportFragmentManager().findFragmentById(R.id.fragmentContainer))
                            .commit();
                }

            }
        });
    }
}
