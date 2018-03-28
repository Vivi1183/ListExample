package com.example.android.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    // Элементы, которые мы хотим отобразить в списке
    private String[] elements = {"Каша", "Рис", "Омлет", "Рыба", "Лапша", "Яйца", "Курица",
            "элемент1", "элемент2", "элемент3", "элемент4", "элемент5", "элемент6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Создание адаптера и скармливание его в ListView
        Adapter adapter = new Adapter();
        ListView listView = (ListView) findViewById(R.id.lvMessageList);
        listView.setAdapter(adapter);
    }

    public class Adapter extends BaseAdapter {

        @Override
        // Возвращает общее кол-во "плашек", которое будет в списке
        public int getCount() {
            return elements.length;
        }

        @Override
        // Этот метод подсовывает списку элемент для отображения
        public View getView(int position, View view, ViewGroup viewGroup) {
            ElementView newView;
            if (view == null) {
                newView = new ElementView(getApplication());
            } else {
                newView = (ElementView) view;
            }

            // Отображаем текст соответственно позиции элемента в списке
            newView.setContent(elements[position]);
            return newView;
        }

        @Override
        // Это нам пока не интересно
        public Object getItem(int i) {
            return null;
        }

        @Override
        // Это нам пока не интересно
        public long getItemId(int i) {
            return 0;
        }
    }
}
