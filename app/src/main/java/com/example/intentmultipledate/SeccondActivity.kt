package com.example.intentmultipledate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.drawToBitmap
import com.example.intentmultipledate.databinding.ActivitySeccondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeccondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeccondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataReceivedViaIntent = intent.extras
        val name = dataReceivedViaIntent?.getString("name")
        val image = dataReceivedViaIntent?.getInt("image")
        val description = dataReceivedViaIntent?.getString("description")

        binding.nameSecondActivity.text = name
        binding.imageSecondActivity.setImageResource(image!!)
        binding.descriptionSecondAtivity.text = description
        binding.backButtonSecondActivity.setOnClickListener { finish() }


    }
}