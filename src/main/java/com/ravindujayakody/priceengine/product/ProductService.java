package com.ravindujayakody.priceengine.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> list(){
        return productRepository.findAll();
    }

    public List<Product> productPriceTable(){
        List<Product> products = list();

        return products;
    }
}