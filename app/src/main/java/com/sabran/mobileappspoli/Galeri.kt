package com.sabran.mobileappspoli

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappspoli.adapter.GaleriAdapter
import com.sabran.mobileappspoli.model.GaleriModel
import com.sabran.mobileappspoli.model.Mocklist

class Galeri : AppCompatActivity() {
    private lateinit var rv_Galeri: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)
        rv_Galeri = findViewById(R.id.rv_Galeri)

        rv_Galeri.layoutManager = GridLayoutManager(this, 2)
        val adapter = GaleriAdapter(Mocklist.getModel() as ArrayList<GaleriModel>) { item ->
            // Saat item gambar diklik, pindah ke halaman detail dengan membawa gambar
            val intent = Intent(this, PhotoDetails::class.java)
            intent.putExtra("IMAGE_ID", item.gambar1) // Kirim resource id
            startActivity(intent)
        }
        rv_Galeri.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}