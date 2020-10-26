package FactoryPattern2;

import FactoryPattern2.simple.SimpleHumanFactory;

/**
 * 抽象工厂  具体工厂
 * 抽象产品  具体产品
 */
public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        Human blackHuman = factory.createHuman(BlackHuman.class);
        Human yellowHuman = factory.createHuman(YellowHuman.class);

        whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
        yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
    }

}
