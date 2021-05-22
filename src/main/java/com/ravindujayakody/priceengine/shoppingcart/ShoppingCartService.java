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
        Product product = productRepository.getById(productId);
        return PriceCalculator.calculate(product, purchaseQuantity);
    }
}