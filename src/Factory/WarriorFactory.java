package Factory;

import Warriors.Types.WarriorType;
import Warriors.Warrior;

public interface WarriorFactory {
    Warrior createWarrior(WarriorType type);
}
