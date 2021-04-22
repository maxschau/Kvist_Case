# WeatherStation

## Min tolkning av oppgaven

Det vanligste med dette designmønsteret er å ha et "subject" som gir beskjed til flere observer-objekter når noe inntreffer. For eksempel kunne en YouTube-kanal vært et Subject som varslet alle subscribers (Observers) når en video var lagt ut. 

I dette tilfellet ble WeaterStation en observer som lyttet til flere Subjects (AirUnit og WaterUnit). 

Måten dette ble løst på var å kalle på addUnit()-metoden i WeatherStation som der igjen kallet på addObserver() til Subject. Slik ble WeaterStation lagt inn som en Observer i Subject.

Deretter kunne både AirUnit og WaterUnit varsle sine observers (som i dette tilfellet var kun WeatherStation) når enten temperaturen eller luftfuktigheten overskred den satte grensen. 

**Antar at når det står understiger så skal luftfuktigheten være mindre enn 10 selv om skjermbildet av når det skulle være en logg-sjekk tilsier noe annet**