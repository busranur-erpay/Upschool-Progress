package com.busraerpay.myproject

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale
import androidx.databinding.DataBindingUtil
import com.busraerpay.myproject.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var premiumBinding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        premiumBinding=DataBindingUtil.setContentView(this,R.layout.activity_premium)
        //setContentView(R.layout.activity_premium)
        premiumBinding.premiumButton.setOnClickListener(this)

       //val tvSpannableString: TextView=findViewById(R.id.tv_spannable_string)
       // val tvSpannableString2: TextView=findViewById(R.id.tv_spannable_string2)

        val spannableString=SpannableStringBuilder()
                .bold { color(Color.parseColor("#2C2B47")) {scale(1.5f) {append("$11.99\n")}}}
                .bold { color(Color.parseColor("#87869E")) { append("$11.99 ") }}
                .bold { color(Color.parseColor("#B9B8C6")) { append("per month\n") }}
                .bold { color(Color.parseColor("#87869E")) { append("$143.99 ") }}
                .bold { color(Color.parseColor("#B9B8C6")) { append("per year") }}

         //tvSpannableString.text = spannableString
        premiumBinding.tvSpannableString.text=spannableString

        val spannableString2=SpannableStringBuilder()
                .bold { color(Color.parseColor("#2C2B47")) {scale(1.5f) {append("$4.99\n")}}}
                .bold { color(Color.parseColor("#87869E")) { append("$4.99 ") }}
                .bold { color(Color.parseColor("#B9B8C6")) { append("per month\n") }}
                .bold { color(Color.parseColor("#87869E")) { append("$59.99 ") }}
                .bold { color(Color.parseColor("#B9B8C6")) { append("per year") }}

        //tvSpannableString2.text = spannableString2
        premiumBinding.tvSpannableString2.text=spannableString2
    }

    override fun onClick(p0: View?) {
        val intent: Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}