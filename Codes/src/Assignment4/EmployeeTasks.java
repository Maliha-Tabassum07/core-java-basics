package Assignment4;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTasks implements EmployeeOperations{
    static ArrayList<Employee> empData=new ArrayList<>();
    public static void populate(){
        Employee emp1=new Employee("Kamal", 28, "IT", 25000);
        Employee emp2=new Employee("Rasel", 29, "HR", 30000);
        Employee emp3=new Employee("Sabika", 24, "IT", 24000);
        Employee emp4=new Employee("Halima", 26, "SE", 30000);
        Employee emp5=new Employee("Rita", 26, "IT", 25000);
        empData.add(emp1);
        empData.add(emp2);
        empData.add(emp3);
        empData.add(emp4);
        empData.add(emp5);

    }
    public static void main(String[] args) {

        EmployeeTasks em=new EmployeeTasks();
        populate();

        List<Employee> filteredByAge=filterAgeIT(empData);
        System.out.println("\nFiltered Employee by Age and IT department are:   ");
        printInfo(filteredByAge);

        List<Integer> salary=salaryList(empData);
        System.out.println("\nAverage salary of the employees are:  ");
        System.out.println(findAverage(salary).orElse(0.0));

        Employee maxSalary=findMax(empData);
        String s=em.getEmployeeDetails(maxSalary);
        System.out.println("\nDetails of highest paying Employee");
        System.out.println(s);

        List<Employee> emp=sortEmployee(empData);
        System.out.println("\nSorted List of employees are: ");
        printInfo(emp);

    }
    public static List salaryList(ArrayList<Employee> emp){
        List<Integer> salary=emp.
                stream().
                map(n->n.getSalary()).
                collect(Collectors.toList());
        return salary;

    }

    public static List filterAgeIT(ArrayList<Employee> emp){
        int i=0;
        List<Employee> filteredEmp=emp
                .stream()
                .filter(n->n.getAge()>25 && n.getDepartment().equals("IT"))
                .collect(Collectors.toList());
        return filteredEmp;
    }
    public static Optional<Double> findAverage(List<Integer> salary){
        Double avg = salary
                .stream()
                .collect(Collectors.averagingInt(x -> x*2));
        return Optional.ofNullable(avg);
    }

    public static void printInfo(List<Employee> emp){
        emp.stream().forEach(n-> System.out.println(n.getName()));
    }
    public static List sortEmployee(List<Employee> emp){
        List<Employee> sortedEmployee=emp.
                stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary))
                .collect(Collectors.toList());
        return sortedEmployee;

    }
    public static Employee findMax(List<Employee> emp){
        Employee e = emp
                .stream()
                .max(Comparator.comparing(Employee::getSalary)).get();
        return e;

    }
}
