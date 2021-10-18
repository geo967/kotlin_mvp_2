package com.example.mvpexample2.presenter

import com.example.mvpexample2.model.GetQuote
import com.example.mvpexample2.view.MainView

class MainPresenterImpl(m:MainView,q:GetQuote):MainPresenter,GetQuote.NextQuoteToDisplay {

        private var mainView:MainView?=m
        private val getQuote: GetQuote = q

    override fun onButtonClick() {
        getQuote.getNextQuote(this)
    }

    override fun onDestroy() {
        mainView=null
    }

    override fun nextQuote(s: String) {
        mainView?.setQuote(s)
    }
}