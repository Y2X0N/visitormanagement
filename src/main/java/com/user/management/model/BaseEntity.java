package com.user.management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int seqNumber;

    protected String createdBy;

    protected String updatedBy;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    protected LocalDateTime  createdDate;

    @LastModifiedDate
    @Column(name = "updated_at")
    protected LocalDateTime updatedDate;

    protected boolean deleteFlag = false;
}
