package com.ravindujayakody.priceengine.product;

import com.ravindujayakody.priceengine.dto.ProductPriceTable;
import com.ravindujayakody.priceengine.dto.ProductPriceLine;
import com.ravindujayakody.priceengine.engine.PriceCalculator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {

    private ProductRepository productRepository;

    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> list(){
        return productRepository.findAll();
    }

    public List<ProductPriceTable> productPriceTable(){
        List<Product> products = list();
        List<ProductPriceTable> productPriceTables = new ArrayList<>();

        for (Product product : products) {

            List<ProductPriceLine> priceLines = IntStream.range(0, 50)
                    .mapToObj(i -> new ProductPriceLine(i, PriceCalculator.calculate(product, i)))
                    .collect(Collectors.toList());

            productPriceTables.add(new ProductPriceTable(product, priceLines));
        }

        return productPriceTables;
    }
}