package interfaces

import interfaces.IObserver

//TODO:
//MAKE THIS ABSTRACT CLASS???
interface ISubject {

    fun addObserver(observer: IObserver)
}