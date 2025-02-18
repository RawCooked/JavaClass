package tn.esprit.gestionzoo.classes;

public class Aquatic extends Animal{

    protected String habitat;


    public  Aquatic(){
        System.out.println("Aquatic constructor");
    }

    public Aquatic(String family,String name,int age,boolean isMammal, String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
        System.out.println("Aquatic constructor");
    }
    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal + " " + habitat;
    }
}
