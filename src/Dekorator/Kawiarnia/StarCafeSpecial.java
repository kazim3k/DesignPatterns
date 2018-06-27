package Dekorator.Kawiarnia;

public class StarCafeSpecial extends Napoj {
    @Override
    public double cost() {
        return 15.00;
    }
    public StarCafeSpecial () {
        opis = "Star Cafe Special";
    }
}
