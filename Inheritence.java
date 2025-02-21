
class Parent {
    String name;
    String gender;
    int age;

    public void gainValues(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
       

    }
    public void displayData(){
        System.out.println("         Parent Data  :");
        System.out.println("                         ");

        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
    }

}

class Student extends Parent {
    
    String id;
    double gpA;
    public void gainValues(String name, String gender, int age,String id,double gpA) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.gpA=gpA;

       

    }
    public void displayData(){
        System.out.println("                         ");
        System.out.println("                         ");
        System.out.println("         Student Data  :");
        System.out.println("                         ");
        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("ID  :" + id);
         System.out.println("GPA  :" + gpA);
       




    }


}

public class Inheritence {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.gainValues("Abdul Khaliq", "Male", 50);
        p1.displayData();
        Student s1=new Student();
        s1.gainValues("Dawood","Male",20,"CS-325",3.98);
        s1.displayData();
    }

}