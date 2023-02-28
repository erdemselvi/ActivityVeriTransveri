package com.erdemselvi.aktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ileri(view:View){
        val isim=isimText.text.toString()
        val soyisim=soyisimText.text.toString()


        val intent=Intent(this,IkinciAktivite::class.java)
        intent.putExtra("aktarilanIsim",isim)
        intent.putExtra("aktarilanSoyIsim",soyisim)

        startActivity(intent)
        finish()  //sayfayı kapatıyor
    }
}