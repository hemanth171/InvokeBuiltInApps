package com.hemanth.invokebuiltinapps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showBrowserBtn = (Button) findViewById(R.id.showBrowserBtn);
        showBrowserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DEBUG", "Bowser started");
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browser);
            }
        });
        Button dialANumberBtn = (Button) findViewById(R.id.dialANumberBtn);
        dialANumberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DEBUG", "Contacts Started");
                Intent dialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+12345678"));
                startActivity(dialNumber);
            }
        });

        Button alertActivityBtn = (Button) findViewById(R.id.alertActivityBtn);
        alertActivityBtn.setOnClickListener(this);

        Button showMessageBtn = (Button) findViewById(R.id.showMessageBtn);
        showMessageBtn.setOnClickListener(this);

        Button showActionBarBtn = (Button) findViewById(R.id.showActionBarBtn);
        showActionBarBtn.setOnClickListener(this);

        Button fragmentViewBtn = (Button) findViewById(R.id.fragmentViewBtn);
        fragmentViewBtn.setOnClickListener(this);

        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Do you want to exit from this application?");
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        Button exitApplicationBtn = (Button) findViewById(R.id.exitApplicationBtn);
        exitApplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == findViewById(R.id.alertActivityBtn)){
            Intent alertActivity = new Intent(this, ShowAlertActivity.class);
            startActivity(alertActivity);
        }
        if(view == findViewById(R.id.showMessageBtn)){
            Intent showMessageActivity = new Intent(this, ShowMessageActivity.class);
            startActivity(showMessageActivity);
        }
        if(view == findViewById(R.id.showActionBarBtn)){
            Intent actionBarActivity = new Intent(this, ActionBarActivity.class);
            startActivity(actionBarActivity);
        }
        if(view == findViewById(R.id.fragmentViewBtn)){
            Intent container = new Intent(this, Container.class);
            startActivity(container);
        }
    }
}
