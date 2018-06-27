package Strategia.Sortowanie.TypySortowan;

import Strategia.Sortowanie.TypySortowan.SortInterface;

public class BubbleSort implements SortInterface {


@Override
    public int [] sortuj(int [] tab) {
        for (int i = 0; i < (tab.length ); i++) {
            for (int j = 0; j < (tab.length - 1);j++ ) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        return tab;
    }
}
