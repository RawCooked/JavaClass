package tn.esprit.gestionzoo.classes;

import java.util.Objects;

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

    public void swim(){
        System.out.println("Aquatic swim");
    };
    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal + " " + habitat;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Aquatic aquatic){
            return Objects.equals(this.name, aquatic.name) &&
                    this.age == aquatic.age &&
                    Objects.equals(this.habitat, aquatic.habitat);
        }
        return false;
    }
}
