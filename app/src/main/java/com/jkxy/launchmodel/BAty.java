package com.jkxy.launchmodel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class BAty extends Activity implements View.OnClickListener {
    private TextView textView;
    private Button btnOne, btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baty);

        textView = (TextView) findViewById(R.id.Task);
        btnOne = (Button) findViewById(R.id.btnOne);

        btnTwo = (Button) findViewById(R.id.btnTwo);
        textView.setText(String.format("TaskId:%d\n,Current Activity id%s", getTaskId(), toString()));

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                startActivity(new Intent(BAty.this, StandardModel.class));
                break;
            case R.id.btnTwo:
                startActivity(new Intent(BAty.this, BAty.class));
                break;
        }
    }
}
