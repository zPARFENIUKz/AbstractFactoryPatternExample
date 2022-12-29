package Warriors.GoodWarriors;

import Warriors.WarriorsInterfaces.HumanWarrior;

public class GoodHumanWarrior implements HumanWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'm a good Human");
    }

    @Override
    public void doSomeHumanStuff() {
        System.out.println("Doing some good Human stuff");
    }
}
