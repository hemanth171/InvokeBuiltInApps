package com.hemanth.invokebuiltinapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by hemanth on 17/07/16.
 */
public class ShowMessageActivity extends Activity {

    String message = "";
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmessage);

        okBtn = (Button) findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.hemanth.invokebuiltinapps.GreetMessageActivity");
                EditText unameText = (EditText) findViewById(R.id.unameText);
                message = unameText.getText().toString();
                Bundle extras = new Bundle();
                extras.putString("name", message);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
