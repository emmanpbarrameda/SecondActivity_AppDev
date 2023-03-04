package com.appdev.firstactappdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce= false;

    public void clearRadioButtons() {
        RadioGroup myRadioGroup = findViewById(R.id.radioGroupMembers);
        myRadioGroup.clearCheck();
        myRadioGroup.setSelected(false);
    }

    public void clearComboBox() {
        Spinner mySpinner = findViewById(R.id.comboBoxMembers);
        mySpinner.setSelection(1);
    }

    public void clearComboBox1() {
        Spinner mySpinner = findViewById(R.id.comboBoxMembers);
        mySpinner.setSelection(0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();

        Button resetBTN = findViewById(R.id.resetBTN);
        ImageView imageView = findViewById(R.id.imageView);

        //emman BTN
        Button emmanBTN = findViewById(R.id.emmanBTN);
        emmanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearRadioButtons();
                clearComboBox1();

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(android.R.color.transparent);
                imageView.setImageResource(R.drawable.emman);
                Toast.makeText(getApplicationContext(), "EMMAN is selected", Toast.LENGTH_SHORT).show();
            }
        });

        //ion BTN
        Button ionBTN = findViewById(R.id.ionBTN);
        ionBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearRadioButtons();
                clearComboBox1();

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(android.R.color.transparent);
                imageView.setImageResource(R.drawable.ion);
                Toast.makeText(getApplicationContext(), "ION is selected", Toast.LENGTH_SHORT).show();
            }
        });

        //isaiah BTN
        Button isaiahBTN = findViewById(R.id.isaiahBTN);
        isaiahBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearRadioButtons();
                clearComboBox1();

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(android.R.color.transparent);
                imageView.setImageResource(R.drawable.isaiah);
                Toast.makeText(getApplicationContext(), "ISAIAH is selected", Toast.LENGTH_SHORT).show();
            }
        });

        //trishia BTN
        Button trishiaBTN = findViewById(R.id.trishiaBTN);
        trishiaBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearRadioButtons();
                clearComboBox1();

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(android.R.color.transparent);
                imageView.setImageResource(R.drawable.trishia);
                Toast.makeText(getApplicationContext(), "TRISHIA is selected", Toast.LENGTH_SHORT).show();
            }
        });

        //justine BTN
        Button justinBTN = findViewById(R.id.justinBTN);
        justinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clearRadioButtons();
                clearComboBox1();

                ImageView imageView = findViewById(R.id.imageView);
                imageView.setImageResource(android.R.color.transparent);
                imageView.setImageResource(R.drawable.ellorig);
                Toast.makeText(getApplicationContext(), "JUSTIN is selected", Toast.LENGTH_SHORT).show();
            }
        });

        //RADIO BUTTONS
        RadioGroup radioGroup = findViewById(R.id.radioGroupMembers);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                imageView.setImageResource(android.R.color.transparent);

                if (checkedId == R.id.emmanRBT) {
                    clearComboBox1();
                    imageView.setImageResource(R.drawable.emman);
                    Toast.makeText(getApplicationContext(), "EMMAN is selected", Toast.LENGTH_SHORT).show();

                } else if (checkedId == R.id.ionRBT) {
                    clearComboBox1();
                    imageView.setImageResource(R.drawable.ion);
                    Toast.makeText(getApplicationContext(), "ION is selected", Toast.LENGTH_SHORT).show();

                } else if (checkedId == R.id.isaiahRBT) {
                    clearComboBox1();
                    imageView.setImageResource(R.drawable.isaiah);
                    Toast.makeText(getApplicationContext(), "ISAIAH is selected", Toast.LENGTH_SHORT).show();

                } else if (checkedId == R.id.trishiaRBT) {
                    clearComboBox1();
                    imageView.setImageResource(R.drawable.trishia);
                    Toast.makeText(getApplicationContext(), "TRISHIA is selected", Toast.LENGTH_SHORT).show();

                } else if (checkedId == R.id.justinRBT) {
                    clearComboBox1();
                    imageView.setImageResource(R.drawable.ellorig);
                    Toast.makeText(getApplicationContext(), "JUSTIN is selected", Toast.LENGTH_SHORT).show();
                }

            }
        });


        //COMBO BOX
        Spinner mySpinner = findViewById(R.id.comboBoxMembers);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                // Perform an action based on the selected item
                if (selectedItem.equals("EMMAN")) {
                    // Do something for EMMAN
                    clearRadioButtons();
                    imageView.setImageResource(R.drawable.emman);
                    Toast.makeText(getApplicationContext(), "EMMAN is selected", Toast.LENGTH_SHORT).show();


                } else if (selectedItem.equals("ION")) {
                    // Do something for ION
                    clearRadioButtons();
                    imageView.setImageResource(R.drawable.ion);
                    Toast.makeText(getApplicationContext(), "ION is selected", Toast.LENGTH_SHORT).show();


                } else if (selectedItem.equals("ISAIAH")) {
                    // Do something for ISAIAH
                    clearRadioButtons();
                    imageView.setImageResource(R.drawable.isaiah);
                    Toast.makeText(getApplicationContext(), "ISAIAH is selected", Toast.LENGTH_SHORT).show();


                } else if (selectedItem.equals("TRISHIA")) {
                    // Do something for TRISHIA
                    clearRadioButtons();
                    imageView.setImageResource(R.drawable.trishia);
                    Toast.makeText(getApplicationContext(), "TRISHIA is selected", Toast.LENGTH_SHORT).show();


                } else if (selectedItem.equals("JUSTIN")) {
                    // Do something for JUSTIN
                    clearRadioButtons();
                    imageView.setImageResource(R.drawable.ellorig);
                    Toast.makeText(getApplicationContext(), "JUSTIN is selected", Toast.LENGTH_SHORT).show();


                } else if (selectedItem.equals("NONE")) {
                    imageView.setImageResource(android.R.color.transparent);
                    clearRadioButtons();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // clear image

            }
        });


        //reset BTN
        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearRadioButtons();
                clearComboBox();
                imageView.setImageResource(android.R.color.transparent);
                Toast.makeText(getApplicationContext(), "Reset Success!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    //exit 2 times
    @Override
    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    //next here

}
