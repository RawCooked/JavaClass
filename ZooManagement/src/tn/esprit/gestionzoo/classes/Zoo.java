package tn.esprit.gestionzoo.classes;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private int compteurAnimal ;

    public Zoo() {
        compteurAnimal=0;
        this.animals = new Animal[nbrCages];
        System.out.println("Zoo constructor");
    }

    void setName(String name) {
        if (!name.isBlank()){
            this.name = name;
        }
        else {
            System.out.println("Le nom n'existe pas");
        }
    }


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Nom du tn.esprit.gestionzoo.classes.Zoo : " + name + " City : " + city + " Number de Cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Nom du tn.esprit.gestionzoo.classes.Zoo : " + name + " City : " + city + " Number de Cages : " + nbrCages;
    }

    public boolean addAnimal(Animal a) {
        if (searchAnimal(a) != -1) {
            System.out.println("tn.esprit.gestionzoo.classes.Animal est exsitant");
            return false;
        }
        if (!isZooFull()) {
            animals[compteurAnimal] = a;
            compteurAnimal++;
            return true;
        } else {
            System.out.println("tn.esprit.gestionzoo.classes.Zoo est plein");
            return false;
        }
    }


    public void displayAnimals() {
            System.out.println("Liste des animaux dans le zoo:");
            for (int i = 0; i < compteurAnimal; i++) {
                animals[i].displayAnimal();
            }
        }


    public int searchAnimal(Animal a) {
        String nom = a.getName();
        for (int i = 0; i < compteurAnimal; i++) {
            if (animals[i].getName().equals(nom)) {
                return i; // Retourne l'index de l'animal
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal a) {
        int i = searchAnimal(a);
        if (i != -1) {

            for (int j = i; j < compteurAnimal - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[compteurAnimal - 1] = null;
            compteurAnimal--;
            return true;
        }
        return false;

    }
    public boolean  isZooFull()
    {
        return animals.length==nbrCages;
    }
    static  Zoo comparerZoo(Zoo z1, Zoo z2)
    {
        if(z1.compteurAnimal>=z2.compteurAnimal) {
            return z1;
        }
        return z2;
    }
}
