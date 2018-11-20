package com.example.vendtest.dto;

import com.example.vendtest.model.LineItem;

import java.math.BigDecimal;
import java.util.List;

public class SaleResponse {
    private List<LineItem> lineItems;
    private BigDecimal total;

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
