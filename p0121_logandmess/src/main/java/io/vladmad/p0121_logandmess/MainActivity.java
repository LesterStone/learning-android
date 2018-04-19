package io.vladmad.p0121_logandmess;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдем View-элементы");
        tvOut = findViewById(R.id.tv_Out);
        btnOk = findViewById(R.id.btn_Ok);
        btnCancel = findViewById(R.id.btn_Cancel);
        Log.d(TAG, "присваиваем обработчик кнопкам");

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.btn_Ok:
            Log.d(TAG, "кнопка ОК");
            tvOut.setText("Нажата кнопка OK");
            Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_SHORT).show();
            break;
        case  R.id.btn_Cancel:
            Log.d(TAG, "кнопка Cancel");
            tvOut.setText("Нажата кнопка Cancel");
            Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
