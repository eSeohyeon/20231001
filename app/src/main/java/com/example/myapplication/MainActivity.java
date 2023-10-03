package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation logo_start= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_logo); // 애니메이션 지정
        img_logo=findViewById(R.id.img_logo); // gui 위젯과 바인딩
        img_logo.startAnimation(logo_start); // 애니메이션 시작

        moveLogin(2); // 3초 후 로그인 화면으로 이동
    }

    private void moveLogin(int sec) {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                //new Intent(현재 context, 이동할 activity)
                Intent intent = new Intent(getApplicationContext(), Login.class);

                startActivity(intent);	//intent 에 명시된 액티비티로 이동

                finish();	//현재 액티비티 종료
                overridePendingTransition(R.anim.fadein, R.anim.fadeout); // 화면 전환시 효과

            }
        }, 1000 * sec); // sec초 정도 딜레이를 준 후 시작
    }
}