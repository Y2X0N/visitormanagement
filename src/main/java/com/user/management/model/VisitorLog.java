package com.user.management.model;

import org.springframework.data.annotation.Id;

public class VisitorLog extends BaseEntity {
    @Id
    private String visitId;

    private String visitorId;

    private String checkinTime;

    private String checkoutTime;
}
