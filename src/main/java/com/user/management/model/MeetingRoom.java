package com.user.management.model;

import org.springframework.data.annotation.Id;

public class MeetingRoom extends BaseEntity {
    @Id
    private String roomId;

    private String name;

    private String location;

    private String capacity;
}
