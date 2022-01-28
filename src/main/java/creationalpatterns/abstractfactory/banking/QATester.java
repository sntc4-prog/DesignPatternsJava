package creationalpatterns.abstractfactory.banking;

import creationalpatterns.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code");
    }
}
