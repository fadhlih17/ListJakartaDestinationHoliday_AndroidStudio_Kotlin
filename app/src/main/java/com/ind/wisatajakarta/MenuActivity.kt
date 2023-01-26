package com.ind.wisatajakarta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {

    private lateinit var rvMenuWisata : RecyclerView
    private var list : ArrayList<Wisata> = arrayListOf()

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private var title: String = "List Wisata"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        rvMenuWisata = findViewById(R.id.rv_MenuWisata)
        rvMenuWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showWisata()
    }
    private fun showWisata(){
        rvMenuWisata.layoutManager = LinearLayoutManager(this)
        val wisataAdapter = WisataAdapter(list)
        rvMenuWisata.adapter = wisataAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                startActivity(Intent(this,MenuActivity::class.java))
            }
            R.id.action_about -> {
                title = "About"
                setContentView(R.layout.activity_my_profile)
            }
        }
        setActionBarTitle(title)
    }
}