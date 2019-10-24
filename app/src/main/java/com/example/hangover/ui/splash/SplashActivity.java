package com.example.hangover.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.hangover.R;
import com.example.hangover.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity implements SplashView {

    SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenter(this);
        RelativeLayout relativeLayout = findViewById(R.id.rel_splash);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        relativeLayout.startAnimation(animation);

    }

    @Override
    public void startTimer() {
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }
}
