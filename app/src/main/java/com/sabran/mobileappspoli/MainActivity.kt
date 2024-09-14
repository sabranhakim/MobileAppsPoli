package com.sabran.mobileappspoli

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnGaleri : Button

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_main)

    btnMi = findViewById(R.id.btnMi)
    btnTekom = findViewById(R.id.btnTekom)
    btnGaleri = findViewById(R.id.btnGaleri)

    // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
    // untuk widget yang dipakai, harus dideklarasi dahulu
    // kita deklarasi findviewby id

    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }
    btnMi.setOnClickListener() {
        val intentMenu5 = Intent(this@MainActivity, ManajemenInformatika::class.java)
        startActivity(intentMenu5)
    }
    btnTekom.setOnClickListener() {
        val intentMenu5 = Intent(this@MainActivity, TeknikKomputer::class.java)
        startActivity(intentMenu5)
    }
    btnGaleri.setOnClickListener() {
        val intentMenu5 = Intent(this@MainActivity, Galeri::class.java)
        startActivity(intentMenu5)
    }
}
}