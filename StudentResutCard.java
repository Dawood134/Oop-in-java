class StudentCard {
    String name;
    int age = 0;
    char gender;
    String department;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
    }

    public float calcPer(int obtainMarks, int totalMarks) {
        float percentage = ((float) obtainMarks * 100) / totalMarks;
        return percentage;
    }

    public void displayCourseDetail(String[] courses, int[] num) {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + " = " + num[i]);
        }
    }
}

public class StudentResutCard {
    public static void main(String[] args) {
        String[] courses = { "phy", "chem", "math", "bio", "urdu" };
        int[] num = { 78, 89, 98, 67, 33 };

        StudentCard s1 = new StudentCard();
        s1.name = "Dawood";
        s1.age = 20;
        s1.gender = 'M';
        s1.department = "Computer Science";

        s1.display();
        float percentage = s1.calcPer(842, 1100);
        System.out.println("Percentage: " + percentage);
        s1.displayCourseDetail(courses, num);
    }
}
