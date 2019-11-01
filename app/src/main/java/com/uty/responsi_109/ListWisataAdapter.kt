package com.uty.responsi_109

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.responsi_109.Model.Wisata

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListWisataAdapter.WisataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListWisataAdapter.WisataViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listWisata.size
    }
    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wst = listWisata[position]
        holder.tvWisata.text = wst.wisata
        holder.tvDeskripsi.text = wst.deskripsi
        Glide.with(holder.itemView.context)
            .load(wst.gambar)
            .into(holder.gambarWisata)
    }

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvWisata: TextView = itemView.findViewById(R.id.tv_wisata)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_deksipsi)
        var gambarWisata: ImageView = itemView.findViewById(R.id.gambarWisata)
    }

}