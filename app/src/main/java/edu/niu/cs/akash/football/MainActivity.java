package edu.niu.cs.akash.football;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    ImageView img;
    Spinner clubSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> values = new ArrayList<String>();
        values.add("FC Barcelona");
        values.add("Real Madrid");
        values.add("FC Bayern Munich");
        values.add("PSG");
        values.add("Liverpool");

        img = (ImageView)findViewById(R.id.clubImages) ;

        clubSpinner = (Spinner)findViewById(R.id.footballClubsSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_view,values);

        clubSpinner.setAdapter(adapter);

        clubSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final String selection = parent.getItemAtPosition(position).toString();

                if(selection.equals("FC Barcelona"))
                {
                    img.setImageResource(R.drawable.fcb);
                }
                else if(selection.equals("Real Madrid"))
                {
                    img.setImageResource(R.drawable.rm);
                }
                else if(selection.equals("FC Bayern Munich"))
                {
                    img.setImageResource(R.drawable.fcbm);
                }
                else if(selection.equals("PSG"))
                {
                    img.setImageResource(R.drawable.psg);
                }
                else if(selection.equals("Liverpool"))
                {
                    img.setImageResource(R.drawable.lp);
                }

                Button detailsBtn;
                detailsBtn = (Button)findViewById(R.id.clubInfoButton);

                detailsBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                        myIntent.putExtra("mySelection", selection);
                        startActivity(myIntent);
                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
