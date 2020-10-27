package m_AdapterPattern13;

public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.doSomething();
    }
}
