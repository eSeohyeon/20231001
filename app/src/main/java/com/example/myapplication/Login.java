package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private Button btn_login;
    private Button btn_signup;
    private EditText txt_input_username;
    private EditText txt_input_pwd;
    private String str_username; // 입력된 아이디를 저장
    private String str_pwd; // 입력된 비밀번호 저장

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login=findViewById(R.id.btn_login);
        btn_signup=findViewById(R.id.btn_signup);
        txt_input_username=findViewById(R.id.txt_input_username);
        txt_input_pwd=findViewById(R.id.txt_input_pwd);
        // gui 위젯들과 바인딩

        btn_login.setOnClickListener(new View.OnClickListener() { // sign in 버튼 클릭시
            @Override
            public void onClick(View view) {
                str_username=txt_input_username.getText().toString();
                str_pwd=txt_input_pwd.getText().toString();
                // Intent move_main= new Intent(getApplicationContext(), );
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() { // sign up 버튼 클릭시
            @Override
            public void onClick(View view) {
                Intent move_signup= new Intent(getApplicationContext(), SignUp.class);
                startActivity(move_signup);
            }
        });


    }
}