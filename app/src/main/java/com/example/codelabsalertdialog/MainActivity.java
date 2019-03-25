package com.example.codelabsalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {

        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        //set the dialog title and message
        myAlertBuilder.setTitle(R.string.alert_title);
        myAlertBuilder.setMessage(R.string.alert_message);

        //add the dialog buttons
        myAlertBuilder.setPositiveButton(R.string.button_ok, new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //user clicked ok button
                        Toast.makeText(getApplicationContext(), "Pressed ok",
                                Toast.LENGTH_LONG).show();
                    }
                });
        myAlertBuilder.setNegativeButton(R.string.button_cancel, new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //user cancelled the dialog
                        Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                Toast.LENGTH_LONG).show();
                    }
                });

        //create and show the AlertDialog
        myAlertBuilder.show();
    }
}
