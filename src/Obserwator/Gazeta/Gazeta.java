package Obserwator.Gazeta;

import java.util.ArrayList;

public class Gazeta implements Podmiot {

    ArrayList <Observer> observers = new ArrayList<>();
    private String gazeta;

    public void nowaGazeta(String gazeta) {
        this.gazeta = gazeta;
        dostarcz();
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
    public void dostarcz() {
        for (Observer observer:observers){
            observer.odbierz(gazeta);
        }

    }
}
