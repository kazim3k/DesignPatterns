package Dekorator.Kawiarnia.Dekoratory;

import Dekorator.Kawiarnia.Napoj;

public class Czekolada extends Dekorator {
    private Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() +" z czekoladą";
    }

    @Override
    public double cost() {
        return napoj.cost() + 2.00;
    }
}
