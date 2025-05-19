package com.user.management.model;

import org.springframework.data.annotation.Id;

public class VisitorInfo extends BaseEntity {
    @Id
    private String visitorId;

    private String reservationId;

    private String name;

    private String companyName;

    private String token;
}
