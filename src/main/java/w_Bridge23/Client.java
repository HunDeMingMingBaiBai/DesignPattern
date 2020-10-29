package w_Bridge23;

public class Client {

    public static void main (String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        IPod iPod = new IPod();
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);
        shanZhaiCorp.makeMoney();
        Clothes clothes = new Clothes();
        shanZhaiCorp = new ShanZhaiCorp(clothes);
        shanZhaiCorp.makeMoney();
    }

}
