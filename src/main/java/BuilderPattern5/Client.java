package BuilderPattern5;

/**
 * 导演类
 * 抽象建造者     具体建造者
 * 抽象产品       具体产品
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        CarModel c = director.getABenzModel();
        CarModel c1 = director.getBBenzModel();
    }

}
