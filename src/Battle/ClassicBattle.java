package Battle;

import Warriors.Warrior;
import Warriors.WarriorsInterfaces.HumanWarrior;
import Warriors.WarriorsInterfaces.OrcWarrior;
import Warriors.WarriorsInterfaces.TrollWarrior;
import Warriors.WarriorsInterfaces.WizardWarrior;

import java.util.List;

public class ClassicBattle implements Battle {
    private final List<Warrior> firstSideWarriors;
    private final List<Warrior> secondSideWarriors;


    public ClassicBattle(List<Warrior> firstSideWarriors, List<Warrior> secondSideWarriors) {
        this.firstSideWarriors = firstSideWarriors;
        this.secondSideWarriors = secondSideWarriors;
    }

    @Override
    public void battle() {
        System.out.println("First side warriors: ");
        printWarriors(firstSideWarriors);
        System.out.println("Second side warriors: ");
        printWarriors(secondSideWarriors);
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
}
