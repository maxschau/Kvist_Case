package interfaces

import interfaces.IObserver

interface ISubject {
    fun addObserver(observer: IObserver)
}
