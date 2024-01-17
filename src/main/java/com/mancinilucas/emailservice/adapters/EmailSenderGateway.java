package com.mancinilucas.emailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
