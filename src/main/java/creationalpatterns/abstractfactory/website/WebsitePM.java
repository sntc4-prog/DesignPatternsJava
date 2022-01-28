package creationalpatterns.abstractfactory.website;

import creationalpatterns.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project");
    }
}
