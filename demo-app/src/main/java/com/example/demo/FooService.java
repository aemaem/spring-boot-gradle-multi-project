package com.example.demo;

import com.example.demo.api.FooApi;
import org.springframework.stereotype.Service;

@Service
public class FooService implements FooApi {

    @Override
    public String getFooName() {
        return "Hi there!";
    }
}
