package Dekorator.Kawiarnia;

public class Espresso extends Napoj{
    @Override
    public double cost() {
        return 7.00;
    }

    public Espresso () {
        opis = "Espresso";
    }
}
