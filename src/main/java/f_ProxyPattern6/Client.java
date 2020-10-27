package f_ProxyPattern6;

import java.lang.reflect.InvocationHandler;

/**
 * 接口   接口实现    静态代理
 * JDK动态代理，java.lang.reflect.Proxy  java.lang.reflect.InvocationHandler
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxySubject = new Proxy(subject);
        proxySubject.request();

        // 动态代理
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                new Class[]{subject.getClass()},
                handler
        );
        proxy.request();
    }

}
