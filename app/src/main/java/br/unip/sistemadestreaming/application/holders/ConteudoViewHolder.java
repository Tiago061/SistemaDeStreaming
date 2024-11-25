package br.unip.sistemadestreaming.application.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ConteudoViewHolder extends RecyclerView.ViewHolder {
    private TextView titulo;
    private TextView tipo;

    public ConteudoViewHolder(@NonNull View itemView) {
        super(itemView);
        titulo = itemView.findViewById(android.R.id.text1);
        tipo = itemView.findViewById(android.R.id.text2);
    }
    public TextView getTitulo() {
        return titulo;
    }

    public TextView getTipo() {
        return tipo;
    }

}
