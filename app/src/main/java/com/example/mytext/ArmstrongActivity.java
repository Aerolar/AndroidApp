package com.example.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ArmstrongActivity extends AppCompatActivity {

    private Button btnCheckArmstrong;
    private TextView tvCheckArmstrong;
    private EditText etCheckArmstrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong);

        btnCheckArmstrong=findViewById(R.id.btnCheckArmstrong);
        tvCheckArmstrong=findViewById(R.id.tvCheckArmstrong);
        etCheckArmstrong=findViewById(R.id.etCheckArmstrong);

        btnCheckArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etCheckArmstrong.getText())){
                    etCheckArmstrong.setError("Enter a number");
                    etCheckArmstrong.requestFocus();
                    return;
                }

                String result;
                int n, nu, num=0, rem;



                n = Integer.parseInt(etCheckArmstrong.getText().toString());

                nu = n;

                while(nu != 0)
                {
                    rem = nu%10;
                    num = num + rem*rem*rem;
                    nu = nu/10;
                }
                if(num == n){
                    result="It is an armstrong number";

                }else{
                    result="It is not an armstrong number";
                }

                tvCheckArmstrong.setText(result);
            }
        });
    }
}
