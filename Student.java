import java.util.Scanner;

public class Student {
  String name;
  String nameFather;
  int id;
  int age;

  public void inputNumbers(String subject[], int marks[]) {
    int i;
    int obtainedMarks = 0;
    float calcPercent = 0.0F;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Marks : ");
    System.out.println("  Subjects          " + " Obtained  " +   "   Total Marks");
    System.out.println("                  " + "    Marks      " + "      100     ");

    for (i = 0; i < subject.length; i++) {
      System.out.print(subject[i] + ":");

      marks[i] = scanner.nextInt();
      if(marks[i]<33){
        System.out.println("Grade : F");
      }
      else if(marks[i]>=33&&marks[i]<=60){
        System.out.println("Grade : E");

      }
      else if(marks[i]>60&&marks[i]<75){
        System.out.println("Grade : C");
      }
      else if(marks[i]>=75&&marks[i]<80){
        System.out.println("Grade : B");
      }
      else if(marks[i]>=80&&marks[i]<=90){
        System.out.println("Grade : A");
      }
      else{
        System.out.println("Grade : A+");
      }
    }
    for (int j = 0; j < marks.length; j++) {
      obtainedMarks += marks[j];
    }
    System.out.println("Obtained  Marks :          " + obtainedMarks);
    calcPercent = (obtainedMarks * 100) / 500;
    System.out.println("Percentage of obtained Marks is:" + calcPercent);
  }

}

class data {

  public static void main(String[] args) {
    String subject[] = { "Calculus", "Expository Writing", "Accounting Fundamental", "OOP", "Discrete Structure" };
    int marks[] = new int[5];
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Student Detail: ");
    System.out.print("Name:");

    student.name = scanner.nextLine();
    System.out.print("Father name:");

    student.nameFather = scanner.nextLine();
    System.out.print("Student id:");
    student.id = scanner.nextInt();
    System.out.print("Student age:");

    student.age = scanner.nextInt();

    student.inputNumbers(subject, marks);

  }
}