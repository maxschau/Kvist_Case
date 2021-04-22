import models.WeatherStation

fun main() {
    val system = WeatherStation()
    val waterUnit = WaterUnit("Gløshaugen")
    val airUnit = AirUnit("Gløshaugen")

    system.addUnit(waterUnit)
    system.addUnit(airUnit)

    waterUnit.temperature = 3
    airUnit.humidity = 4

    waterUnit.temperature = 8
    airUnit.humidity = 12

    airUnit.humidity = 9
    airUnit.humidity = 10

    waterUnit.temperature = 12
    waterUnit.temperature = 2
    waterUnit.temperature = 6
    waterUnit.temperature = 7


}
