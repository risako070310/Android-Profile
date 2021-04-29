package com.risako070310.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileImage.isVisible = false
        profileCommentText.isVisible = false

        button.setOnClickListener {
            profileImage.isVisible = true
            profileCommentText.isVisible = true
        }

    }
}