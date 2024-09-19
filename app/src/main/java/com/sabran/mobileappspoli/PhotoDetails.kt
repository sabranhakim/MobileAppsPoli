package com.sabran.mobileappspoli

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PhotoDetails : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)

        // Ambil gambar yang dikirim dari Galeri
        val imageId = intent.getIntExtra("IMAGE_ID", 0)

        // Set gambar ke ImageView
        val imageView = findViewById<ImageView>(R.id.imageViewDetail)
        imageView.setImageResource(imageId)
    }
}