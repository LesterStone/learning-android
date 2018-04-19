package io.vladmad.l011_m1resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout llBottom;
    TextView tvBottom;
    Button btnBotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Найдем view-элементы
        llBottom = findViewById(R.id.ll_Bottom);
        tvBottom = findViewById(R.id.tv_Bottom);
        btnBotton = findViewById(R.id.btn_Bottom);

        //view-элементам присвоим параметры
        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBotton.setText(R.string.btnBottomText);

    }
}
