package f_ProxyPattern6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    Object o = null;

    public MyInvocationHandler(Object o) {
        this.o = o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("InvocationProxy before");
        Object result = method.invoke(this.o, args);
        System.out.println("InvocationProxy after");
        return result;
    }
}
