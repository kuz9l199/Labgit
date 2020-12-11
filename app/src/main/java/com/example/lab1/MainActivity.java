package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Функция получает на вход 2 числа, возвращает наименьшее из двух. Если передан хоть один null, то возвращает "Null".
     * @param x - число А.
     * @param y - число B.
     * @return
     */
    String Min(Integer x, Integer y)
    {
        if(x == null || y == null)
            return "Null";

        if(x < y)
            return x.toString();
        else
            return y.toString();
    }

    String  Max(Integer x, Integer y)
    {
        if(x == null || y == null)
            return "Null";

        if(x > y)
            return x.toString();
        else
            return y.toString();
    }

}