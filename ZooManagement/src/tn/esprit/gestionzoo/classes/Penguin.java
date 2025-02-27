package tn.esprit.gestionzoo.classes;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

     public Penguin(){
         System.out.println("Penguin constructor");
     }

    @Override
    public void swim() {
        System.out.println("This Pinguin can't Swim");
    }

    public Penguin(String family,String name,int age,boolean isMammal, String habitat, float swimmingDepth) {
         super(family,name,age,isMammal,habitat);
         this.swimmingDepth=swimmingDepth;
         System.out.println("Penguin constructor");
     }

    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal + " " + habitat + " " + swimmingDepth;
    }
}
