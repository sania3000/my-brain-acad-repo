package ua.zp.braincad.sania3000.lab9.store;

import ua.zp.braincad.sania3000.lab9.base.AbstractStore;
import ua.zp.braincad.sania3000.lab9.base.Product;

public class FairSeller extends AbstractStore {

    public FairSeller(String storeName, Product[] products) {
        super(storeName, products);
    }

    @Override
    protected void registerNewProduct(Product newProduct) {

    }
}
