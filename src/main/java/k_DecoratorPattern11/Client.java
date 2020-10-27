package k_DecoratorPattern11;

/**
 * 抽象组件  具体组件   抽象装饰    具体装饰
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        component.operate();
    }

}
