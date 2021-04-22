package interfaces

import enums.Climate

interface IObserver {
    fun update(climate: Climate, value : Int)

}