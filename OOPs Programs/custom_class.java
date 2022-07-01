class Employee1 {
    int id;
    String name;
    int salary;

    public void printdetails() {
        System.out.println("ID = " + id);
        System.out.println("NAME = " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("Cusotm Class");

        Employee1 e1 = new Employee1(); // Instantiatnig a new Employee Object
        e1.id = 101; // setting Attributes
        e1.name = "Dhruv"; // setting Attributes
        e1.salary = 20000;

        Employee1 e2 = new Employee1();
        e2.id = 312;
        e2.name = "John";
        e2.salary = 30000;

        e1.printdetails(); // calling method in user defined class
        e2.printdetails();

        int salary = e1.getSalary();
        System.out.println(salary);
    }
}
