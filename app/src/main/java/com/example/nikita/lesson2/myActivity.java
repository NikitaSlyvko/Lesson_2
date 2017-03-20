package com.example.nikita.lesson2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nikita on 20.03.17.
 */

public class myActivity extends Activity {
    private TextView viewClick;
    private TextView viewResult;
    private Button buttonFirst;
    private Button buttonSecond;
    private Button buttonThird;
    private Button buttonResult;
    private EditText firstName;
    private EditText lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        viewClick = (TextView) findViewById(R.id.view_click_button);
        viewResult = (TextView) findViewById(R.id.view_result);
        buttonFirst = (Button) findViewById(R.id.button_1);
        buttonSecond = (Button) findViewById(R.id.button_2);
        buttonThird = (Button) findViewById(R.id.button_3);
        buttonResult = (Button) findViewById(R.id.button_solution);
        firstName = (EditText) findViewById(R.id.first_name);
        lastName = (EditText) findViewById(R.id.last_name);

        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the FIRST button");
            }
        });

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the SECOND button");
            }
        });

        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewClick.setText("Was clicked the THIRD button");
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                viewResult.setText(firstName.getText()+ " " +lastName.getText());
            }
        });
    }
}
