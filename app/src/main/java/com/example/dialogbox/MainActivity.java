package com.example.dialogbox;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.DiBo); //Connect "b1" object to button "DiBo" in XML

        Button b2 = findViewById(R.id.ToBu); //Connect "b2" object to button "ToBu" in XML

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                showDialog();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "You clicked on Toast", Toast.LENGTH_LONG).show();
            }
        });
    }


    private void showDialog() {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Dialog Box");
        b.setMessage("This is a sample dialog");
        b.setPositiveButton("KOKO", new DialogInterface.OnClickListener(){
           @Override
           public void onClick(DialogInterface d, int w){
               d.dismiss();
           }
        });

        b.setNegativeButton("NO KOKO", new DialogInterface.OnClickListener(){
           public void onClick(DialogInterface d, int w){
               d.dismiss();
           }
        });

        AlertDialog c = b.create();
        c.show();
    }

}