package swiggy.model;

public class Restaurent {

    public String name;

   public int flatno;
  public  String  area;
   public int pincode;
   public String landmark;
   public String street;

public Menu menu;

    @Override
    public String toString() {
        return "Restaurent{" +
                "name='" + name + '\'' +
                ", flatno=" + flatno +
                ", area='" + area + '\'' +
                ", pincode=" + pincode +
                ", landmark='" + landmark + '\'' +
                ", street='" + street + '\'' +
                ", menu=" + menu +
                '}';
    }
}
