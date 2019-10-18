package com.example.myfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioGroup rgG;
    RadioButton rbM, rbF, rbO;
    Spinner Spinner;
    CheckBox cbM, cbT, cbD;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.name);
        rgG = findViewById(R.id.rgG);
        rbM = findViewById(R.id.rbMale);
        rbF = findViewById(R.id.rbFemale);
        rbO = findViewById(R.id.rbOthers);
        Spinner = findViewById(R.id.spPradesh);
        cbM = findViewById(R.id.cbMusic);
        cbT = findViewById(R.id.cbTravel);
        cbD = findViewById(R.id.cbDance);
        button = findViewById(R.id.btnSubmit);




        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Select One", Toast.LENGTH_SHORT).show();
                {

                }
            }
        });
        cbM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Music Checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Music UnChecked", Toast.LENGTH_SHORT).show();

                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, gender, pradesh;
                name=editText.getText().toString();

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",name);
                startActivity(intent);

            }
        });
    }

}