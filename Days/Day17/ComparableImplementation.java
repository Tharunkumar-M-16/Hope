package Day17;

import java.util.*;

public class ComparableImplementation {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(200, "John"));
        list.add(new Student(31, "Doe"));
        list.add(new Student(35, "Jane"));
        Collections.sort(list);
        for (Student stu : list) {
            System.out.print(stu.rollno + " " + stu.name);
        }
    }
}

class Student implements Comparable<Student> {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollno - s.rollno;
    }
}
