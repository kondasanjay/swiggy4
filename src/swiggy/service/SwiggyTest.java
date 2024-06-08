package swiggy.service;

import swiggy.model.Menu;
import swiggy.model.Otp;
import swiggy.model.Restaurent;

public class SwiggyTest {
    public static void main(String[] args) {

        Restaurent r=new Restaurent();
        Menu m =new Menu();

        r.name="kfc";
        r.flatno=425;
        r.area="kpbh";
        r.pincode=22333;
        r.landmark="sneha chicken center back side";
        r.street="heha nagar" ;


        m.dishName="biryani";
        m.price=398;
        m.status=true;

        r.menu=m;

        swiggyservice swiggyservice=new swiggyservice();

     //   Otp r3= swiggyservice.registerRestaurent(r);

       // System.out.println(r3);


        System.out.println(swiggyservice.registerRestaurent(r));



    }
}
