package Days.Day7;
class Students{
    String name;
    String rollno;
    String course;
    int age;
    Students(String name,String rollno,String course,int age){
        this.name=name;
        this.rollno=rollno;
        this.course=course;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Course: "+course);
        System.out.println("Age: "+age);
    }
}

public class ThisKeyword {
    public static void main(String[] args){
        Students s1=new Students("John","123","Computer Science",20);
        s1.display();
    }
}
