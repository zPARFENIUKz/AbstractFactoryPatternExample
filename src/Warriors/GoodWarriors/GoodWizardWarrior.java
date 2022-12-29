package Warriors.GoodWarriors;

import Warriors.WarriorsInterfaces.TrollWarrior;

public class GoodWizardWarrior implements TrollWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm a good Wizard");
    }

    @Override
    public void doSomeTrollStuff() {
        System.out.println("Doing some good Wizard stuff");
    }
}
