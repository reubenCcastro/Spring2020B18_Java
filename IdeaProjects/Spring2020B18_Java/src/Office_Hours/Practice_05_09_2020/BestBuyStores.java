package Office_Hours.Practice_05_09_2020;

public class BestBuyStores {

    public static void main(String[] args) {
        BestBuy store1 = new BestBuy();
        store1.numberOfComputers=10;
        store1.numberOfComputers--;

        System.out.println(BestBuy.numberOfComputers);

        store1.close();

        BestBuy.closeALL();


    }


}
