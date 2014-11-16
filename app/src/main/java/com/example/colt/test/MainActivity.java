package com.example.colt.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private int buttonClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.main_button1);
        button1.setText("点击我");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showClickTime(v);
                if(buttonClickTime %10 == 0){
                    Intent it = new Intent(MainActivity.this,SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("clickTime",buttonClickTime);
                    it.putExtras(bundle);
                    startActivity(it);
                }
            }
        });

        Button chatRoomBtn = (Button) findViewById(R.id.btn_chat_room);
        chatRoomBtn.setText("进入聊天室");
        chatRoomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,ChatRoomActivity.class);
                startActivity(it);
            }
        });
    }



    public void showClickTime(View tager){
        TextView msg = (TextView) this.findViewById(R.id.main_msg);
        msg.setText(String.format("你点击了%d次",++buttonClickTime));
    }
}
