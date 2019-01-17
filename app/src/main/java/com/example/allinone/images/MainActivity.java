package com.example.allinone.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imag;
int [] bird = new int[]{R.drawable.bird1,R.drawable.bird2,R.drawable.bird3,R.drawable.bird4,R.drawable.bird5};
int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imag=(ImageView)findViewById(R.id.imageView);
    }
    public void next(View view){
        imag.setImageResource(bird[n]);
        if(n<4)
            n++;
    }
    public void back(View view){
        imag.setImageResource(bird[n]);
        if(n>0)
            n--;
    }
}
