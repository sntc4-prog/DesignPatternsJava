package creationalpatterns.factory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeBySpecialty("miner");
        Employee employee = employeeFactory.createEmployee();
        employee.sayHello();

    }

    static EmployeeFactory createEmployeeBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("woodman")) {
            return new WoodmanFactory();
        } else if (specialty.equalsIgnoreCase("miner")) {
            return new MinerFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty!");
        }
    }
}
