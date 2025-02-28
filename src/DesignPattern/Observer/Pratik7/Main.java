package DesignPattern.Observer.Pratik7;
/*
Senaryo
Subject: Hava durumu merkezi (WeatherStation), sıcaklık bilgisini tutar ve değişiklikleri gözlemcilere bildirir.
Observers: Telefon ve bilgisayar gibi cihazlar, sıcaklık değişikliklerinden haberdar olmak ister.
Açıklamalar
WeatherStation (Subject): Sıcaklık değişikliklerini takip eder ve gözlemcilere bildirir.
PhoneDisplay (Observer): Güncellenen sıcaklık bilgisini alır ve ekrana yansıtır.
Kullanım: WeatherStation üzerinden sıcaklık değiştirildiğinde, gözlemciler otomatik olarak bilgilendirilir.
 */
public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation=new WeatherStation();
        PhoneDisplay phone1=new PhoneDisplay("Phone 1");
        PhoneDisplay phone2=new PhoneDisplay("Phone 2");
        //Gözlemcileri Kaydet
        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);

        //Hava Durumu değişikliklerini simüle et
        weatherStation.setTemperature(25);
        // Çıktı:
        // WeatherStation: New temperature is 25°C
        // Phone 1: Received temperature update: 25°C
        // Phone 2: Received temperature update: 25°C


        weatherStation.setTemperature(30);
        // Çıktı:
        // WeatherStation: New temperature is 30°C
        // Phone 1: Received temperature update: 30°C
        // Phone 2: Received temperature update: 30°C
//Bir gözlemciyi çıkar
        weatherStation.removeObserver(phone1);
        weatherStation.setTemperature(35);
        // Çıktı:
        // WeatherStation: New temperature is 35°C
        // Phone 2: Received temperature update: 35°C


    }
}
