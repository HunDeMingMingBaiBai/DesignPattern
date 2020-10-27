package o_CompositePattern15;

import java.util.ArrayList;

// 树枝构件
public class Composite extends Component{

    private ArrayList<Component> list = new ArrayList<>();

    public void add (Component component) {
        this.list.add(component);
    }

    public void remove (Component component) {
        this.list.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.list;
    }

    @Override
    public void doSomething() {
        System.out.println("树枝节点");
    }
}
