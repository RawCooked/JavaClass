package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.classes.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("John", "Smith", 40, true);

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
//        System.out.println("-------------Aquatic animal-----------------");
//        System.out.println(aquatic);
//        System.out.println("-------------Penguin-----------------");
//        System.out.println(penguin);
//        System.out.println("-------------Dolphin-------------");
//        System.out.println(dolphin);
//        System.out.println("---------------Terrestrial-----------------");
//        System.out.println(terrestrial);
//        System.out.println("-------------aquatic Swimming-------------------");
//        aquatic.swim();
//        System.out.println("----------------dolphin Swimming-----------------");
//        dolphin.swim();
//        System.out.println("-----------------penguin Swimming--------------");
//        System.out.println("------------------end-------------------");

        //on remarque que le penguin possede la methode de sa classe mére


        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        zoo.displayAquaticAnimals();
        zoo.displayNumberOfAquaticsByType();
        System.out.println(Zoo.nbAquaticAnimals);


    }
}