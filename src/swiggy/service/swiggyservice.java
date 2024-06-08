package swiggy.service;

import swiggy.model.Otp;
import swiggy.model.Restaurent;


import java.util.Date;
import java.util.UUID;

public class swiggyservice {

    public  static Restaurent restaurentstaticvariable;

    public Otp registerRestaurent(Restaurent rrr){

        restaurentstaticvariable=rrr;
        Otp otp=new Otp();
        otp.number= UUID.randomUUID().toString();


        otp.creationtime=new Date();
        long currentTimeinmills=otp.creationtime.getTime();


        //15mins --->900sec -->900*1000=900000;
        long endTimeinmills=currentTimeinmills+900000;


        otp.expirydate=new Date(endTimeinmills);


        return otp;





    }

}
