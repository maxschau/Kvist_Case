package models

import Logger
import enums.Climate
import interfaces.IObserver
import interfaces.ISubject

class WeatherStation : IObserver {

    fun addUnit(subject : ISubject) {
        subject.addObserver(this)
    }

    override fun update(climate: Climate, value: Int) {
        Logger.log("$climate | value: $value")
    }
}
