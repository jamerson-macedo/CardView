package my.jmdevelopers.com.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyviewHolder>{
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{
        private TextView nome;
        private TextView postagem;
        private ImageView imagem;


        public MyviewHolder(View itemView) {
            super(itemView);
        }
    }
}
