package Obserwator.Pogodynka;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements Podmiot {

    ArrayList <Observer> observers = new ArrayList<>();
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public void odczytyZmiana(){
        notification();

    }

    public void ustawOdczyt(float temp,float wilgotnosc,float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : observers) {
            observer.actualization(temp,cisnienie,wilgotnosc);
        }

    }
}
