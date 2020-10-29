package s_VisitorPattern19;

public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 el1) {
        // 访问 el1 元素
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        // 访问 el2 元素
    }
}
