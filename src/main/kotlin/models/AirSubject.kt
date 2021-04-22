import enums.Climate
import models.SuperUnit

class AirUnit(_location: String) : SuperUnit(_location) {
    override val LIMIT = 10

    var humidity : Int = 0
        set(newHumidity : Int) {
            if (newHumidity < LIMIT) {
                observers.forEach{
                    it.update(Climate.HUMIDITY, newHumidity)
                }
            }
            field = newHumidity
        }

}