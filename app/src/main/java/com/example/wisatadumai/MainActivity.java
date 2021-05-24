package com.example.wisatadumai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.wisatadumai.adapter.ListWisataAdapter;
import com.example.wisatadumai.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView r_wisata;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_wisata = findViewById(R.id.r_wisata);

        r_wisata.setHasFixedSize(true);

        list.addAll(DataWisata.getListData());
        showRecyclerList();



    }
    private void showRecyclerList(){
        r_wisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list);
        r_wisata.setAdapter(listWisataAdapter);

        listWisataAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata wisata) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailWisata.class);
                moveIntent1.putExtra(DetailWisata.ITEM_EXTRA, wisata);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, KontakActivity.class);
            startActivity(moveIntent);
        }

        return super.onOptionsItemSelected(item);
    }



}
