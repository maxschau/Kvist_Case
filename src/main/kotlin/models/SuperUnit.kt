package models

import interfaces.IObserver
import interfaces.ISubject
import java.util.*

abstract class SuperUnit(_location : String) : ISubject {
    private val id = UUID.randomUUID()
    open val LIMIT = 0
    private var location : String = _location
    var observers: ArrayList<IObserver> = ArrayList()

    override fun addObserver(observer : IObserver) {
        observers.add(observer)
    }


}