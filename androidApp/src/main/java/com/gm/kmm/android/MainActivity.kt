package com.gm.kmm.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gm.kmm.GetGreetingUseCase
import org.koin.java.KoinJavaComponent.inject

class MainActivity : AppCompatActivity() {

    private val getGreetingUseCase: GetGreetingUseCase by inject(GetGreetingUseCase::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text_view).text = getGreetingUseCase.invoke()
    }
}
