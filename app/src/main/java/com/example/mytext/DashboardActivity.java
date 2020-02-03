package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class DashboardActivity extends AppCompatActivity {

    Button btnArithmetic,btnArea,btnSI,btnCheckArmstrong,btnPrime,btnReverse,btnSwap,btnAutomorphic,btnOddEven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnArea = findViewById(R.id.btnArea);
        btnArithmetic = findViewById(R.id.btnArithemtic);
        btnSI=findViewById(R.id.btnSI);
        btnCheckArmstrong=findViewById(R.id.btnCheckArmstrong);
        btnAutomorphic=findViewById(R.id.btnAutomorphic);
        btnPrime=findViewById(R.id.btnPrime);
        btnOddEven=findViewById(R.id.btnOddEven);
        btnReverse=findViewById(R.id.btnReverse);
        btnSwap=findViewById(R.id.btnSwap);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AreaCircleActivity.class );
                startActivity(intent);
            }
        });

        btnArithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,SimpleInterestActivity.class);
                startActivity(intent);
            }
        });

        btnCheckArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ArmstrongActivity.class);
                startActivity(intent);
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,AutomorphicActivity.class);
                startActivity(intent);
            }
        });

        btnPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,PrimeActivity.class);
                startActivity(intent);
            }
        });

        btnOddEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,OddEvenActivity.class);
                startActivity(intent);
            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ReverseActivity.class);
                startActivity(intent);
            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,SwapActivity.class);
                startActivity(intent);
            }
        });
    }
}
