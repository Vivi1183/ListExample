package com.example.android.listexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Alex on 28.03.2018.
 */

public class ElementView extends LinearLayout {
    // Это единственное поле, в котором отображается текст
    private TextView tvName;

    public ElementView(Context context) {
        // Служебное заклинание для инициализации View. Можно просто всегда копировать его
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Тут в заклинании указывается название файла, в котором эта View описана - box_element.xml
        inflater.inflate(R.layout.box_element, this);
        tvName = (TextView) findViewById(R.id.tvName);
    }

    // Единственный способ взаимодействия с нашим элементом списка - выставить название элемента
    public void setContent(String name) {
        tvName.setText(name);
    }
}
