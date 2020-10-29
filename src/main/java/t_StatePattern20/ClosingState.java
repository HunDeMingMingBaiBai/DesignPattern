package t_StatePattern20;

public class ClosingState extends LiftState{

    public ClosingState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        System.out.println("电梯门关闭。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
