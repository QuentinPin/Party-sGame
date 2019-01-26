package com.example.quentin.partysgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button fuckTheQueenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        fuckTheQueenButton = findViewById(R.id.FuckTheQueenButton);
        fuckTheQueenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fuckTheQueenButtonAction();
            }
        });
    }

    private void fuckTheQueenButtonAction(){
        Intent intent = new Intent(this, FuckTheQuennActivity.class);
        startActivity(intent);
    }
}
