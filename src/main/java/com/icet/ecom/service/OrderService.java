package com.icet.ecom.service;

import com.icet.ecom.model.request.OrderRequest;
import com.icet.ecom.model.responso.NotificationResponse;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity<NotificationResponse> order(OrderRequest orderRequest);
}
