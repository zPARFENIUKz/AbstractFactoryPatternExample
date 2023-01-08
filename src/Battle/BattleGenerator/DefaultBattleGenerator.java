package Battle.BattleGenerator;

import Battle.Battle;
import Battle.ClassicBattle;
import Factory.WarriorFactory;
import Warriors.Types.WarriorType;
import Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class DefaultBattleGenerator implements BattleGenerator {
    private final WarriorFactory firstSideFactory;
    private final WarriorFactory secondSideFactory;

    public DefaultBattleGenerator(WarriorFactory firstSideFactory, WarriorFactory secondSideFactory) {
        if (firstSideFactory == null || secondSideFactory == null)
            throw new NullPointerException("factory can't be null");
        this.firstSideFactory = firstSideFactory;
        this.secondSideFactory = secondSideFactory;
    }



    private List<Warrior> getWarriors(WarriorFactory factory) {
        List<Warrior> warriors = new ArrayList<>();
        for (final WarriorType type : WarriorType.values()) {
            Warrior warrior = factory.createWarrior(type);
            warriors.add(warrior);
        }
        return warriors;
    }

    @Override
    public Battle createBattle() {
        return new ClassicBattle(getWarriors(firstSideFactory), getWarriors(secondSideFactory));
    }
}
