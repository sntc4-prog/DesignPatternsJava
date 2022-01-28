package creationalpatterns.abstractfactory.banking;

import creationalpatterns.abstractfactory.Developer;
import creationalpatterns.abstractfactory.ProjectManager;
import creationalpatterns.abstractfactory.ProjectTeamFactory;
import creationalpatterns.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
