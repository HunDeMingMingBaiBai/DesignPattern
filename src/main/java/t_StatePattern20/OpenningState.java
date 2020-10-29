package t_StatePattern20;

public class OpenningState extends LiftState{

    public OpenningState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        System.out.println("电梯门开启。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        // 开门不能运行
    }

    @Override
    public void stop() {
        // 开门还不停止？
    }
}
