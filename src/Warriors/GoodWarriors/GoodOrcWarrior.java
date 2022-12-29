package Warriors.GoodWarriors;

import Warriors.WarriorsInterfaces.OrcWarrior;

public class GoodOrcWarrior implements OrcWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm a good Orc");
    }

    @Override
    public void doSomeOrcType() {
        System.out.println("Doing some good Orc stuff");
    }
}
