package com.rpm.mvvmexampleapp.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.rpm.mvvmexampleapp.databinding.ActivityMainBinding
import com.rpm.mvvmexampleapp.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(
            this,
            Observer { quote ->
                binding.txtQuote.text = quote.quote
                binding.txtAuthor.text = quote.author
            }
        )

        binding.lytMainContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }

}