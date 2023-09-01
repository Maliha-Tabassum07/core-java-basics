package Assignment4;

public interface EmployeeOperations {
    default String getEmployeeDetails(Employee employee){
        return "Name: "+employee.getName()+"\n"+"Age: "+employee.getAge()+"\n"+"Department: "+employee.getDepartment()+"\n"+"Salary: "+employee.getSalary();

    }

}
