package Obserwator.Pogodynka;

import Obserwator.Pogodynka.Displays.WarunkiBierzace;

public class Demo {
    public static void main(String[] args) {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBierzace wb = new WarunkiBierzace(dp);

        dp.ustawOdczyt(12.3f,11,1024);

    }
}
