package com.example.vendtest.service;

import com.example.vendtest.dto.LineItemDto;
import com.example.vendtest.dto.SaleResponse;
import com.example.vendtest.model.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Line;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private ProductService productService;

    private List<LineItem> buildLineItems(List<LineItemDto> lineItemDtos) {
        List<LineItem> lineItems = new ArrayList<>();
        for (LineItemDto lineItemDto : lineItemDtos) {
            LineItem lineItem = new LineItem();
            lineItem.setProductId(lineItemDto.getProductId());
            lineItem.setQuantity(lineItemDto.getQuantity());
            lineItem.setTotal(productService.getProduct(lineItemDto.getProductId()).getPrice().multiply(lineItemDto.getQuantity()));
        }

        return lineItems;
    }

    private BigDecimal getLineItemTotal(List<LineItem> lineItems) {
        BigDecimal total = new BigDecimal(0);

        for (LineItem lineItem : lineItems) {
            total = total.add(lineItem.getTotal());
        }

        return total;
    }

    public SaleResponse getSaleResponse(List<LineItemDto> lineItemDtos) {
        SaleResponse saleResponse = new SaleResponse();
        saleResponse.setLineItems(buildLineItems(lineItemDtos));
        saleResponse.setTotal(getLineItemTotal(saleResponse.getLineItems()));

        return saleResponse;
    }
}
