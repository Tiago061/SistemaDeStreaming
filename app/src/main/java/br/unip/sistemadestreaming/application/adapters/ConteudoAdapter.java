package br.unip.sistemadestreaming.application.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.unip.sistemadestreaming.application.Conteudo;
import br.unip.sistemadestreaming.application.holders.ConteudoViewHolder;

public class ConteudoAdapter extends RecyclerView.Adapter<ConteudoViewHolder> {

    private List<Conteudo> conteudos;
    private List<Conteudo> conteudosFiltrados;

    public ConteudoAdapter(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
        this.conteudosFiltrados = new ArrayList<>(conteudos);
    }

    @NonNull
    @Override
    public ConteudoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(android.R.layout.simple_list_item_2,parent, false);
        return new ConteudoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ConteudoViewHolder holder, int position) {
        Conteudo conteudo = conteudosFiltrados.get(position);
        holder.getTitulo().setText(conteudo.getTitulo());
        holder.getTipo().setText(conteudo.getTipo());

    }

    @Override
    public int getItemCount() {
        return conteudosFiltrados.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filter(String query){
        conteudosFiltrados.clear();
        if (query.isEmpty()){
            conteudosFiltrados.addAll(conteudos);
        } else {
            for (Conteudo conteudo : conteudos) {
                if (conteudo.getTitulo().toLowerCase().contains(query.toLowerCase())) {
                    conteudosFiltrados.add(conteudo);
                }
            }
            notifyDataSetChanged();
        }
    }
}
