package r_MementoPattern18;

import java.util.HashMap;

/**
 * 备忘录管理员
 */
public class Caretaker {

    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
