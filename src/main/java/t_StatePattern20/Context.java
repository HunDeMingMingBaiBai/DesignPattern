package t_StatePattern20;

public class Context {

    public final static Context context = new Context();

    public final static OpenningState openningState = new OpenningState(context);
    public final static ClosingState closingState = new ClosingState(context);
    public final static RunningState runningState = new RunningState(context);
    public final static StoppingState stoppingState = new StoppingState(context);

    private LiftState liftState;

    public void open() {
        this.liftState.open();
    }

    public void run() {
        this.liftState.run();
    }

    public void close() {
        this.liftState.close();
    }

    public void stop() {
        this.liftState.stop();
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }
}
