package Warriors.EvilWarriors;

import Warriors.WarriorsInterfaces.HumanWarrior;

public class EvilHumanWarrior implements HumanWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("A'm an evil Human");
    }

    @Override
    public void doSomeHumanStuff() {
        System.out.println("Doing some evil Human stuff");
    }
}
