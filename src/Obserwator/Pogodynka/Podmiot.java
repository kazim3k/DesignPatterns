package Obserwator.Pogodynka;

public interface Podmiot {
    void add(Observer observer);
    void delete(Observer observer);
    void notification();
}
