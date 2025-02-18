package tn.esprit.gestionzoo.classes;

public class Penguin extends Aquatic{
    private float swimmingDepth;

     public Penguin(){
         System.out.println("Penguin constructor");
     }
     public Penguin(String family,String name,int age,boolean isMammal, String habitat, float swimmingDepth) {
         super(family,name,age,isMammal,habitat);
         this.swimmingDepth=swimmingDepth;
         System.out.println("Penguin constructor");
     }
}
