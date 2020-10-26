package SingletonPattern1;

public class Singleton2 {

    private static volatile Singleton2 singleton2 = null;

    private Singleton2() {}

    public static Singleton2 getSingleton() {
        if (singleton2 == null) {
             synchronized (Singleton2.class) {
                 if (singleton2 == null) {
                     singleton2 = new Singleton2();
                 }
             }
        }
        return singleton2;
    }

}
