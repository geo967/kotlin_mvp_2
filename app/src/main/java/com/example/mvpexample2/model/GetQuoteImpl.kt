package com.example.mvpexample2.model

import java.util.*

class GetQuoteImpl:GetQuote {
    override fun getNextQuote(nxtQuote: GetQuote.NextQuoteToDisplay){
        val random = Random()
        val index: Int = random.nextInt(myList.size)
        nxtQuote.nextQuote(myList[index])
    }

    private val myList= listOf<String>(
        "Be yourself. everyone else is already taken.",
        "A room without books is like a body without a soul.",
        "You only live once, but if you do it right, once is enough",
        "Be the change that you wish to see in the world",
        "If you tell the truth, you don't have to remember anything."
    )
}