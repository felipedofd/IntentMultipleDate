package com.example.intentmultipledate

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentmultipledate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageView = R.drawable.image
        val name = "24kGold"
        val description = getString(R.string.description_24kgold)

        binding.imageView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("image", imageView)
            intent.putExtra("description", description)
            intent.putExtra("name", name)

            startActivity(intent)
        }

    }

}
