package com.busraerpay.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.busraerpay.myproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        binding.startnowButton.setOnClickListener(this)
        //tıklandığı durumda
    }

    override fun onClick(p0: View?) {
        val intent:Intent= Intent(this,StartActivity::class.java)
        startActivity(intent)
    }
}