package l_StrategyPattern12;

/**
 * 抽象策略  具体策略
 * context封装角色
 */
public class Zhaoyun {

    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();
        context = new Context(new GivenGreenLight());
        context.operate();
        context = new Context(new BlockEnemy());
        context.operate();
    }

}
