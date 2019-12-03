package com.example.projetandroid;





import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends  RecyclerView.ViewHolder  {

    private TextView nomContact;
    private int numeroContact;
    private TextView emailContact;
    private View layout;
    private Button effacer;

    public MyHolder(View view) {

        super(view);

        layout = view;

        nomContact= (TextView) view.findViewById(R.id.textView1);

        emailContact= (TextView) view.findViewById(R.id.textView2);
          effacer=view.findViewById(R.id.effacer);


    }

    public TextView getNomTextView() { return nomContact; }
    public TextView getOrigineTextView() { return emailContact; }
    public Button getEffacer() { return effacer; }

    public View getLayout() { return layout; }


}
