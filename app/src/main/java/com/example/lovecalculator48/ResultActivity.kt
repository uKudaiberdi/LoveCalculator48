package com.example.lovecalculator48

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lovecalculator48.databinding.ActivityResultBinding
import com.example.lovecalculator48.remote.LoveModel

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var result :LoveModel = intent.getSerializableExtra("data") as LoveModel

        binding.firstName.text = result.firstName
        binding.secondName.text = result.secondName
        binding.percent.text = result.percentage
        binding.result.text = result.result


    }
}