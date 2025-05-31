package com.icet.ecom.service.impl;

import com.icet.ecom.model.request.NotifationRequest;
import com.icet.ecom.model.request.OrderRequest;
import com.icet.ecom.model.responso.NotificationResponse;
import com.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final RestTemplate restTemplate;
    public ResponseEntity<NotificationResponse> order(OrderRequest orderRequest){
        log.info(String.valueOf(orderRequest.getOrderItems()));
        NotifationRequest notifationRequest = new NotifationRequest();
        notifationRequest.setEmailAddress(orderRequest.getCustomer().getEmail());
        notifationRequest.setMobilrNumber(orderRequest.getCustomer().getContactNumber());
        log.info(notifationRequest.toString());
        notifationRequest.setMessage("Order Success");
        //store orer in db, proceed gateway payment, info notification service


        ResponseEntity<NotificationResponse> stringResponseEntity = restTemplate.postForEntity("http://localhost:8080/notification/send",
                notifationRequest, NotificationResponse.class);
        log.info(stringResponseEntity.toString());
        return stringResponseEntity;
    }
}
