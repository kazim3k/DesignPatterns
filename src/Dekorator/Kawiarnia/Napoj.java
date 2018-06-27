package Dekorator.Kawiarnia;

public abstract class Napoj {
    protected String opis;

    public String getOpis() {
        return opis;
    }

    public abstract double cost();
}
