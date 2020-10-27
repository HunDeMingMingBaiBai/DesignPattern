package d_TemplatePattern4;

/**
 * 父类模版方法
 */
public class Client {

    public static void main (String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();
        HummerModel h2 = new HummerH1Model();
        h2.run();
    }

}
