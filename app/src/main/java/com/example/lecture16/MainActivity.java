package com.example.lecture16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> list;
    List<Integer> listTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<Integer>();
        listTwo = new LinkedList<Integer>();

        addToList(list);
        addToList(listTwo);

        long startTime = System.nanoTime();
        getRandomIndex(list);
        long endTime = System.nanoTime();
        Log.d("TAG", String.valueOf(endTime-startTime));

        long startTime2 = System.nanoTime();
        getRandomIndex(listTwo);
        long endTime2 = System.nanoTime();
        Log.d("TAG", String.valueOf(endTime2-startTime2));
    }

    public void addToList (List list) {
        for (int i = 0; i <= 1000000; i++) {
            list.add(i);
        }
    }

    public void getRandomIndex (List list) {
        for (int i = 0; i <= 1000000; i++) {
            list.get((int) Math.random());
        }
    }


}