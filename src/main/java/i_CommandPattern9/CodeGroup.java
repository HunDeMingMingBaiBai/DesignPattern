package i_CommandPattern9;

public class CodeGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到代码组。。。");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项代码。。。");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项代码。。。");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项代码。。。");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划。。。");
    }
}
