package Dekorator.Kawiarnia.Dekoratory;

import Dekorator.Kawiarnia.Napoj;

public class BitaSmietana extends Dekorator {
    private Napoj napoj;

    public BitaSmietana (Napoj napoj){
        this.napoj = napoj;
    }
    @Override
    public String getOpis() {
        return napoj.getOpis() + " z bitą śmietaną";
    }

    @Override
    public double cost() {
        return 2.0 + napoj.cost();
    }
}
