package com.example.vendtest.controller;

import com.example.vendtest.dto.HelloDto;
import com.example.vendtest.exception.RestException;
import com.example.vendtest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody HelloDto getHello() {
        return helloService.getHelloResponse(1, "test");
    }

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public @ResponseBody HelloDto getHelloID(@RequestParam Optional<Long> id) throws Exception {
        if (id.isPresent()) {
            return helloService.getHelloResponse(id.get(), "test");
        }

        throw new RestException(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public @ResponseBody HelloDto postHello(@RequestBody HelloDto helloDto) {
        return helloService.getHelloResponse(helloDto.getId(), helloDto.getHello());
    }
}
