package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.classes.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("John", "Smith", 40, true);
        Aquatic aquatic = new Aquatic(
                "Emily",
                "Davis",
                35,
                true,
                "Esprit"
        );
        Dolphin dolphin = new Dolphin(
                "Michael",
                "Brown",
                38,
                false,
                "Esprit",
                3.3f
        );
        Penguin penguin = new Penguin(
                "Sarah",
                "Johnson",
                42,
                false,
                "Esprit",
                3.5f
        );
        Terrestrial terrestrial = new Terrestrial(
                "David",
                "Wilson",
                45,
                false,
                233
        );
        Zoo zoo = new Zoo();
        System.out.println("----------------------------------------");
        System.out.println(aquatic);
        System.out.println("----------------------------------------");
        System.out.println(dolphin);
        System.out.println("----------------------------------------");
        System.out.println(terrestrial);
        System.out.println("----------------------------------------");

    }
}