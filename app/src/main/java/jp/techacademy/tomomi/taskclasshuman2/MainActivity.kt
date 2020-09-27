package jp.techacademy.tomomi.taskclasshuman2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human1: Human = Human("tomomi", 24, "映画")

        human1.say()
        human1.think()


        val human2: Human = Human("aya", 26, "ランニング")

        human2.say()
        human2.think()


    }
}
