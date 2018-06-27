package Dekorator.Kawiarnia.Dekoratory;

import Dekorator.Kawiarnia.Napoj;

public class MlekoSojowe extends Dekorator {
    private Napoj napoj;

    public MlekoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " z mlekiem sojowym";
    }

    @Override
    public double cost() {
        return napoj.cost() + 2.00;
    }
}
