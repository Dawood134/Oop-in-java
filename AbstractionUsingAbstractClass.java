abstract class Car {
 abstract void wheel();

 abstract void colour();
 
 public void drive(){
    System.out.println("fast");
 }

    
}
abstract class Mehran extends Car{
         public void wheel(){
            System.out.println("Alloy wheel");
         }
         abstract void speed();
         public void colour(){
            System.out.println("gray");
         }
         public void drive(){
            System.out.println("slowly drive");
         }  
    
}  
 class Civic extends Mehran {
 public void speed(){
    System.err.println("123km/h");
 }
    
}
  public class AbstractionUsingAbstractClass {
  
    public static void main(String[] args) {
        Civic a=new Civic() ;
        a.colour();
        a.wheel();
        a.drive();
        a.speed();

    }
  }
