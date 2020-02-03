package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {

    private Button btnReverse;
    private TextView tvReverse;
    private EditText etReverse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);
        btnReverse=findViewById(R.id.btnReverse);
        tvReverse=findViewById(R.id.tvReverse);
        etReverse=findViewById(R.id.etReverse);

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etReverse.getText())){
                    etReverse.setError("Enter a value");
                    etReverse.requestFocus();
                    return;
                }
                String num;
                String result="";

                num=etReverse.getText().toString();
                for(int i = num.length() - 1; i >= 0; i--)
                {
                    result = result + num.charAt(i);
                }

                tvReverse.setText(result+"");
            }
        });
    }
}
