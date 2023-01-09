package com.likelion.springbootshinhands.threetier.services;

import com.likelion.springbootshinhands.threetier.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demoRepository;

    @Override
    public String getMessage() {
        return demoRepository.getDemoRepository();
    }
}
