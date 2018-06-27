package Obserwator.Gazeta.Odbiorcy;

import Obserwator.Gazeta.Observer;
import Obserwator.Gazeta.Podmiot;

public class Michal implements Observer {
    private String gazeta;

    public Michal (Podmiot podmiot) {
        podmiot.add(this);
    }

    @Override
    public void odbierz(String gazeta) {

        System.out.println(gazeta);

    }


}
