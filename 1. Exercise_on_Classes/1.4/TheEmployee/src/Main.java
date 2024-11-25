import data.Employee;

public class Main {
    public static void main(String[] args) {
        //input data
        Employee employee1 = new Employee(000001, "Luu", "Kien", 10_000);
        Employee employee2 = new Employee(000002, "Vu", "Vu", 20_000);
        Employee employee3 = new Employee(000003, "Nguyen", "Dat", 30_000);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        //test getter & setter
        System.out.println("Name of the employee 3 is " + employee3.getName());
        System.out.println("Name of the employee 1 is " + employee1.getName());
        System.out.println("The annual salary of the employee 1 is" + employee1.AnnualSalary());
        System.out.println("The ID of the employee 1 is "+ employee1.getId());
        System.out.println("the salary of the employee 1 is "+ employee1.getSalary());
        System.out.println("Now this salary of the employee 1 is "+ (employee1.raiseSalary(90)));

    }
}