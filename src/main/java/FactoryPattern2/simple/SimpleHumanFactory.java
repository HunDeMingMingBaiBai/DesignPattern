package FactoryPattern2.simple;

import FactoryPattern2.Human;

/**
 * 简单工厂 / 静态工厂
 */
public class SimpleHumanFactory {

    public static <T extends Human> T createHuman (Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }

}
