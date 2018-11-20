package com.example.vendtest.model;

import com.example.vendtest.dto.ProductDto;

import java.math.BigDecimal;

public class LineItem {
    private long productId;
    private BigDecimal quantity;
    private BigDecimal total;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
