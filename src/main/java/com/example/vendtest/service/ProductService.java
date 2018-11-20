package com.example.vendtest.service;

import com.example.vendtest.dto.ProductDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private Map<Long,ProductDto> products;
    private long id;

    @PostConstruct
    public void setup() {
        products = new HashMap<>();
        products.put(1L, new ProductDto(1, "Chrome Toaster", new BigDecimal(100)));
        products.put(2L, new ProductDto(2, "Copper Kettle", new BigDecimal(49.99)));
        products.put(3L, new ProductDto(3, "Copper Kettle", new BigDecimal(49.99)));

        id = 4L;
    }

    public List<ProductDto> getDummyProducts() {
        List<ProductDto> productDtos = new ArrayList<>();
        productDtos.add(new ProductDto(1, "Chrome Toaster", new BigDecimal(100)));
        productDtos.add(new ProductDto(2, "Copper Kettle", new BigDecimal(49.99)));
        productDtos.add(new ProductDto(3, "Copper Kettle", new BigDecimal(49.99)));
        return productDtos;
    }

    public Map<Long,ProductDto> getProducts() {
        return products;
    }

    public void addProduct(ProductDto productDto) {
        productDto.setId(id);
        products.put(id, productDto);
        id++;
    }

    public ProductDto getProduct(long id) {
        return products.get(id);
    }


}
