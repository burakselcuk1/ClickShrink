package com.example.click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.click.databinding.ActivityMainBinding
import com.muratozturk.click_shrink_effect.applyClickShrink

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.applyClickShrink()
        binding.textView.applyClickShrink(0.80f,150L)
        binding.cardView.applyClickShrink(0.75f,150L)
        binding.imageView.applyClickShrink(0.50f,250L)
    }
}