package com.example.formapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etName = (EditText) findViewById(R.id.editName);
        String fullName = etName.getText().toString();
        EditText etNumber = (EditText) findViewById(R.id.editNumber);
        String mssv = etNumber.getText().toString();
        EditText etDOB = (EditText) findViewById(R.id.editDOB);
        String dob = etDOB.getText().toString();
        EditText etPhone = (EditText) findViewById(R.id.editPhone);
        String phoneNum = etPhone.getText().toString();
        EditText etEmail = (EditText) findViewById(R.id.editEmail);
        String email = etEmail.getText().toString();
        if (TextUtils.isEmpty(fullName)) {
            etName.setError("this part can not be empty");
            return;
        }
        if (TextUtils.isEmpty(mssv)) {
            etNumber.setError("this part can not be empty");
            return;
        }
        if (TextUtils.isEmpty(dob)) {
            etDOB.setError("this part can not be empty");
            return;
        }
        if (TextUtils.isEmpty(phoneNum)) {
            etPhone.setError("this part can not be empty");
            return;
        }
        if (TextUtils.isEmpty(email)) {
            etEmail.setError("this part can not be empty");
            return;
        }
    }
}