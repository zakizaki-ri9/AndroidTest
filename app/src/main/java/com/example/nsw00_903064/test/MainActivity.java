package com.example.nsw00_903064.test;

import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        // リスナ設定：表示ボタン
        Button btClick = (Button)findViewById(R.id.btClick);
        btClick.setOnClickListener(new HelloListener());

        // リスナ設定：クリアボタン
        Button btClear = (Button)findViewById(R.id.btClear);
        btClear.setOnClickListener(new HelloListener());

//        // 無記名クラスによる設定方法
//        ((Button)findViewById(R.id.btClear)).setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((TextView)findViewById(R.id.tvOutput)).setText("");
//                ((EditText)findViewById(R.id.etName)).setText("");
//            }
//        });
    }

    private class HelloListener implements View.OnClickListener {

        /**
         * クリックイベント
         * @param v クリックされたビュー（画面コントロール）
         * @return なし
         */
        @Override
        public void onClick(View v) {
            EditText input = (EditText)findViewById(R.id.etName);
            TextView output = (TextView)findViewById(R.id.tvOutput);

            // リスナ設定されたボタンによって処理分岐
            switch (v.getId()) {
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
                default:
                    break;
            }

        }
    }
}
