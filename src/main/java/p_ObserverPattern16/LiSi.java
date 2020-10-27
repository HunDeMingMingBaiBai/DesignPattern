package p_ObserverPattern16;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到李斯活动，开始向老板汇报。。。");
        this.reportToQiShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕。。。");
    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
