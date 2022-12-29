package Warriors.EvilWarriors;

import Warriors.WarriorsInterfaces.TrollWarrior;

public class EvilTrollWarrior implements TrollWarrior {
    @Override
    public void identifyOneself() {
        System.out.println("I'n an evil Troll");
    }

    @Override
    public void doSomeTrollStuff() {
        System.out.println("Doing some evil Troll stuff");
    }
}
