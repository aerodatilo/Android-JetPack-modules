package com.hybot.jetpack.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hybot.jetpack.model.Personagem
import java.util.*
import kotlin.concurrent.timerTask

class PersonagensViewModel : ViewModel() {
    val personagens = MutableLiveData<List<Personagem>>()
    init{
        val timer = Timer)_

        timer.schedule(
            timerTask {

            val harryPotter = Personagem("Harry Pooter", "https://hp-api.herokuapp.com/images/harry.jpg")
            val hermione = Personagem("Hermione", "https://hp-api.herokuapp.com/images/hermione.jpeg")

                personagens.postValue(listOf(harryPotter, hermione))
            }, 2000
        )
    }
}