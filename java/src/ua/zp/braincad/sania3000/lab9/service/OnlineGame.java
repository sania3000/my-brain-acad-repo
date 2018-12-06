package ua.zp.braincad.sania3000.lab9.service;

import ua.zp.braincad.sania3000.lab9.api.Purchaser;
import ua.zp.braincad.sania3000.lab9.base.Product;

// TODO  implements Purchase
public class OnlineGame implements Purchaser {
    double cash= 50.0;



    @Override
    public Product[] addToBucket ( Product... product ) {
        return new Product[0];
    }

    @Override
    public boolean buy ( Product... product ) {
        return false;
    }


    public static void main ( String[] args ) {
        OnlineGame mygame=new OnlineGame();
        Product myproduct1 = new Product("Meat",2.0);
        Product myproduct2= new Product("Bread",1.0);
        Product myproduct3 = new Product("Battery",2.5);
        mygame.addToBucket(myproduct1,myproduct2,myproduct3);

    }


}
