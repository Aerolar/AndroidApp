package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwapActivity extends AppCompatActivity {
    private Button btnSwap;
    private EditText etSwapFirst, etSwapSecond;
    private TextView tvSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        btnSwap=findViewById(R.id.btnSwap);
        etSwapFirst=findViewById(R.id.etSwapFirst);
        etSwapSecond=findViewById(R.id.etSwapSecond);
        tvSwap=findViewById(R.id.tvSwap);

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etSwapFirst.getText())){
                    etSwapFirst.setError("Enter a value");
                    etSwapFirst.requestFocus();
                    return;
                }else if (TextUtils.isEmpty(etSwapSecond.getText())){
                    etSwapSecond.setError("Enter a value");
                    etSwapSecond.requestFocus();
                    return;
                }
                int first,second;
                String result1,result2;
                first=Integer.parseInt(etSwapFirst.getText().toString());
                second=Integer.parseInt(etSwapSecond.getText().toString());
                result1=("Before swapping First no:"+first+" Second no:"+second);
                first=first+second;
                second=first-second;
                first=first-second;
                result2=("After swapping First no:"+first+" Second no:"+second);

                tvSwap.setText(result1+" "+result2);
            }
        });
    }
}
