package w_Bridge23;

public class ShanZhaiCorp extends Corp{

    // 产什么产品，不知道，等被调用的时候才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚大钱了。。。");
    }
}
