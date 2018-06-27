package Obserwator.Gazeta;

public interface Podmiot {
    void add(Observer observer);
    void delete(Observer observer);
    void dostarcz();
}
