package com.example.immortal.indzoblomei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText priceET, countET;
    Button submitBtn;
    TextView resultTV;
    int price, count, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        priceET = (EditText) findViewById(R.id.input_price);
        countET = (EditText) findViewById(R.id.input_count);
        resultTV = (TextView) findViewById(R.id.resultTextView);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                price = Integer.parseInt(priceET.getText().toString());
                count = Integer.parseInt(countET.getText().toString());

                result = price * count;

                resultTV.setText("Вартість мийки " + count + " машин становить " + result + " гривень.");
            }
        });
    }
}
