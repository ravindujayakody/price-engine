package com.ravindujayakody.priceengine.engine;

import com.ravindujayakody.priceengine.product.Product;

public class PriceCalculator {

    public static double calculate(Product product, int purchaseQty) {
        int singleUnitCount = purchaseQty % product.getUnitsPerCarton();
        int cartonCount = (purchaseQty - singleUnitCount) / product.getUnitsPerCarton();

        double singleUnitsPrice = singleUnitCount * (product.getCartonPrice() / product.getUnitsPerCarton()) * 1.3;
        double cartonPrice = cartonCount * product.getCartonPrice();

        if(cartonCount >= 3){
            cartonPrice -= cartonPrice * 10 / 100;
        }
        System.out.println("Name : " + product.getName());
        System.out.println("Purchased Qty : " + purchaseQty);
        System.out.println("Price : " + (singleUnitsPrice + cartonPrice));
        System.out.println("------------------------------------------------------------------");
        return singleUnitsPrice + cartonPrice;
    }
}
