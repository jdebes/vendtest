package com.example.vendtest.service;

import com.example.vendtest.dto.HelloDto;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloDto getHelloResponse(long id, String hello) {
        return new HelloDto(id, hello);
    }

}
