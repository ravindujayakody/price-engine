package com.ravindujayakody.priceengine.dto;

import com.ravindujayakody.priceengine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductPriceTable {

    private Product product;
    private List<ProductPriceLine> priceLines = new ArrayList<>();

    public ProductPriceTable() {
    }

    public ProductPriceTable(Product product, List<ProductPriceLine> priceLines) {
        this.product = product;
        this.priceLines = priceLines;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ProductPriceLine> getPriceLines() {
        return priceLines;
    }

    public void setPriceLines(List<ProductPriceLine> priceLines) {
        this.priceLines = priceLines;
    }
}
