package edu.unicauca.helloandroidx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class HelloActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    String name;
    double velocidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(this);
        updateTime();
    }

    public void updateTime(){
        btn.setText(new Date().toString());
    }

    public void updateName(String name){
        this.name = name;
    }

    public void cambiarVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    @Override
    public void onClick(View view) {
        updateTime();
    }
}