package com.sabran.mobileappspoli

import android.annotation.SuppressLint
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
    private lateinit var rv_Galeri : RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)
        rv_Galeri = findViewById(R.id.rv_Galeri)

        rv_Galeri.layoutManager = GridLayoutManager(this, 1)
        val adapter = GaleriAdapter(Mocklist.getModel() as ArrayList<GaleriModel>)
        rv_Galeri.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}