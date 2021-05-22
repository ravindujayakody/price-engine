package com.ravindujayakody.priceengine.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    private ProductService productService;

    ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity list(){
        return new ResponseEntity<>(productService.list(), HttpStatus.OK);
    }

    @GetMapping(path = "price-table")
    public ResponseEntity productPriceTable(){
        return new ResponseEntity<>(productService.productPriceTable(), HttpStatus.OK);
    }
}
