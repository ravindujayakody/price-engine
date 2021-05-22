package com.ravindujayakody.priceengine;

import com.ravindujayakody.priceengine.product.Product;
import com.ravindujayakody.priceengine.product.ProductRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class TemporaryDataFeeder {

    private ProductRepository productRepository;

    TemporaryDataFeeder(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        try {
            productRepository.save(new Product("Penguin-ears", 20, 175.00));
            productRepository.save(new Product("Horseshoe", 5, 825.00));
        }catch (DataIntegrityViolationException ignore){}
    }
}
