package com.example.cp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.PasswordAuthentication;

public class ProfileActivity extends AppCompatActivity {

    public static String EMAIL_KEY = "EMAIL_KEY";
    public static String PASSWORD_KEY = "PASSWORD_KEY";


    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;

    private View.OnClickListener mOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_profile);

        mPhoto = findViewById(R.id.ivPhoto);
        mLogin = findViewById(R.id.tvEmail);
        mPassword = findViewById(R.id.tvPassword);
        Bundle bundle = getIntent().getExtras();
        mLogin.setText(bundle.getString(EMAIL_KEY));
        mPassword.setText(bundle.getString(PASSWORD_KEY));


        mPhoto.setOnClickListener(mOnPhotoClickListener);
    }

}
