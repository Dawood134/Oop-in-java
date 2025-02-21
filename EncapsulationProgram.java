 class Animal {
  private String name;
  private int age;
  private String colour;

  public void gainAttributes(String name, int age, String colour) {
    this.name = name;
    this.age = age;
    this.colour = colour;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    return age;
  }

  public void setColour(String c) {
    colour = c;
  }

  public String getColour() {
    return colour;
  }

}

class Dog extends Animal {

  public void display() {
    System.out.println("dog name: " + getName());
    System.out.println("dog age:: " + getAge());
    System.out.println("dog colour: " + getColour());

  }
}

public class EncapsulationProgram {
  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.gainAttributes("smooky", 03, "Black");
    dog.display();

  }

}

/*
 * Write a Java program having class name Animal
 * (i) Animal has three private member name, age, and color.
 * 
 * (ii) Create a class Dog and access the private member of Animal class.
 * 
 * (iii) Show animal name and age in Dog class (Hint Getter Setter)
 * 
 */