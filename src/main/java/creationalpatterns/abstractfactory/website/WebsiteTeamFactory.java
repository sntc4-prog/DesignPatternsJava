package creationalpatterns.abstractfactory.website;

import creationalpatterns.abstractfactory.Developer;
import creationalpatterns.abstractfactory.ProjectManager;
import creationalpatterns.abstractfactory.ProjectTeamFactory;
import creationalpatterns.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
