package edu.niu.cs.akash.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        TextView headTV, infTV;

        headTV = (TextView)findViewById(R.id.clubHeading);

        infTV = (TextView)findViewById(R.id.clubInformation);

        String selection = getIntent().getExtras().getString("mySelection");

        if(selection.equals("FC Barcelona"))
        {
            headTV.setText(R.string.fcbString);
            infTV.setText(R.string.fcbInf);
        }
        else if(selection.equals("Real Madrid"))
        {
            headTV.setText(R.string.rmString);
            infTV.setText(R.string.rmInf);
        }
        else if(selection.equals("FC Bayern Munich"))
        {
            headTV.setText(R.string.fcbmString);
            infTV.setText(R.string.fcbmInf);
        }
        else if(selection.equals("PSG"))
        {
            headTV.setText(R.string.psgString);
            infTV.setText(R.string.psgInf);
        }
        else if(selection.equals("Liverpool"))
        {
            headTV.setText(R.string.lpString);
            infTV.setText(R.string.lpInf);
        }

    }

    public void goBack(View view)
    {
        finish();
    }

}
