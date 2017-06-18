package com.example.juanm.stovesoccerv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // spinner
    private String[] spinnerOptions = {"Most Valuable Players - ALL", "Most Valuable Players - U17",
            "Most Valuable Players - U18", "Ronaldo Statue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // SPINNER
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the spinnner name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, spinnerOptions);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    //Performing action onItemSelected and onNothing selecteds
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        final Intent intent;
        /**
        switch(position) {
            case 1:
                intent = new Intent(MainActivity.this, TargetActivity1.class);
                break;
            case 2:
                intent = new Intent(MainActivity.this, TargetActivity2.class);
                break;
        }
        startActivity(intent);
         **/
        Toast.makeText(getApplicationContext(), spinnerOptions[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
