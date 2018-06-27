package Dekorator.Kawiarnia;

import Dekorator.Kawiarnia.Dekoratory.BitaSmietana;
import Dekorator.Kawiarnia.Dekoratory.Czekolada;

public class Demo {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        BitaSmietana espressoZBitaSmietana = new BitaSmietana(espresso);
        Czekolada espressoZCzekoladaIZMlekiem = new Czekolada(espressoZBitaSmietana);

        System.out.println(espressoZCzekoladaIZMlekiem.cost());
        System.out.println(espressoZCzekoladaIZMlekiem.getOpis());
    }
}
