package p_ObserverPattern16;

import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者 java.util.Observable
 * 观察者  java.util.Observer
 */
public class Client {

    public static void main (String[] args) {
        HanFeiZi hanfeizi = new HanFeiZi();
        LiSi lisi = new LiSi();
        hanfeizi.addObserver(lisi);
        hanfeizi.haveBreakfast();
    }

}
