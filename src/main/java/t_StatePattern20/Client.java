package t_StatePattern20;

public class Client {

    public static void main (String[] args) {

        Context.context.setLiftState(Context.openningState);
        Context.context.open();
        Context.context.close();
        Context.context.run();
        Context.context.stop();
    }

}
