package com.uty.responsi_109


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var et_username:EditText
    private lateinit var et_password:EditText
    private lateinit var btn_login:Button
    private lateinit var tv_tanya:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        btn_login =  findViewById(R.id.btn_login)
        tv_tanya = findViewById(R.id.tv_tanya)

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
        }

        btn_login.setOnClickListener(){
            if (et_username.text.toString() == "assami" && et_password.text.toString() =="assami"){
                val intent = Intent (this, HomeActivity::class.java)
                intent.putExtra("nama_lengkap", nama_lengkap)
                intent.putExtra("jenis_kelamin",jk)
                intent.putExtra("alamat", alamat)
                intent.putExtra("no_telp", no_telp)
                startActivity(intent)
            }

        }

        tv_tanya.setOnClickListener(){
            val intent = Intent(this, FormRegister::class.java)
            startActivity(intent)
        }
    }
}
