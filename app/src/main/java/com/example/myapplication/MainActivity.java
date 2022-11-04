package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Item1:
                Toast.makeText(getApplicationContext(),"Item 1 selected",Toast.LENGTH_LONG).show();
            case R.id.Item2:
                Toast.makeText(getApplicationContext(),"Item 2 selected",Toast.LENGTH_LONG).show();
            case R.id.Item3:
                Toast.makeText(getApplicationContext(),"Item 3 selected",Toast.LENGTH_LONG).show();
            case R.id.Item4:
                Toast.makeText(getApplicationContext(),"Item  selected",Toast.LENGTH_LONG).show();
            default: return super.onOptionsItemSelected(item);
        }
    }
}