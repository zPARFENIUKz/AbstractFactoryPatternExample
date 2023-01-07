package Warriors.GoodWarriors;

import Warriors.WarriorsInterfaces.WizardWarrior;

public class GoodWizardWarrior implements WizardWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm a good Wizard");
    }

    @Override
    public void doSomeWizardStuff() {
        System.out.println("Doing some good Wizard stuff");
    }
}
