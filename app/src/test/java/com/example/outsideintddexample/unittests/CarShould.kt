package com.example.outsideintddexample.unittests

import com.example.outsideintddexample.Car
import com.example.outsideintddexample.Engine
import junit.framework.TestCase.assertEquals


import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

class CarShould {
    private val engine: Engine = mock()
    private val car = Car(5.0,engine)

    @Test
    fun loosingFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine(){
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }

}