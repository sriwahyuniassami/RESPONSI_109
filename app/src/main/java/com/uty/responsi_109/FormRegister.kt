package com.uty.responsi_109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form_register.*

class FormRegister : AppCompatActivity() {
    private lateinit var et_nama_lengkap:EditText
    private lateinit var et_jk:EditText
    private lateinit var et_alamat:EditText
    private lateinit var et_no_telp:EditText
    private lateinit var btn_daftar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_register)

        et_nama_lengkap = findViewById(R.id.et_nama_lengkap)
        et_jk = findViewById(R.id.et_jk)
        et_alamat = findViewById(R.id.et_alamat)
        et_no_telp = findViewById(R.id.et_no_telp)
        btn_daftar = findViewById(R.id.btn_daftar)

        btn_daftar.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("nama_lengkap", et_nama_lengkap.text.toString())
            intent.putExtra("jenis_kelamin", et_jk.text.toString())
            intent.putExtra("alamat",et_alamat.text.toString())
            intent.putExtra("no_telp", et_no_telp.text.toString())
            Toast.makeText(this, "Biodata Anda Berhasil Disimpan", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}
