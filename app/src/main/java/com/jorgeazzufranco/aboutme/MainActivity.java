package com.jorgeazzufranco.aboutme;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compartir(View v){

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Jorge Alberto Franco Cuadra\nIngeniero Informatico\nJorgeAzzuFranco" +
                "\nBlackHeartIswo\nJorge.cuadra.13@gmail.com\n70893664\n" );
        startActivity(Intent.createChooser(intent, "Share with"));
    }
}
