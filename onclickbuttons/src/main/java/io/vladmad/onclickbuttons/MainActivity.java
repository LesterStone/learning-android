package io.vladmad.onclickbuttons;

import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOK;
    Button btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Найдем View - элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOK = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //создаем обработчик нажатия
        OnClickListener oclBtnOk = new OnClickListener() {
            @Override
            public void onClick(View v) {
                //меняем текст в tvOut
                tvOut.setText("Нажата кнопка OK");
            }
        };

        //создаем обработчик нажатия
        OnClickListener oclBtnCancel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                //меняем текст в tvOut
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        //Присвоим обработчик кнопке OK (btnOK)
        btnOK.setOnClickListener(oclBtnOk);
        //Присвоим обработчик кнопке Cancel (btnCancel)
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
