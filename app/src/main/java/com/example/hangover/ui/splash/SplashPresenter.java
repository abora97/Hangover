package com.example.hangover.ui.splash;

import android.os.Handler;

class SplashPresenter {

    private SplashView splashView;

     SplashPresenter(SplashView splashView) {
        this.splashView = splashView;
        timerStart();
    }

    private void timerStart() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashView.startTimer();
            }
        }, 3500);
    }


}
