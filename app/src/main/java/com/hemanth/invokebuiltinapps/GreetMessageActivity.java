package com.hemanth.invokebuiltinapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by hemanth on 17/07/16.
 */
public class GreetMessageActivity extends Activity {

    String greetMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetmessage);
        TextView greetText = (TextView) findViewById(R.id.greetText);

        Bundle bundle = getIntent().getExtras();
        greetMessage = "Hi "+bundle.getString("name").toString();

        greetText.setText(greetMessage);
    }

}
