package com.uty.responsi_109

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.responsi_109.Model.DataWisata
import com.uty.responsi_109.Model.Wisata

class HomeActivity : AppCompatActivity() {
    private lateinit var btnBiodata:Button

    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnBiodata = findViewById(R.id.btn_biodata)

        rvWisata = findViewById(R.id.listviewwisata)
        rvWisata.setHasFixedSize(true)
        list.addAll(DataWisata.listWisata)
        showWisataList()

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

        btnBiodata.setOnClickListener(){
                val intent = Intent(this, AccountActivity::class.java)
                intent.putExtra("nama_lengkap", nama_lengkap)
                intent.putExtra("jenis_kelamin",jk)
                intent.putExtra("alamat", alamat)
                intent.putExtra("no_telp", no_telp)
                startActivity(intent)
            }

        }
    private fun showWisataList(){
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listAdapter
    }
}
