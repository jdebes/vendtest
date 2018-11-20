package com.example.vendtest.dto;

import java.math.BigDecimal;

public class LineItemDto {
    private long productId;
    private BigDecimal quantity;

    public LineItemDto() {
    }

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
}
