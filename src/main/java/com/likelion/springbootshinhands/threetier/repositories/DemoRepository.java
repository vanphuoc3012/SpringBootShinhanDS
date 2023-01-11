package com.likelion.springbootshinhands.threetier.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String getDemoRepository() {
        return "Hello, I'm from Repository Layer";
    }
}
