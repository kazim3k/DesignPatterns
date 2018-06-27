package Singletony;

public class SingletonLeniwy {
    private static SingletonLeniwy instance;

    private SingletonLeniwy(){};

    public static SingletonLeniwy getInstance() {
        if (instance == null) {
            instance = new SingletonLeniwy();
        }
        return instance;

    }
}
