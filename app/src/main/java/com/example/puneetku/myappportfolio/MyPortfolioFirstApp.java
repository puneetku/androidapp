package com.example.puneetku.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyPortfolioFirstApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        if(view instanceof Button){
            Button b = (Button)view;
            CharSequence text = b.getText();
            String toastMessage = "This button will launch my "+ text+" app!";
            int toastTop = view.getBottom() + (view.getBottom() - view.getTop()) / 2;
            int toastLeft = view.getLeft() + (view.getRight() - view.getLeft()) / 2;
            Toast toast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.LEFT| Gravity.TOP, toastLeft, toastTop);
            toast.show();

        }else {
            Log.d("STATE","view is not an instance of button:" + view.toString());
        }
    }
}
