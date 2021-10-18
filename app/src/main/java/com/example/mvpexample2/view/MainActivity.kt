 package com.example.mvpexample2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpexample2.databinding.ActivityMainBinding
import com.example.mvpexample2.model.GetQuoteImpl
import com.example.mvpexample2.presenter.MainPresenter
import com.example.mvpexample2.presenter.MainPresenterImpl
import com.example.mvpexample2.view.MainView

 class MainActivity : AppCompatActivity(),MainView {
     lateinit var binding:ActivityMainBinding
     lateinit var presenter:MainPresenter

     override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            presenter=MainPresenterImpl(this,GetQuoteImpl())
            presenter.onButtonClick()
        }
    }

     override fun setQuote(s: String) {
         binding.textViewId.text=s
     }

 }