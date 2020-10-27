package j_ChainOfResponsibilityPattern10;

import java.util.ArrayList;
import java.util.Random;

/**
 * 抽象处理：
 *  1、handleMessage 处理请求的方法
 *  2、链的编排setNext，设置下一个处理者
 *  3、能够处理的级别getHandlerLevel，具体处理任务的response
 */
public class Client {

    public static void main (String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            list.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen women : list) {
            father.HandleMessage(women);
        }
    }

}
