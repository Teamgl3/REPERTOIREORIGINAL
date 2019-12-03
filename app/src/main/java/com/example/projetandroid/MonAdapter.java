package com.example.projetandroid;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonAdapter extends  RecyclerView.Adapter<MyHolder> {

    private List<Contact> fruits;

    RecyclerItemListener <Contact>listener;
    RecyclerItemListener <Integer>listene2;
    public MonAdapter(List<Contact> donnees) {
        fruits = donnees;
    }


    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.activity_liste, viewGroup, false);
        MyHolder holder = new MyHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        final Contact fruit = fruits.get(i);

        myHolder.getNomTextView().setText("Numero"+fruit.getNomContact());
        System.out.println(fruit.getNomContact());
        myHolder.getOrigineTextView().setText( "Nom"+fruit.getNumeroContact());
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.oncliklistener(fruit);

            }
        });
        myHolder.getEffacer().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 fruit.getId();



                listene2.oncliklistener(fruit.getId());

            }
        });

    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }


    public void add(int position, Contact fruitItem) {
        fruits.add(position, fruitItem);

        notifyItemInserted(position);
        notifyItemRangeChanged(position, fruits.size());
    }

    public void remove(int position) {

        fruits.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, fruits.size());


    }

    public void changerNom(int position, String nouveauNom) {

        fruits.get(position).setNomContact(nouveauNom);
        notifyItemChanged(position);
    }

    public void setListener(RecyclerItemListener listener){
        this.listener =listener;  }

}
