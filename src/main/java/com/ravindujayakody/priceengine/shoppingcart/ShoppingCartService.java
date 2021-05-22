package com.ravindujayakody.priceengine.shoppingcart;

import com.ravindujayakody.priceengine.engine.PriceCalculator;
import com.ravindujayakody.priceengine.product.Product;
import com.ravindujayakody.priceengine.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    private ProductRepository productRepository;

    ShoppingCartService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public double calculatePrice(long productId, int purchaseQuantity){
//        Product product = productRepository.getById(productId);
        Product product = new Product("Penguin-ears", 20, 175.00);

        return PriceCalculator.calculate(product, purchaseQuantity);
    }
}