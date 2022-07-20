package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {
    private int dollar, cent;

    public Checkout(int _dollar, int _cent){
            dollar = _dollar;
            cent = _cent;
    }

    public int getDollar(){
        return dollar;
    }

    public int getCent() {
        return cent;
    }


    @Override
    public String toString() {
        return "Price is: " + getDollar() + " dollars and " + getCent() + " cents";
    }


    public String totalPrice() {
        int totalDollar = getDollar(), totalCent = getCent();
        return "Total price is: " + totalDollar + " dollars and " + totalCent + " cents";
    }
}
