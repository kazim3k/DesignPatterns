package Strategia.Sortowanie;

import Strategia.Sortowanie.TypySortowan.BubbleSort;
import Strategia.Sortowanie.TypySortowan.CountSort;
import Strategia.Sortowanie.TypySortowan.SortInterface;

public class WykonajSortowanie {
    private SortInterface sortowanie;

    public int [] wykonajSortowanie(int [] tab) {
        if (this.hasMinusNubers(tab)) {
            sortowanie = new BubbleSort();
        } else {
            sortowanie = new CountSort();
        }
        return sortowanie.sortuj(tab);
    }

    public boolean hasMinusNubers ( int [] tab) {
        for (int i = 0; i < tab.length ; i++) {
            if ( tab [i] < 0) {
                return true;
            }
        }
        return false;
    }
}

