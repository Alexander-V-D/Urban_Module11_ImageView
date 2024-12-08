package com.example.urban_module11_imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImageActivity : AppCompatActivity() {

    private lateinit var pictureIV: ImageView
    private lateinit var nextBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        var imageNumber = 1

        pictureIV = findViewById(R.id.imageView)
        nextBTN = findViewById(R.id.nextBTN)

        nextBTN.setOnClickListener {
            imageNumber++
            when(imageNumber) {
                2 -> {
                    pictureIV.setImageResource(R.drawable.second)
                }
                3 -> {
                    pictureIV.setImageResource(R.drawable.third)
                }
                4 -> {
                    pictureIV.setImageResource(R.drawable.fourth)
                }
                5 -> {
                    pictureIV.setImageResource(R.drawable.fifth)
                }
                else -> {
                    startActivity(Intent(this, FinalActivity::class.java))
                    finish()
                }
            }
        }
    }
}