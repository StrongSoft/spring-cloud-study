package com.regur.service;

import org.springframework.stereotype.Component;

@Component
public class FeignProductRemoteServiceImpl implements FeignProductRemoteService {
    @Override
    public String getProductInfo(String productId) {
        return "[ this product is sold out ]";
    }
}
