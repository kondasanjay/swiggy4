package swiggy.model;

public class Menu {

    public String dishName;
    public double price;
    public boolean status;

    @Override
    public String toString() {
        return "Menu{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
