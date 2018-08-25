package my.jmdevelopers.com.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import my.jmdevelopers.com.cardview.R;
import my.jmdevelopers.com.cardview.model.Postagem;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyviewHolder>{
    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> listapostagemm) {
        this.postagens=listapostagemm;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemlista= LayoutInflater.from(parent.getContext()).inflate(R.layout.postagemdetalhe,parent,false);
        return new MyviewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        Postagem postagem = postagens.get(position);

        holder.nome.setText(postagem.getNome());
        holder.descricao.setText(postagem.getDescricao());
        holder.imagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{
        private TextView nome;
        private TextView descricao;
        private ImageView imagem;


        public MyviewHolder(View itemView) {
            super(itemView);
            nome=itemView.findViewById(R.id.tituloID);
            descricao=itemView.findViewById(R.id.descricaoID);
            imagem=itemView.findViewById(R.id.imagemID);
        }
    }
}
