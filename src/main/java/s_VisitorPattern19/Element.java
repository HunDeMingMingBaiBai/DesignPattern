package s_VisitorPattern19;

public abstract class Element {
    //
    public abstract void doSomething();
    // 允许谁来访问
    public abstract void accept(IVisitor visitor);

}
