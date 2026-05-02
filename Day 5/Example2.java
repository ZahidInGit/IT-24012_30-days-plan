class Student {

    String name;
    int age;

    public Student() {
        this.name = "New Student";
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Example2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Zayn", 21);

        s1.info();
        s2.info();
    }
}
