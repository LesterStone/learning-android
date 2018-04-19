package io.vladmad.l0102_m1activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOK;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Найдем view-элементы
        tvOut = (TextView) findViewById(R.id.tv_Out);
        btnOK = (Button) findViewById(R.id.btn_Ok);
        btnCancel = (Button) findViewById(R.id.btn_Cancel);

        //Присваиваем обработчик кнопкам
        btnOK.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Ok:
                tvOut.setText("Нажата кнопка OK");
                break;
            case R.id.btn_Cancel:
                tvOut.setText("Нажата кнопка Cancel");
                break;
        }
        }
    }
