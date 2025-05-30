package com.icet.ecom.service.impl;

import com.icet.ecom.model.request.OrderRequest;
import com.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final RestTemplate restTemplate;
    public void order(OrderRequest orderRequest){
        log.info(String.valueOf(orderRequest.getOrderItems()));
        //store orer in db, proceed gateway payment, info notification service
    }
}
