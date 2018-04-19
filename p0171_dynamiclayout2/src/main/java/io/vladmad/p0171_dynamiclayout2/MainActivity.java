package io.vladmad.p0171_dynamiclayout2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.ll_Main);
        rgGravity = (RadioGroup) findViewById(R.id.rg_Gravity);
        etName = (EditText) findViewById(R.id.et_Name);

        btnClear = (Button) findViewById(R.id.btn_Clear);
        btnClear.setOnClickListener(this);

        btnCreate = (Button) findViewById(R.id.btn_Create);
        btnCreate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Create:
                //Создание LayoutParams с шириной и высотой по содержимому
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                //переменная для хранениея значений выравнивания
                //по умолчанию пусть будет LEFT
                int btnGravity = Gravity.LEFT;
                //Определяем какой RadioButton чекнут и соответственно заполняем btnGravity
                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.rb_Left:
                        btnGravity = Gravity.LEFT;
                        break;
                    case  R.id.rb_Right:
                        btnGravity = Gravity.RIGHT;
                        break;
                    case  R.id.rb_Center:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                }
                //переносим полученное значение выравнивания в LayoutParams
                lParams.gravity = btnGravity;

                //Создаем Button, пишем текст и добавляем в LinearLayout
                Button btnNew = new Button(this);
                btnNew.setText(etName.getText().toString());
                llMain.addView(btnNew, lParams);

                break;

            case R.id.btn_Clear:
                llMain.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
