package swiggy.model;

import java.util.Date;

public class Otp {

   public String number;
    public Date expirydate;
    public Date  creationtime;

    @Override
    public String toString() {
        return "Otp{" +
                "number='" + number + '\'' +
                ", expirydate=" + expirydate +
                ", creationtime=" + creationtime +
                '}';
    }
}
