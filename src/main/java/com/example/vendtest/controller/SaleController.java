package com.example.vendtest.controller;

import com.example.vendtest.dto.LineItemDto;
import com.example.vendtest.dto.SaleResponse;
import com.example.vendtest.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SaleController {

    @Autowired
    SaleService saleService;

    @RequestMapping(value = "/sales", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody SaleResponse postSale(@RequestBody List<LineItemDto> lineItemDto) {
        return saleService.getSaleResponse(lineItemDto);
    }
}
