package m_AdapterPattern13;

/**
 * 适配器
 *  类适配器
 *  对象适配器（使用更多）
 */
public class Client {

    public static void main (String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }

}
