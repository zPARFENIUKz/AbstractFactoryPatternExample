package Warriors.EvilWarriors;

import Warriors.WarriorsInterfaces.WizardWarrior;

public class EvilWizardWarrior implements WizardWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm an evil Wizard");
    }

    @Override
    public void doSomeWizardStuff() {
        System.out.println("Doing some evil Wizard stuff");
    }
}
