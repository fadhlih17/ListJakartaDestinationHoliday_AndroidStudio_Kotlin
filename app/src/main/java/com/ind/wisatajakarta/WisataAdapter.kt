package com.ind.wisatajakarta

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class WisataAdapter (private val listWisata : ArrayList<Wisata>) : RecyclerView.Adapter<WisataAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvMenuNama = itemView.findViewById<TextView>(R.id.tvMenuNama)
        var tvMenuLokasi = itemView.findViewById<TextView>(R.id.tvMenuLokasi)
        var tvMenuDeskripsi = itemView.findViewById<TextView>(R.id.tvMenuDeskripsi)
        var imgMenuItem = itemView.findViewById<ImageView>(R.id.imgMenuItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_menu_wisata, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.gambar)
            .fitCenter()
            .into(holder.imgMenuItem)

        holder.tvMenuNama.text = wisata.nama
        holder.tvMenuLokasi.text = wisata.alamat
        holder.tvMenuDeskripsi.text = wisata.deskripsi
        //holder.itemView.setOnClickListener{ Toast.makeText(holder.itemView.context, "Kamu memilih " + listWisata[position].nama, Toast.LENGTH_SHORT).show()}
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.KEY_NAMA,wisata.nama)
            intent.putExtra(DetailActivity.KEY_LOKASI,wisata.alamat)
            intent.putExtra(DetailActivity.KEY_JAMBUKA, wisata.jamBuka)
            intent.putExtra(DetailActivity.KEY_DESC,wisata.deskripsi)
            intent.putExtra(DetailActivity.KEY_IMAGE, wisata.gambar)
            intent.putExtra(DetailActivity.KEY_URL, wisata.url)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

}