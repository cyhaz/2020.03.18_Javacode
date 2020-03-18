package kr.co.youhyun.a20200318_javacode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import kr.co.youhyun.a20200318_javacode.datas.datas.User;

// Alt + Enter로 에러 해결
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEvents();
        setValues();

//        1) 이벤트 설정
//        2) 초기 화면값 세팅 (.setText 등)
//        + main 함수는 가능한한 적은 코드만 남기자
//        => onCreate 메쏘드도 가능한 깔끔하게 정리

    }

    @Override
    public void setupEvents() {

//        Intent로 UserInfoActivity 실행
//        사용자 이름 / 생년 / 성별 / 잔고 / 아이디 / 닉네임 전달
//        => User클래스를 한번에 전달하면 편하다.
//        => 데이터 전달을 가능하게 하려면, 해당 클래스가 Serializable 역할 수행 명시

        User u = new User("조경진", 1988)

        Intent intent = new Intent(mContext, UserInfoActivity.class);
        intent.putExtra("userInfo", u);
        startActivity(intent);
    }

    @Override
    public void setValues() {

        Toast.makeText(mContext, "ddd", Toast.LENGTH_SHORT).show();

    }
}
