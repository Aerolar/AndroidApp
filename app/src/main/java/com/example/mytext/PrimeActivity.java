package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeActivity extends AppCompatActivity {

    private Button btnCheckPrime;
    private TextView tvCheckPrime;
    private EditText etCheckPrime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        btnCheckPrime=findViewById(R.id.btnCheckPrime);
        etCheckPrime=findViewById(R.id.etCheckPrime);
        tvCheckPrime=findViewById(R.id.tvCheckPrime);

        btnCheckPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etCheckPrime.getText())){
                    etCheckPrime.setError("Enter a value");
                    etCheckPrime.requestFocus();
                    return;
                }
                int num,count,n,a=0;
                String result;

                num=Integer.parseInt(etCheckPrime.getText().toString());
                for(count=1;count<num;count++){
                    n=num%count;
                    if(n==0){
                        a++;
                    }
                }
                if(a>1){
                    result="The number is not Prime";
                }else{
                    result="The number is Prime";
                }

                tvCheckPrime.setText(result+"");

            }
        });



    }
}
