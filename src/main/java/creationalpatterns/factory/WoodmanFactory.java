package creationalpatterns.factory;

public class WoodmanFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new Woodman();
    }
}
