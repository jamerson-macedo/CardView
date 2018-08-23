package my.jmdevelopers.com.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import my.jmdevelopers.com.cardview.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewPostagem=findViewById(R.id.recyclerViewID);
        // definir layout
        RecyclerView.LayoutManager layoutManager=new  LinearLayoutManager(this);

        recyclerViewPostagem.setLayoutManager(layoutManager);
        // adapter
        //recyclerViewPostagem.setAdapter();
    }
}
