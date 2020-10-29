package r_MementoPattern18;

/**
 * 发起人
 * 备忘录
 * 备忘录管理员
 */
public class Client {

    public static void main (String[] args) {
        /*
        // 定义发起人
        Originator originator = new Originator();
        // 定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
        */

        /*
        Originator originator = new Originator();
        originator.setState("初始状态");
        originator.createMemento();
        originator.setState("修改后的状态");
        originator.restoreMemento();
         */

        // 定义发起人
        Originator originator = new Originator();
        // 定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建一个备忘录
        caretaker.setMemento("001", originator.createMemento());
        caretaker.setMemento("002", originator.createMemento());
        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento("001"));

    }

}
