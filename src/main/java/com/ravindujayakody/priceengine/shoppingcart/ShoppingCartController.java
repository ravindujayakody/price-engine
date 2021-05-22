package com.ravindujayakody.priceengine.shoppingcart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping-cart")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "calculate-price")
    public ResponseEntity calculatePrice(@RequestParam Long productId, @RequestParam Integer purchaseQuantity){
        return new ResponseEntity<>(shoppingCartService.calculatePrice(productId, purchaseQuantity), HttpStatus.OK);
    }
}