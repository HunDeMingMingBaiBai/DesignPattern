package s_VisitorPattern19;

import java.util.Random;

/**
 * 抽象元素   具体元素
 * 抽象访问者    具体访问者
 */
public class Client {

    public static void main (String[] args) {
        for(int i = 0; i < 10; i++) {
            Element e = createElement();
            e.accept(new Visitor());
        }
    }

    public static Element createElement() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }

}
