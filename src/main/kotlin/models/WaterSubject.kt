import enums.Climate
import interfaces.IObserver
import interfaces.ISubject
import models.SuperUnit

class WaterUnit(_location: String) : SuperUnit(_location) {
    override val LIMIT: Int = 6

    var temperature : Int = 0
        set(newTemperature : Int) {
            if (newTemperature > LIMIT) {
                observers.forEach{
                    it.update(Climate.TEMPERATURE, newTemperature)
                }
            }
            field = newTemperature
        }

}