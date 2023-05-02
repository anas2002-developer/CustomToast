package com.anas.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToastShow=findViewById(R.id.btnToastShow);

        btnToastShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast=new Toast(getApplicationContext());

                View view=getLayoutInflater().inflate(R.layout.toast_design, (ViewGroup) findViewById(R.id.LLToast));

                //for changing toast background
                toast.setView(view);

                //for setting toast message
                TextView txtToastMsg=view.findViewById(R.id.txtToastMsg);
                txtToastMsg.setText("New Toast");

                //for setting toast duration
                toast.setDuration(Toast.LENGTH_SHORT);

                //for setting toast gravity
                toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);

                //for showing toast
                toast.show();
            }
        });
    }
}