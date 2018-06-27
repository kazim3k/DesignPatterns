package Strategia.Sortowanie;

import java.util.Arrays;
import java.util.Scanner;

public class DemoSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb w nieuporządkowanej tablicy");
        int number = scanner.nextInt();
        int [] tab = new int [number];

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = (int)(Math.random()*-10);
        }
        System.out.println("Utworzyles taką tablice: " + Arrays.toString(tab));

        WykonajSortowanie sorter = new WykonajSortowanie();

        System.out.println(Arrays.toString(sorter.wykonajSortowanie(tab)));
    }





}
