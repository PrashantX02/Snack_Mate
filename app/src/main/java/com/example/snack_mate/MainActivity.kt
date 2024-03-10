package com.example.snack_mate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var img : ImageView;
    lateinit var student :TextView
    lateinit var food_air : ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        img = findViewById<ImageView>(R.id.food_home);

        student = findViewById(R.id.student)

        student.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity2 :: class.java)
            startActivity(intent)
        }
//        val animations = AnimationUtils.loadAnimation(applicationContext, R.anim.top_down)
//        val bot_up = AnimationUtils.loadAnimation(applicationContext, R.anim.bottom_up)
//        img.startAnimation(animations)


//        val handler = Handler(Looper.getMainLooper())
//
//        handler.postDelayed({food_air.startAnimation(bot_up)},2000)
//
//        food_air.visibility  = View.INVISIBLE;
//    }
    }
}