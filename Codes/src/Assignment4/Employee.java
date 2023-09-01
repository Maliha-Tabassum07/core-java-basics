package Assignment4;

public class Employee {
    private String name;
    private int age;
    private String department;
    private int salary;
    public Employee(){

    }
    public Employee( String n, int a, String d, int s){
        name = n;
        age = a;
        department = d;
        salary= s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
