package com.example.u0151051.life_cycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

//生命週期中的每個方法都必須先呼叫父類別的方法
public class MainActivity extends AppCompatActivity {
    // 生命週期第一步onCreate,(以下生命週期方法皆打一半然後alt+/自動產生)
    @Override
    // Bundle savedInstanceState保存資料用
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    // 生命週期第二步onStart
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    // 生命週期會插進來的方法,程式執行中像如果有電話進來(onPause-> onStop(),電話結束後就會onRestart(),可利用模擬器模擬打電話)
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    // 生命週期第三步onResume(),onResume後開始activity running
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    // 生命週期第四步onPause
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    // 生命週期第五步 onStop除了會進入第六步 onDestroy,也有可能跑onRestart再跑onStart依序再跑下來
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    // 生命週期第六步 onDestroy然後結束生命
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

}
