// Colstructors

public class fiftytwo52 {
    public static void main(String[] args) {

        Student s1 = new Student("Prashant", 30);
        Student s2 = new Student();
        Student s3 = new Student(s1);
        System.out.println(s1.name + " , "+ s1.roll);
        System.out.println(s3.name);
    }
}

class Student {
    String name;
    int roll;

    // Default , Non-Parameterised Constructor
    Student() {
        System.out.println("Constructor called...");
    }
    // Parameterised Constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    // Copy Constructor
    Student(Student s){
        this.name =s.name;
        this.roll = s.roll;
    }

}