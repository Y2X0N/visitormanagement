package com.user.management.model;

import org.springframework.data.annotation.Id;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Reservation extends BaseEntity {
    @Id
    private String reservationId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private String userId;

    private String roomId;

    private String description;

    private String date;

    private String startTime;

    private String endTime;

    private String status;

    private String reasonRejected;
}
