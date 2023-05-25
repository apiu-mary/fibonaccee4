package com.example.fibonaccee4





import numbersRvAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonaccee4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNumberList()
    }

    fun displayNumberList() {
        val numbers = getFibonacciNumbers(100)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val numberAdapter = numbersRvAdapter(numbers)
        binding.rvNumbers.adapter = numberAdapter
    }
    fun getFibonacciNumbers(count: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until count) {
            val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
            fibonacciNumbers.add(nextNumber)
        }
        return fibonacciNumbers
    }

    }

