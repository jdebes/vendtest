package com.example.vendtest.dto;

public class HelloDto {
    private long id;
    private String hello;

    public HelloDto(long id, String hello) {
        this.id = id;
        this.hello = hello;
    }

    public HelloDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
