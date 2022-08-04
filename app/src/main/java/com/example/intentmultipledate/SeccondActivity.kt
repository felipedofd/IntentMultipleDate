package com.example.intentmultipledate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentmultipledate.databinding.ActivitySeccondBinding

class SeccondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeccondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeccondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}