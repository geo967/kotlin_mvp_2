package com.example.mvpexample2.model

interface GetQuote {
    fun getNextQuote(nxtQuote:NextQuoteToDisplay)

    interface NextQuoteToDisplay{
        fun nextQuote(s:String)
    }

}