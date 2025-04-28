class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ObjectClassExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        System.out.println(s1);
    }
}
