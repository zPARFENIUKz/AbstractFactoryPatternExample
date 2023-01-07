import Factory.EvilWarrioirFactory.EvilWarriorFactory;
import Factory.GoodWarriorFactory.GoodWarriorFactory;
import Factory.WarriorFactory;
import Warriors.Types.WarriorType;
import Warriors.Warrior;
import Warriors.WarriorsInterfaces.HumanWarrior;
import Warriors.WarriorsInterfaces.OrcWarrior;
import Warriors.WarriorsInterfaces.TrollWarrior;
import Warriors.WarriorsInterfaces.WizardWarrior;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating GoodWarriorFactory
        final WarriorFactory goodFactory = new GoodWarriorFactory();
        // Creating Good Warriors
        final List<Warrior> goodWarriors = createWarriors(goodFactory);

        // Creating EvilWarriorFactory
        final WarriorFactory evilFactory = new EvilWarriorFactory();
        // Creating Evil Warriors
        final List<Warrior> evilWarriors = createWarriors(evilFactory);

        // Print Good Warriors
        System.out.println("Good Warriors: ");
        printWarriors(goodWarriors);
        System.out.println("###########################");

        // Print Evil Warriors
        System.out.println("Evil Warriors: ");
        printWarriors(evilWarriors);
        System.out.println("###########################");
    }

    private static void printWarriors(List<Warrior> warriors) {
        for (final Warrior warrior : warriors) {
            warrior.identifyOneself();
            if (warrior instanceof HumanWarrior humanWarrior) {
                humanWarrior.doSomeHumanStuff();
            } else if (warrior instanceof OrcWarrior orcWarrior) {
                orcWarrior.doSomeOrcType();
            } else if (warrior instanceof TrollWarrior trollWarrior) {
                trollWarrior.doSomeTrollStuff();
            } else if (warrior instanceof WizardWarrior wizardWarrior) {
                wizardWarrior.doSomeWizardStuff();
            }
        }
    }

    private static List<Warrior> createWarriors(WarriorFactory factory) {
        return new ArrayList<>() {{
            add(factory.createWarrior(WarriorType.HUMAN));
            add(factory.createWarrior(WarriorType.ORC));
            add(factory.createWarrior(WarriorType.TROLL));
            add(factory.createWarrior(WarriorType.WIZARD));
        }};
    }


}
