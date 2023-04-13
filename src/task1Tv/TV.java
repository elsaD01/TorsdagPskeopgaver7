package task1Tv;

public class TV {

//Skriv en klasse, der simulerer et TV. Der skal være mulighed for at vælge kanel, volumen og tænde og slukke for TV.
// Husk at det ikke giver mening at forsøge at ændre lyd/kanal, hvis TV er slukket. Prøv at unit teste følgende adfærd:
    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);
    TV tv2 = new TV();
       tv2.channelUp();
       tv2.channelUp();
       tv2.turnOn();
       tv2.volumeUp();


}
