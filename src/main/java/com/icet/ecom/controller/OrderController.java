package com.icet.ecom.controller;

import com.icet.ecom.model.request.OrderRequest;
import com.icet.ecom.model.responso.NotificationResponse;
import com.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<NotificationResponse> order(@RequestBody OrderRequest orderRequest){

        return orderService.order(orderRequest);


    }



}
