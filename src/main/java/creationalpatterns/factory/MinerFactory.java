package creationalpatterns.factory;

public class MinerFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new Miner();
    }
}
