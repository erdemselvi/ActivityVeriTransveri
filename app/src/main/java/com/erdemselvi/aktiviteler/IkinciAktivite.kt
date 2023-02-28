package com.erdemselvi.aktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)

        //getintent

        val intent = intent
        val isim=intent.getStringExtra("aktarilanIsim")
        val soyisim=intent.getStringExtra("aktarilanSoyIsim")
        ikinciAktiviteIsimText.text="İsim: ${isim}"
        ikinciAktiviteIsimText2.text="Soyisim: ${soyisim}"
    }
    fun gerigit(view:View){
    val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()    //sayfayı kapatıyor
    }
}