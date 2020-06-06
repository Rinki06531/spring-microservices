package com.microservices.application.service.impl;

import com.microservices.application.model.BeerDto;
import com.microservices.application.service.BeerService;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("beerService")
public class BeerServiceimpl implements BeerService {
    @Override
    public BeerDto getBeer() {
        return BeerDto.builder().uid(UUID.randomUUID())
                .type("strong")
                .price(230).build();
    }
}
