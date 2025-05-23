package PracticeTest.May;

public class Lab23May25_InheritanceExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails();
    }
}
// Parent class
class parent{
    String name= "Ravi";
    int age= 30;
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Employee extends parent{
    String empID="E121";
    void displayDetails(){
        displayInfo();
        System.out.println("Employee Id :"+empID);
    }
}
