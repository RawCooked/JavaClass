package tn.esprit.gestionzoo.classes;

public class Terrestrial extends Animal{

    protected int nbrLegs;

    public Terrestrial(){
        System.out.println("Terrestrial constructor");
    }

    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family, name,age,isMammal);
        this.nbrLegs=nbrLegs;
        System.out.println("Terrestrial constructor");

    }
    @Override
    public String toString() {
        return "Family : " + family + "Name : " +name +"Age : " + age +
                " Is Mammal " + isMammal + "Nbr Legs : " + nbrLegs;
    }
}
