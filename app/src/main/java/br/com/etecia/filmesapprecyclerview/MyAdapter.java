package br.com.etecia.filmesapprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context mContext;
    private List<Filmes> dadosFilmes;

    public MyAdapter(Context mContext, List<Filmes> dadosFilmes) {
        this.mContext = mContext;
        this.dadosFilmes = dadosFilmes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.modelo_filmes,parent,true);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tituloFilme.setText(dadosFilmes.get(position).getTitulo());
        holder.imagemFilme.setImageResource(dadosFilmes.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return dadosFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tituloFilme;
        ImageView imagemFilme;
        CardView cardFilme;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tituloFilme = itemView.findViewById(R.id.lblTitulo);
            imagemFilme = itemView.findViewById(R.id.imgLivro);
            cardFilme = itemView.findViewById(R.id.idCardFilme);

        }
    }
}
