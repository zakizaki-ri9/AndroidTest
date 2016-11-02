package com.example.nsw00_903064.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /**
     * アクティビティの初期処理
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // おまじないのようなもの
        super.onCreate(savedInstanceState);

        // アプリで表示する画面を設定している
        //  Rにはリソース系の情報が自動生成される
        setContentView(R.layout.activity_main);
    }

    private class HelloListener implements View.OnClickListener {

        /**
         * クリックイベント
         * @param v クリックされたビュー（画面コントロール）
         * @return なし
         */
        @Override
        public void onClick(View v) {

        }
    }
}
