package i_CommandPattern9;

/**
 * 命令接收者
 * 命令command
 * 调用者Invoker
 */
public class Client {

    public static void main(String[] args) {
        Invoker xiaoShan = new Invoker();
        Command command = new AddRequirementCommand();
        xiaoShan.setCommand(command);
        xiaoShan.action();
        command = new DeletePageCommand();
        xiaoShan.setCommand(command);
        xiaoShan.action();
    }

}
