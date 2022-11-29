package com.example.lovecalculator48

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.lovecalculator48.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val viewModel: LoveViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            startBtn.setOnClickListener {
                viewModel.liveModel(firstEd.text.toString(), secondEd.text.toString())
                    .observe(this@MainActivity
                    ) {
                        val intent = Intent(this@MainActivity,ResultActivity::class.java)
                        intent.putExtra("data", it!!)
                        startActivity(intent)
                    }

            }
        }
    }
}