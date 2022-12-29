package Factory.GoodWarriorFactory;

import Factory.WarriorFactory;
import Warriors.GoodWarriors.GoodHumanWarrior;
import Warriors.GoodWarriors.GoodOrcWarrior;
import Warriors.GoodWarriors.GoodTrollWarrior;
import Warriors.GoodWarriors.GoodWizardWarrior;
import Warriors.Types.WarriorType;
import Warriors.Warrior;

public class GoodWarriorFactory implements WarriorFactory {
    @Override
    public Warrior createWarrior(WarriorType type) {
        return switch (type) {
            case HUMAN -> new GoodHumanWarrior();
            case ORC -> new GoodOrcWarrior();
            case TROLL -> new GoodTrollWarrior();
            case WIZARD -> new GoodWizardWarrior();
        };
    }
}
