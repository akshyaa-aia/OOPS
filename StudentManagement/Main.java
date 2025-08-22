import java.util.*;

class Student {
    String name;
    int age;
    static String college = "ABC College";

    Student() { this("Unknown", 0); } // Default constructor calls parameterized

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }

    static void changeCollege(String newCollege) { college = newCollege; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            students.add(new Student(name, age));
        }

        System.out.println("\nStudent Details:");
        students.forEach(Student::display);

        System.out.print("\nEnter new college name for all students: ");
        Student.changeCollege(sc.nextLine());

        System.out.println("\nUpdated Student Details:");
        students.forEach(Student::display);
        sc.close();
    }
}
