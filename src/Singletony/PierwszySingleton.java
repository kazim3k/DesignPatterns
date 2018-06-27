package Singletony;

public class PierwszySingleton {
    private static PierwszySingleton ourInstance = new PierwszySingleton();

    public static PierwszySingleton getInstance() {
        return ourInstance;
    }

    private PierwszySingleton() {
    }
}
