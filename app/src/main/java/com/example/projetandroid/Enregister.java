package com.example.projetandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Enregister extends AppCompatActivity {


    private EditText numero;
    private EditText email;
    private EditText nom;
    private EditText hashtag;
    private  ContactBDD contactBDD;
    private TextView listecontact;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);




        numero=findViewById(
                R.id.numero
        );


       Button boutton=findViewById(R.id.monboutton);
        email=findViewById(R.id.email);
       hashtag  =findViewById(R.id.hashtag);
        listecontact=findViewById(R.id.listecontact);

        contactBDD = new ContactBDD(this);



        boutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if(contactBDD.insertContact(nom.getText().toString(), numero.getText().toString(),email.getText().toString(),hashtag.getText().toString())){
                    Toast.makeText(getApplicationContext(), "ENREGISTRER AVEC SUCCESS",
                            Toast.LENGTH_SHORT).show();
                }



            }
        });

        listecontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Enregister.this, MainActivity.class);
                Enregister.this.startActivity(myIntent);

            }
        });










    }
}
