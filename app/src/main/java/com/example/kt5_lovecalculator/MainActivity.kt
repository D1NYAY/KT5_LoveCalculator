package com.example.kt5_lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kt5_lovecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initClickers(){
        with(binding){

        }
    }
}