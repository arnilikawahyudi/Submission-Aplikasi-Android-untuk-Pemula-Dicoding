package com.example.wisatadumai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailWisata extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);

        btn_share = findViewById(R.id.btn_set_share);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DetailWisata.this, "Share", Toast.LENGTH_SHORT).show();

                String message = "Kunjungi Sosial Media saya";
                Intent sendTextIntent = new Intent(Intent.ACTION_SEND);
                sendTextIntent.setType("text/plain");
                sendTextIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(sendTextIntent);
            }
        });

        Wisata wisata = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (wisata != null) {
            Glide.with(this)
                    .load(wisata.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(wisata.getNama_wisata());
            tvDeskripsi.setText(wisata.getDetail_wisata());
            tvHarga.setText(wisata.getHarga());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Wisata");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
