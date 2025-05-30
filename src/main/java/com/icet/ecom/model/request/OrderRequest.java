package com.icet.ecom.model.request;

import com.icet.ecom.model.Customer;
import com.icet.ecom.model.OrderItems;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class OrderRequest {

    Customer customer;
    List<OrderItems> orderItems;

}
