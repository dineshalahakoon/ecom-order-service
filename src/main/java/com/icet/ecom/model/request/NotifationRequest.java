package com.icet.ecom.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NotifationRequest {

    private String mobilrNumber;
    private String emailAddress;
    private String message;

}
