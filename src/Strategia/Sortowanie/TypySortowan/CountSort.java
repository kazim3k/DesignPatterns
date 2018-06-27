package Strategia.Sortowanie.TypySortowan;

import Strategia.Sortowanie.TypySortowan.SortInterface;

public class CountSort implements SortInterface {

@Override
    public int [] sortuj(int [] tab) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length ; i++) {
            if (tab[i] > max ) {
                max = tab[i];
            }
        }
        int [] counterTab = new int [max + 1];

        for (int i = 0; i < tab.length ; i++) {
            counterTab[tab[i]]++;
        }
        int indexator = 0;
        int [] resultTab = new int [tab.length];
        for (int i = 0; i < counterTab.length ; i++) {
            for (int j = 0; j < counterTab[i]; j++) {
                resultTab[indexator] = i;
                indexator++;
            }
        }
        return resultTab;
    }
}
