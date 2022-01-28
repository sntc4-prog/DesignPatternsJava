package creationalpatterns.abstractfactory.banking;

import creationalpatterns.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM managers banking project");
    }
}
