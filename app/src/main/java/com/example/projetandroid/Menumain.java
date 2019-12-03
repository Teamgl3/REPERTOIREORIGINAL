package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menumain  extends AppCompatActivity {
 private ImageButton calculetee;
 private ImageButton Repertoire;
 private ImageButton Appell;
 private  ImageButton Apropos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuacceuil);






        calculetee=(ImageButton)findViewById(R.id.calcul);
        Repertoire=findViewById(R.id.repert);
        Appell=findViewById(R.id.appel);
        Apropos=findViewById(R.id.apropos);




    calculetee.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent myIntent = new Intent(Menumain.this, MainActivity.class);
            Menumain.this.startActivity(myIntent);


        }
    });

        Repertoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Menumain.this, Enregister.class);
                Menumain.this.startActivity(myIntent);

            }
        });



        Appell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Menumain.this, Enregister.class);
                Menumain.this.startActivity(myIntent);
            }
        });



    }





}
