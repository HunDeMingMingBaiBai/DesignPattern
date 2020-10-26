package AbstractFactoryPattern3;

/**
 * 抽象工厂   具体工厂
 * 抽象产品族
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        maleHumanFactory.createYellowHuman();
        femaleHumanFactory.createYellowHuman();

        maleHumanFactory.createWhiteHuman();
        femaleHumanFactory.createWhiteHuman();

        maleHumanFactory.createBlackHuman();
        femaleHumanFactory.createBlackHuman();
    }

}
