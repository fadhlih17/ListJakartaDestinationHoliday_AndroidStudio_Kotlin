package com.ind.wisatajakarta

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    private lateinit var imgDetailImage : ImageView
    private lateinit var tvDetailNama : TextView
    private lateinit var tvDetailLokasi : TextView
    private lateinit var tvDetailJambuka : TextView
    private lateinit var tvDetailDeskripsi : TextView
    private lateinit var btn_action_share : ImageView

    companion object{
        const val KEY_NAMA = "key_nama"
        const val KEY_LOKASI = "key_lokasi"
        const val KEY_DESC = "key_desc"
        const val KEY_JAMBUKA = "key_jam"
        const val KEY_IMAGE = "key_img"
        const val KEY_URL = "key_url"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_detail)

        tvDetailNama = findViewById(R.id.tvDetailNama)
        tvDetailLokasi = findViewById(R.id.tvDetailLokasi)
        tvDetailJambuka = findViewById(R.id.tvDetailJambuka)
        tvDetailDeskripsi = findViewById(R.id.tvDetailDeskripsi)
        imgDetailImage = findViewById(R.id.imgDetailImg)
        btn_action_share = findViewById(R.id.btn_action_share)

        val namaWisata = intent.getStringExtra(KEY_NAMA)
        val lokasiWisata = intent.getStringExtra(KEY_LOKASI)
        val jamWisata = intent.getStringExtra(KEY_JAMBUKA)
        val descWisata = intent.getStringExtra(KEY_DESC)
        val url = intent.getStringExtra(KEY_URL)
        val imgWisata = intent.getIntExtra(KEY_IMAGE, 0)

        Glide.with(this)
            .load(imgWisata)
            .fitCenter()
            .into(imgDetailImage)
        tvDetailNama.text = namaWisata
        tvDetailLokasi.text = lokasiWisata
        tvDetailJambuka.text = jamWisata
        tvDetailDeskripsi.text = descWisata

        btn_action_share.setOnClickListener{
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, url)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to : "))
        }


    }


}