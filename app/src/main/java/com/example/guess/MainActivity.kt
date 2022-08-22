package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = this.javaClass.simpleName
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: secret number = ${secretNumber.secretNum}")

        btn_enter.setOnClickListener {
            val number = et_inputNum.text.toString().toInt()
            val diff = secretNumber.validate(number)
            var message = "correct"
            if (diff > 0)
                message = "too big"
            else if (diff < 0)
                message = "too small"
            AlertDialog.Builder(this)
                .setTitle("Message")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show()
        }
    }
}