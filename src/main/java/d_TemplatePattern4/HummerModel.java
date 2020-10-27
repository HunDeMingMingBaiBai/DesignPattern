package d_TemplatePattern4;

public abstract class HummerModel {
    // 基本方法
    protected abstract void start();
    // 基本方法
    protected abstract void stop();
    // 基本方法
    protected abstract void alarm();
    // 基本方法
    protected abstract void engineBoom();
    // 模版方法
    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }

}
