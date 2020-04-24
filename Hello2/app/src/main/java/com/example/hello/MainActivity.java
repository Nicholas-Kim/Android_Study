package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //버튼이 클릭된 횟수를 저장하는 변수를 선언
    int clickcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        //레이아웃에 button 이라는 ID로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
       findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               clickcount++;

               String text = "";
               for(int i=0;i<clickcount;i++){
                   text+="안녕";
               }

               //버튼이 클릭되면 클릭된 횟수를 증가하면서 토스트 메세지를 보여준다.
               Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
           }
       });



    }


}
