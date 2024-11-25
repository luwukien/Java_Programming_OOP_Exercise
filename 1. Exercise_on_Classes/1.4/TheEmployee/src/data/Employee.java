package data;

public class Employee {
    private int id;
    private String FirstName;
    private String LastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return FirstName + " " + LastName;
    }

    public int getSalary() {
        return salary;
    }

    public int AnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int theNewSalary =  salary + (salary * percent) / 100;
        //watch-out: when a number (int) < 1 and > 0 ex: 0.4 -->> 0 (JVM)
        return theNewSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
                ']';
    }
}
