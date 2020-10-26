package ProxyPattern6;

public class Proxy implements Subject{

    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        System.out.println("Proxy before()");
    }

    private void after() {
        System.out.println("Proxy after()");
    }
}
