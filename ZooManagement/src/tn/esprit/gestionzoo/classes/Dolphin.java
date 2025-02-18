package tn.esprit.gestionzoo.classes;

import java.util.function.DoubleToLongFunction;

public class Dolphin extends Aquatic{

    private float swimmingSpeed;

    public Dolphin(){
        System.out.println("Dolphin constructor");
    }
    public Dolphin(String family,String name,int age,boolean isMammal,String habitat,float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
        System.out.println("Dolphin constructor");
    }
    @Override
    public String toString() {
        return family + name + " " + age + " " + isMammal + " " + habitat + " " + swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}

