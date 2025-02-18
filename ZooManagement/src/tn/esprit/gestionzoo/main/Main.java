package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.classes.*;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("ammar","aziz",21,true);
        Aquatic aquatic = new Aquatic(
                "ammar",
                "aziz",
                21,
                true,
                "Esprit"

        );
        Dolphin dolphin = new Dolphin(
                "abd",
                "Maher",
                23,
                false,
                "ESPRIT",
                3.3f
        );
        Penguin penguin = new Penguin(
                "nsitla9abbou",
                "taher",
                21,
                false,
                "espritEtudiant",
                3.5f

        );
        Terrestrial terrestrial = new Terrestrial(
                "ABC",
                "heni",
                23,
                false,
                233
        );
        Zoo zoo = new Zoo();



    }
}
