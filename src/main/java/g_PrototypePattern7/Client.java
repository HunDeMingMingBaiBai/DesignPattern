package g_PrototypePattern7;

import java.util.Random;

/**
 * 原型模式 java.lang.Cloneable
 * 比new一个对象性能好
 * 注意：
 *  被拷贝对象的构造方法不会调用
 *  浅拷贝与深拷贝的区别
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main (String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(cloneMail);
            ++i;
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString (int length) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < length; ++i) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

}
