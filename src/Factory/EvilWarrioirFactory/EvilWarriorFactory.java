package Factory.EvilWarrioirFactory;

import Factory.WarriorFactory;
import Warriors.EvilWarriors.EvilHumanWarrior;
import Warriors.EvilWarriors.EvilOrcWarrior;
import Warriors.EvilWarriors.EvilTrollWarrior;
import Warriors.EvilWarriors.EvilWizardWarrior;
import Warriors.Types.WarriorType;
import Warriors.Warrior;

public class EvilWarriorFactory implements WarriorFactory {
    @Override
    public Warrior createWarrior(WarriorType type) {
        return switch (type) {
            case HUMAN -> new EvilHumanWarrior();
            case ORC -> new EvilOrcWarrior();
            case TROLL -> new EvilTrollWarrior();
            case WIZARD -> new EvilWizardWarrior();
        };
    }
}
