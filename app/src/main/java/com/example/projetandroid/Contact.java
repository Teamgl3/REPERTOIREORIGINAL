package com.example.projetandroid;

public class Contact {



    private int id;
    private  String nomContact;
    String email;
    String hashtag;

    private String NumeroContact;
    public Contact(){}

    public Contact(String nomContact,String NumeroContact,String email,String hashtag){
        this.nomContact = nomContact;

        this.NumeroContact=NumeroContact;
        this.email=email;
        this.hashtag=hashtag;
        id++;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }



    public String getNumeroContact() {
        return NumeroContact;
    }

    public void setNumeroContact(String NumeroContact) {
        this.NumeroContact = NumeroContact;
    }



    public String getEmailContact() {
        return email;
    }

    public void setEmailContact(String email) {
        this.email = email;
    }


    public String gethashtagContact() {
        return hashtag;
    }

    public void sethashtagContact(String hashtag) {
        this.hashtag = hashtag;
    }


    public String toString(){
        return "ID : "+ id+"\nEmail : "+NumeroContact+"\nNom : "+nomContact;
    }










}
