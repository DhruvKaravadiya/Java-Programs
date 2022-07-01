//Example of Static Method
class Student{
    int rollNo;
    String name;
    static String college = "Darshan";  //Using Static decreses Memory wasting. i.e. Efficient Memory Managment
    static void change(){
        college = "PDPU";
    }
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
}
public class static_method {
    public static void main(String[] args) {
     
    Student s1 = new Student(101,"Dhruv");
    Student s2 = new Student(102,"Om");
    s1.change();
    s1.display();
    s2.display();   
    }
}
