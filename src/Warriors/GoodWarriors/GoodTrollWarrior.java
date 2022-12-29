package Warriors.GoodWarriors;

import Warriors.WarriorsInterfaces.TrollWarrior;

public class GoodTrollWarrior implements TrollWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm a good Troll");
    }
    @Override
    public void doSomeTrollStuff() {
        System.out.println("Doing some good Troll stuff");
    }
}
