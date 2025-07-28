package com.ambereliz.mymoney.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "user_account")
@EqualsAndHashCode(callSuper = true)
public class UserAccountEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String email;

    private String name;

    @Column(name = "google_id", unique = true, nullable = false)
    private String googleId;

    private String avatarUrl;
}
