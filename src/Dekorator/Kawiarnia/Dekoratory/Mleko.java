package Dekorator.Kawiarnia.Dekoratory;

import Dekorator.Kawiarnia.Napoj;

public class Mleko extends Dekorator {
    private Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " z mlekiem" ;
    }

    @Override
    public double cost() {
        return napoj.cost() + 2.00;
    }
}
