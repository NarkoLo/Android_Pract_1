package com.example.pract_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "App1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toast.makeText(this, "Application created", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application created");
        }catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    protected void onStart() {
        try {
            super.onStart();
            Toast.makeText(this, "Application started", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application started");
        }catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    protected void onRestart() {
        try {
            super.onRestart();
            Toast.makeText(this, "Application restarted", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application restarted");
        }
        catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }
    }

    @Override
    protected void onPause() {
        try {
            super.onPause();
            Toast.makeText(this, "Application paused", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application paused");
        }
        catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    protected void onStop() {
        try {
            super.onStop();
            Toast.makeText(this, "Application stopped", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application stopped");

        }
        catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }
    }

    @Override
    protected void onResume() {
        try {
            super.onResume();
            Toast.makeText(this, "Application resumed", Toast.LENGTH_SHORT).show();
            Log.i(TAG, "Application resumed");
        }
        catch (Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    protected void onDestroy() {
        try{
            Context context = getApplicationContext();
            Toast.makeText(context, "Application destroyed", Toast.LENGTH_LONG).show();
            Log.i(TAG, "Application destroyed");
            super.onDestroy();
        }catch(Exception e){
            Log.e(TAG, "Fatal Error from " + Arrays.toString(e.getStackTrace()));
        }
    }
}
