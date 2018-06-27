package Obserwator.Gazeta;

import Obserwator.Gazeta.Odbiorcy.Michal;

public class Demo {
    public static void main(String[] args) {
        Gazeta gazeta = new Gazeta();
        Michal michal = new Michal(gazeta);

        gazeta.nowaGazeta("Gazeta kurwa chuj");
    }
}
