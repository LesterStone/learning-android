package io.vladmad.p0161_dynamiclayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ViewGroup.LayoutParams lpView = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    TextView tv = new TextView(this);
    Button btn = new Button(this);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // создание LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
        //установка вертикальной ориентации
        linLayout.setOrientation(LinearLayout.VERTICAL);
        //создаем LayoutParams
        ViewGroup.LayoutParams linLayoutParam = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //устанавливаем Layout как корневой элемент экрана
        setContentView(linLayout, linLayoutParam);

        tv.setText("TextView");
        tv.setLayoutParams(lpView);
        linLayout.addView(tv);

        btn.setText("Button");
        linLayout.addView(btn);

    }


}
