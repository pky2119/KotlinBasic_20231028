package kr.ac.wku.kotlinbasic_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.kotlinbasic_20231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLog.setOnClickListener{

//             로그 버튼이 클릭 되면 실행될 코드 스코프

//            로그 찍어보기
            Log.d("메인화면", "로그 버튼 클릭됨")
            Log.e("메인화면", "e로 로그 찍어보기")
            Log.wtf("메인화면", "wtf로 로그 찍어보기")

        }

        binding.btnToast.setOnClickListener {

//            Toast 버튼이 클릭되면 => Toast 띄우기

            Toast.makeText(this, "토스트 클릭됨", Toast.LENGTH_SHORT).show()
        }

        binding.btnVariable.setOnClickListener{
            
            // 코틀린 변수 문법 연습
            // 내 이름 저장할 변수 (String) => 변동 가능성 있다
            
            var myName : String
            
            // 내 이름을 저장
            myName = "박건용"
            
            // 이름 변경 => 용건박 (역순)
            myName = "용건박"

            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show() // 용건박 문구 토스트
        }
        
    }
}