package Warriors.EvilWarriors;

import Warriors.WarriorsInterfaces.OrcWarrior;

public class EvilOrcWarrior implements OrcWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm an evil Orc");
    }

    @Override
    public void doSomeOrcType() {
        System.out.println("Doing some evil Orc stuff");
    }
}
