package com.example.quentin.partysgame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FuckTheQuennActivity extends AppCompatActivity {

    private Button tirCarteButton;
    private TextView consigneTextView;
    private JeuxDe32 unJeux;
    private ImageButton afficherCarteTire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuck_the_quenn);
        unJeux = new JeuxDe32();
        afficherCarteTire = findViewById(R.id.afficheCartButton);
        consigneTextView = findViewById(R.id.ConsigneTextView);
        tirCarteButton = findViewById(R.id.TirCarteButton);
        tirCarteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Carte carteTire = unJeux.tireUneCarte();
                if (carteTire.valeur.equals("7")) {
                    consigneTextView.setText("Consigne : Le joueur peut à n'import quelle moment du jeux faire un signe distinctif. Le dernier joueur a le reproduire devrat boire une corgé.");
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                }
                if (carteTire.valeur.equals("8")) {
                    consigneTextView.setText("Consigne : Le joueur doit donner un thème puis donner un mot qui convient au thème. Ensuite c'est a chacun des joueur d'en donner un. Le premier joueur qui na plus d'idée ou qui redis un mot dejas dit devrat boire une gorgé.");
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                }
                if (carteTire.valeur.equals("9")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : Le joueur peut aller au toilette ou faire une petite pose a n'importe quel momment de la partie");
                }
                if (carteTire.valeur.equals("10")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : Quand le joueur commence a boire, tout les autre joueur commence a boire également. Le joueur ayant tiré a carte peut s'arreter a n'importe qu'elle moment. Les autre joueur eu ne peuvent pas s'arretez tant que leur voisin de droite ne c'est pas arreté");
                }
                if (carteTire.valeur.equals("V")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : Le joueur qui tiré la carte doit dire \"Dans ma valise il y a\" suivie d'un mot de son choix. Les autres joueurs doivent a tour de roles redir ce quil a été dit précédament et ajouté un nouveau mot dans la valise. Le joueur qui ce trompe ou oublie un mot doit boire une gorgé");
                }
                if (carteTire.valeur.equals("D")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : Tout les joueur doivent dire \"Fuck the queen\" et boire une gorgé en l'honneur de la reinne.");
                }
                if (carteTire.valeur.equals("R")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : ");
                }
                if (carteTire.valeur.equals("As")) {
                    afficherCarteTire.setImageResource(imageCarteTire(carteTire));
                    consigneTextView.setText("Consigne : Le joueur qui a tiré la carte doit boire une gorgé tout seul.");
                }
            }
        });
    }

    public int imageCarteTire(Carte carteTire) {
        Log.i("montest", carteTire.couleur + " " + carteTire.valeur);
        if (carteTire.couleur.equals("Q")) {
            if (carteTire.valeur.equals("7")) {
                return R.drawable.sept_pique;
            }else if (carteTire.valeur.equals("8")) {
                return R.drawable.huit_coeur;
            } else if (carteTire.valeur.equals("9")) {
                return R.drawable.neuf_coeur;
            } else if (carteTire.valeur.equals("10")) {
                return R.drawable.dix_coeur;
            } else if (carteTire.valeur.equals("V")) {
                return R.drawable.valet_coeur;
            } else if (carteTire.valeur.equals("D")) {
                return R.drawable.dame_coeur;
            } else if (carteTire.valeur.equals("R")) {
                return R.drawable.roi_coeur;
            } else {
                return R.drawable.as_coeur;
            }

        } else if (carteTire.couleur.equals("C")) {
            if (carteTire.valeur.equals("7")) {
                return R.drawable.sept_careau;
            } else if (carteTire.valeur.equals("8")) {
                return R.drawable.huit_careau;
            } else if (carteTire.valeur.equals("9")) {
                return R.drawable.neuf_careau;
            } else if (carteTire.valeur.equals("10")) {
                return R.drawable.dix_careau;
            } else if (carteTire.valeur.equals("V")) {
                return R.drawable.valet_careau;
            } else if (carteTire.valeur.equals("D")) {
                return R.drawable.dame_careau;
            } else if (carteTire.valeur.equals("R")) {
                return R.drawable.roi_careau;
            } else {
                return R.drawable.as_careau;
            }
        } else if (carteTire.couleur.equals("T")) {
            if (carteTire.valeur.equals("7")) {
                return R.drawable.sept_trefle;
            } else if (carteTire.valeur.equals("8")) {
                return R.drawable.huit_trefle;
            } else if (carteTire.valeur.equals("9")) {
                return R.drawable.neuf_trefle;
            } else if (carteTire.valeur.equals("10")) {
                return R.drawable.dix_trefle;
            } else if (carteTire.valeur.equals("V")) {
                return R.drawable.valet_trefle;
            } else if (carteTire.valeur.equals("D")) {
                return R.drawable.dame_trefle;
            } else if (carteTire.valeur.equals("R")) {
                return R.drawable.roi_trefle;
            } else {
                return R.drawable.as_trefle;
            }
        } else {
            if (carteTire.valeur.equals("7")) {
                return R.drawable.sept_pique;
            } else if (carteTire.valeur.equals("8")) {
                return R.drawable.huit_pique;
            } else if (carteTire.valeur.equals("9")) {
                return R.drawable.neuf_pique;
            } else if (carteTire.valeur.equals("10")) {
                return R.drawable.dix_pique;
            } else if (carteTire.valeur.equals("V")) {
                return R.drawable.valet_pique;
            } else if (carteTire.valeur.equals("D")) {
                return R.drawable.dame_pique;
            } else if (carteTire.valeur.equals("R")) {
                return R.drawable.roi_pique;
            } else {
                return R.drawable.as_pique;
            }
        }
    }
}
