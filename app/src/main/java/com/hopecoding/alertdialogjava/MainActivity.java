package com.hopecoding.alertdialogjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    String savedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();



    }


    public void save(View view){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        savedText=editText.getText().toString();
        if(savedText.equals("")){
            Toast.makeText(MainActivity.this,"You forgot to enter text",Toast.LENGTH_LONG).show();
        }else{
            alert.setTitle("Save");
            alert.setMessage("Are you sure you want to save your text?");
            alert.setNegativeButton("Yes", (dialogInterface, i) -> {
                //save
                Toast.makeText(MainActivity.this,"Your text has been saved.",Toast.LENGTH_LONG).show();
                editText.setText("");
                textView.setText(savedText);
            });
            alert.setPositiveButton("No", (dialogInterface, i) -> {
                //Not Save
                Toast.makeText(MainActivity.this,"Your text has not been saved.",Toast.LENGTH_LONG).show();

            });

            alert.show();
        }





    }
}