package com.example.outsideintddexample

class Engine(
    var isTurnedOn: Boolean = false,
    var temperature: Int = 15) {
    fun turnOn() {
        isTurnedOn = true
        temperature = 95
    }

}