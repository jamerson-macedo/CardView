package my.jmdevelopers.com.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import my.jmdevelopers.com.cardview.R;
import my.jmdevelopers.com.cardview.adapter.PostagemAdapter;
import my.jmdevelopers.com.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPostagem;
    private List<Postagem> postagem=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewPostagem=findViewById(R.id.recyclerViewID);
        // definir layout
        LinearLayoutManager layoutManager=new  LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        //RecyclerView.LayoutManager layoutManager= new GridLayoutManager(this,2);

                recyclerViewPostagem.setLayoutManager(layoutManager);
        this.prepararpostagem();
        // adapter
        PostagemAdapter adapter = new PostagemAdapter(postagem);
        recyclerViewPostagem.setAdapter(adapter);
    }

    public void prepararpostagem(){
        Postagem p = new Postagem("jamerson macedo","viagem legal", R.drawable.imagem1);
        this.postagem.add(p);
        p = new Postagem("maria","ola mundo", R.drawable.imagem2);
        this.postagem.add(p);
        p = new Postagem("josefa","iae", R.drawable.imagem3);
        this.postagem.add(p);
        p = new Postagem("jose","foto boa", R.drawable.imagem4);
        this.postagem.add(p);


    }
}
