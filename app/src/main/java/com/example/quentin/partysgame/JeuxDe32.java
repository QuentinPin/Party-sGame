package com.example.quentin.partysgame;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class JeuxDe32 {

    private ArrayList<Carte> cartes;
    private int index;

    public JeuxDe32() {
        super();
        cartes = new ArrayList<Carte>();
        this.index = 0;
        String couleur;
        String valeur;
        for (int i = 7; i < 15; i++) {
            for (int y = 1; y < 5 ; y++){
                if (i == 11)
                    valeur = "V";
                else if (i == 12)
                    valeur = "D";
                else if (i == 13)
                    valeur = "R";
                else if (i == 14)
                    valeur = "As";
                else
                    valeur = "" + i;
                if (y == 1)
                    couleur = "Pique";
                else if (y == 2)
                    couleur = "Trefle";
                else if (y == 3)
                    couleur = "Carreau";
                else
                    couleur = "Coeur";
                cartes.add(new Carte(couleur, valeur));
            }
        }
        Collections.shuffle(cartes);
    }

    public Carte tireUneCarte(){
        Carte uneCarte = cartes.get(index);
        index++;
        return uneCarte;
    }
}
