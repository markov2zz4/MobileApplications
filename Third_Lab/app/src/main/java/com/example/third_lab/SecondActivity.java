package com.example.third_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private TextView NumberLab;
    private TextView Student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        NumberLab = findViewById(R.id.numberoflesson);
        NumberLab.setTextSize(20);
        NumberLab.setPadding(16, 16, 16, 16);
        NumberLab.setText("Лабораторная работа № 3");

        Student = findViewById(R.id.student);
        Student.setTextSize(20);
        Student.setText("Работу выполнил Шпет Альберт 007г2");

    }
}