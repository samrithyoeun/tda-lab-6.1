package com.fluffy.samrith.lab6_using_sharedpreference;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickLoad(View view) {
        Intent i = new Intent("com.fluffy.samrith.lab6_using_sharedpreference.AppPreference");
        startActivity(i);
    }

    public void onClickDisplay(View view) {
        SharedPreferences appPrefs = getSharedPreferences("com.fluffy.samrith.lab6_using_sharedpreference_preference", MODE_PRIVATE);
        DisplayText(appPrefs.getString("editTextPref", ""));
    }

    public void onClickModify(View view) {
        SharedPreferences appPrefs = getSharedPreferences("com.fluffy.samrith.lab6_using_sharedpreference_preference", MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = appPrefs.edit();
        prefsEditor.putString("editTextPref", ((EditText) findViewById(R.id.editText)).getText().toString());
        prefsEditor.commit();
    }

    private void DisplayText(String str) {
        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
    }

}

