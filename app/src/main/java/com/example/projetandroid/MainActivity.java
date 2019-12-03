package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText numero;
    private EditText email;
    private EditText nom;
    private Button boutton;

    private TextView mesrecherche;
    private EditText tapesearch;
    private Button button2;
    private  Button effacer;
    ContactBDD contactBDD;
    Contact livreFromBdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
     /*   tapesearch=findViewById(R.id.search);
        mesrecherche=findViewById(R.id.result);



System.out.println("je cherche les bug1 ");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("je cherche les bug2 ");
                Toast.makeText(MainActivity.this, "ca marche impeu", Toast.LENGTH_LONG).show();
                Contact contact= new Contact("doffou","bonsoir");
                Contact contact2= new Contact("yapi","kouassi");
                contactBDD.insertContact(contact);
                contactBDD.insertContact(contact2);

               contactBDD= new ContactBDD(MainActivity.this);
                contactBDD.open();
                livreFromBdd=   contactBDD.getAllContact();

                mesrecherche.setText(livreFromBdd.getNumeroContact());
q            }
        });*/


















/*


        numero=findViewById(
                R.id.numero
        );


        boutton=findViewById(R.id.button4);
        email=findViewById(R.id.email);
        nom=findViewById(R.id.nom);

        contactBDD = new ContactBDD(MainActivity.this);
        contactBDD.open();

        boutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact= new Contact(nom.getText().toString(), numero.getText().toString());


                contactBDD.insertContact(contact);
                Contact livreFromBdd = contactBDD.getContactWithNom("doffou");
                Contact Allbd= contactBDD.getAllContact();
                System.out.println(livreFromBdd.getNomContact());
                System.out.println(livreFromBdd.getNumeroContact());

                System.out.println(Allbd);
            }
        });





        //Création d'un livre


//On ouvre la base de données pour écrire dedans
        contactBDD.open();
        //On insère le livre que l'on vient de créer


        System.out.println("creation de la bd");



//On extrait le livre de la BDD grâce au nouveau titre

        //S'il existe un livre possédant ce titre dans la BDD











*/                      effacer=findViewById(R.id.effacer);
                    boutton=findViewById(R.id.button3);

                    boutton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {



                            Intent myIntent = new Intent(MainActivity.this, Enregister.class);
                            MainActivity.this.startActivity(myIntent);
                        }
                    });













        contactBDD = new ContactBDD(this);

        ;
        ArrayList contact_list = contactBDD.getAllCotacts();
        System.out.println(contact_list);





        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter mAdapter = new MonAdapter(contact_list);
        recyclerView.setAdapter(mAdapter);
        ((MonAdapter) mAdapter).setListener(new RecyclerItemListener<Contact>() {
                                                @Override
                                                public void oncliklistener(Contact Item) {
                                                    Toast.makeText(MainActivity.this, "ca marche", Toast.LENGTH_SHORT).show();

                                                    Toast.makeText(MainActivity.this,Item.toString(),Toast.LENGTH_LONG).show();

                                                    System.out.println(Item);
                                                }
                                            });







    }
}
