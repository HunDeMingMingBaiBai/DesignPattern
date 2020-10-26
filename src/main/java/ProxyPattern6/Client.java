package ProxyPattern6;

/**
 * 接口   接口实现    静态代理
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxySubject = new Proxy(subject);
        proxySubject.request();
    }

}
