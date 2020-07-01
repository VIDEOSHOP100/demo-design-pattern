package observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject{
    //instance variable declarations
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void measurementsChanged(){
        notifyObservers();
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();
//
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if( i >= 0 ){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0 ; i< observers.size() ; i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    //other WeatherData methods here


}
