package com.icet.ecom.controller;

import com.icet.ecom.model.request.OrderRequest;
import com.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
private final OrderService orderService;

    @PostMapping
    void order(@RequestBody OrderRequest orderRequest){

        orderService.order(orderRequest);
        //submit db
        //proceed with payment
        //inform notification service


        saveOrder();
        pay();
        sendSms();

    }
    void saveOrder(){

    }
    void pay(){

    }
    void sendSms(){

    }

}
