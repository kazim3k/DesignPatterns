package Obserwator.Pogodynka.Displays;

import Obserwator.Pogodynka.Observer;
import Obserwator.Pogodynka.Podmiot;
import Strategia.Sortowanie.WykonajSortowanie;

public class WarunkiBierzace implements Wyswietlacz,Observer {

    private float temp;
    private float cisnienie;
    private float wilgotnosc;

    public WarunkiBierzace(Podmiot dostawcaTresci) {
        dostawcaTresci.add(this);
    }

    @Override
    public void display() {
        System.out.println("Temperatura: "+temp+", Cisnienie: "+cisnienie+", Wilgotnosc: "+wilgotnosc);
    }

    @Override
    public void actualization(float temp, float cisnienie, float wilgotnosc) {
        this.temp = temp;
        this.cisnienie = cisnienie;
        this.wilgotnosc = wilgotnosc;
        display();
    }
}
