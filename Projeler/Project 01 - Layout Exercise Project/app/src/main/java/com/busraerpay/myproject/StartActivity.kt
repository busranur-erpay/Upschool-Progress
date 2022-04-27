package com.busraerpay.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.busraerpay.myproject.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var startBinding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startBinding=DataBindingUtil.setContentView(this,R.layout.activity_start)
        //setContentView(R.layout.activity_start)
        //tıklandığı durumda
        startBinding.signinButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent:Intent = Intent(this,PremiumActivity::class.java)
        startActivity(intent)
    }
}