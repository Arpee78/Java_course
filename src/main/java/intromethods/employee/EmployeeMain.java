package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("John", 2020, 10_000);
        System.out.println(employee);
        employee.raiseSalary(1000);
        employee.setName("John Doe");
        System.out.println(employee);

    }
}
