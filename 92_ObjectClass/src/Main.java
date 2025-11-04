public class Main extends Object {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 20);
        System.out.println(alice.toString());

        PrimarySchoolStudent bob = new PrimarySchoolStudent("Bob", 10, 5);
        System.out.println(bob.toString());

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student {
    private int grade;

    public PrimarySchoolStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", grade=" + grade +
                '}';
    }
}
