package com.example.quentin.partysgame.Model;

import java.util.ArrayList;
import java.util.Collections;

public class JeuxDe32 {

    private ArrayList<Carte> cartes;

    public JeuxDe32() {
        super();
        cartes = new ArrayList<Carte>();
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
                    valeur = "A";
                else
                    valeur = "" + i;
                if (y == 1)
                    couleur = "P";
                else if (y == 2)
                    couleur = "T";
                else if (y == 3)
                    couleur = "C";
                else
                    couleur = "Q";
                cartes.add(new Carte(couleur, valeur));
            }
        }
        Collections.shuffle(cartes);
    }

    public Carte tireUneCarte(){
        Carte uneCarte = cartes.get(0);
        cartes.remove(0);
        return uneCarte;
    }

    public int carteRestante(){
        return cartes.size();
    }
}
