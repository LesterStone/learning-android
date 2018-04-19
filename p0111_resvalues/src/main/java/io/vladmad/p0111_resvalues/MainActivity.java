package io.vladmad.p0111_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    LinearLayout llBottom;
    TextView tvBottom;
    Button btnBottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llBottom = findViewById(R.id.ll_Bottom);
        tvBottom = findViewById(R.id.tv_Bottom);
        btnBottom = findViewById(R.id.btn_Bottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);

    }
}
