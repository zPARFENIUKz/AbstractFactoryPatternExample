import Battle.Battle;
import Battle.BattleGenerator.BattleGenerator;
import Battle.BattleGenerator.DefaultBattleGenerator;
import Factory.EvilWarrioirFactory.EvilWarriorFactory;
import Factory.GoodWarriorFactory.GoodWarriorFactory;
import Factory.WarriorFactory;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        createAndStartBattle(GoodWarriorFactory.class, EvilWarriorFactory.class, DefaultBattleGenerator.class);
    }

    private static void createAndStartBattle(Class<? extends WarriorFactory> firstWarriorFactoryClass,
                                             Class<? extends WarriorFactory> secondWarriorFactoryClass,
                                             Class<? extends BattleGenerator> battleGeneratorClass)
    {
        final WarriorFactory factory1;
        final WarriorFactory factory2;
        final BattleGenerator battleGenerator;
        try {
            factory1 = firstWarriorFactoryClass
                    .getDeclaredConstructor()
                    .newInstance();
            factory2 = secondWarriorFactoryClass
                    .getDeclaredConstructor()
                    .newInstance();
            battleGenerator = battleGeneratorClass
                    .getConstructor(WarriorFactory.class, WarriorFactory.class)
                    .newInstance(factory1, factory2);
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        Battle battle = battleGenerator.createBattle();
        battle.battle();
    }
}
