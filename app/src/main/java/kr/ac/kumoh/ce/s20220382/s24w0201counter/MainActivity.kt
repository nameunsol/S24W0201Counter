package kr.ac.kumoh.ce.s20220382.s24w0201counter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.ce.s20220382.s24w0201counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.txtCount.text = "눌렸습니다"
            main.txtCount.text = "${++count}"
        }

        main.btnSub.setOnClickListener{
            if(count>0) {
                main.txtCount.text = "${--count}"
            }
        }
        main.btnReset.setOnClickListener{
            count = 0
            main.txtCount.text = "$count"
        }
    }
}