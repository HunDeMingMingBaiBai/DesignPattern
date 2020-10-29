package r_MementoPattern18;

import java.util.HashMap;

/**
 * 备忘录角色
 */
public class Memento {

    private HashMap<String, Object> stateMap;

    public Memento(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
