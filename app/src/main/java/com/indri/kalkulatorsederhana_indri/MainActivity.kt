package com.indri.kalkulatorsederhana_indri

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etAngka1: EditText
    private lateinit var etAngka2: EditText
    private lateinit var btnTambah: Button
    private lateinit var btnKurang: Button
    private lateinit var btnKali: Button
    private lateinit var txtHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etAngka1 = findViewById(R.id.etangka1)
        etAngka2 = findViewById(R.id.etangka2)
        btnTambah = findViewById(R.id.btntambah)
        btnKurang = findViewById(R.id.btnkurang)
        btnKali = findViewById(R.id.btnkali)
        txtHasil = findViewById(R.id.txthasil)

        btnTambah.setOnClickListener {
            val hasil = etAngka1.text.toString().toInt() + etAngka2.text.toString().toInt()
            txtHasil.text = "Hasil Penambahan: $hasil"
        }

        btnKurang.setOnClickListener {
            val hasil = etAngka1.text.toString().toInt() - etAngka2.text.toString().toInt()
            txtHasil.text = "Hasil Pengurangan: $hasil"
        }

        btnKali.setOnClickListener {
            val hasil = etAngka1.text.toString().toInt() * etAngka2.text.toString().toInt()
            txtHasil.text = "Hasil Perkalian: $hasil"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}