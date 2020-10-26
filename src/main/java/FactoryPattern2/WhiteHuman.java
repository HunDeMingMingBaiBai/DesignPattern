package FactoryPattern2;

public class WhiteHuman implements Human{
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
