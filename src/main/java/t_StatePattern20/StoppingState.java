package t_StatePattern20;

public class StoppingState extends LiftState{

    public StoppingState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        // 停止状态关门？电梯门本来就是关着的
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("");
    }
}
