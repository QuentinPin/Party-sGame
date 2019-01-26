package com.example.quentin.partysgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FuckTheQuennActivity extends AppCompatActivity {

    private Button tirCarteButton;
    private TextView test;
    private JeuxDe32 unJeux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuck_the_quenn);
        unJeux = new JeuxDe32();
        Log.i("quentin", "unun");
        test = findViewById(R.id.affiche);
        tirCarteButton = findViewById(R.id.TirCarteButton);
        tirCarteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.setText(test.getText() + " " + unJeux.tireUneCarte().couleur + unJeux.tireUneCarte().valeur);
            }
        });
    }
}
