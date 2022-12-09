package task3;

public class Price implements Comparable <Price >{
    String productName;
    String shopName;
    int cost;

    public Price(String productName, String shopName, int cost) {
        this.productName = productName;
        this.shopName = shopName;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return  "name='" + productName  + '\'' + shopName  +
                ", age=" + cost  + "";
    }

    @Override
    public int compareTo(Price o) {

        return this.shopName.compareTo(o.shopName ) ;
    }
}
