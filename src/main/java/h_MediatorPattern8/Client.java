package h_MediatorPattern8;

/**
 * 抽象中介者  具体中介
 * 抽象同事    具体同事
 *
 * 同事类使用构造函数注入中介者（中介者可以只有部分同事）
 * 中介者使用getter setter注入同事类（同事类中必须有中介者）
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
