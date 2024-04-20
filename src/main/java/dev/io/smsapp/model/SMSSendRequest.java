package dev.io.smsapp.model;

import lombok.Data;

@Data
public class SMSSendRequest {
    private String destinationSMSNumber;
    private String smsMessage;
}
