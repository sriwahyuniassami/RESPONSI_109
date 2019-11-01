package com.uty.responsi_109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AccountActivity : AppCompatActivity() {

    private lateinit var tvNamaLengkap: TextView
    private lateinit var tvJenisKelamin: TextView
    private lateinit var tvAlamat: TextView
    private lateinit var tvNoTelp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        tvNamaLengkap = findViewById(R.id.tv_nama_lengkap)
        tvJenisKelamin = findViewById(R.id.tv_jk)
        tvAlamat = findViewById(R.id.tv_alamat)

        var nama_lengkap :String? = ""
        var jk :String? = ""
        var alamat : String? = ""
        var no_telp : String? = ""

        if(intent.extras != null){
            val bundle = intent.extras
            nama_lengkap = bundle?.getString("nama_lengkap")
            jk = bundle?.getString("jenis_kelamin")
            alamat = bundle?.getString("alamat")
            no_telp = bundle?.getString("no_telp")

            tvNamaLengkap.setText(nama_lengkap)
            tvJenisKelamin.setText(jk)
            tvAlamat.setText(alamat)
            tvNoTelp.setText(no_telp)
        }
    }
}
