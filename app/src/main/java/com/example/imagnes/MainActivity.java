package com.example.imagnes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declare variables y un vector y agregue imagenes
    private static final Random generador =new Random();
    private static final Integer [] imagenesID=
            {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.j, R.drawable.k    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer q = imagenesID[generador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom);

        View nextButton = findViewById(R.id.btnImagen);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int resource = imagenesID[generador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
            }
        });
    }
}