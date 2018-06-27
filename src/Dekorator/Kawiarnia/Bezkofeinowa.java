package Dekorator.Kawiarnia;

public class Bezkofeinowa extends Napoj {
    @Override
    public double cost() {
        return 12.00;
    }

    public Bezkofeinowa() {
        opis = "Bezkofeinowa";
    }
}
