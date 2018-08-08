package com.example.mrtayyab.animationkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.drawable.AnimationDrawable
import android.support.constraint.ConstraintLayout






class MainActivity : AppCompatActivity() {

//    private AnimationDrawable animationDrawable;
lateinit var constraintLayout: ConstraintLayout
    lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // init constraintLayout
        constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout

        // initializing animation drawable by getting background from constraint layout
        animationDrawable = constraintLayout.background as AnimationDrawable

        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(5000)

        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000)

    }

    override fun onResume() {
        super.onResume()
        if (animationDrawable != null && !animationDrawable.isRunning) {
            // start the animation
            animationDrawable.start()
        }

    }

    override fun onPause() {
        super.onPause()
        if (animationDrawable != null && animationDrawable.isRunning) {
            // stop the animation
            animationDrawable.stop()
        }
    }
}
