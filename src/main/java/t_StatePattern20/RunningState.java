package t_StatePattern20;

public class RunningState extends LiftState{

    public RunningState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        // 运行的时候开电梯门？你疯了！电梯不会给你开
    }

    @Override
    public void close() {
        // 电梯门关闭？这是肯定的
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
