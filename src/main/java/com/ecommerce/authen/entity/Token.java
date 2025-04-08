package com.ecommerce.authen.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.ecommerce.authen.entity.enumeration.TokenStatus;

import java.sql.Timestamp;

@Entity
@Table(name = "token")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date", nullable = false, updatable = false)
    private Timestamp createDate;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "access_token", nullable = false)
    private String accessToken;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "ip")
    private String ip;

    @Column(name = "expires_at")
    private Timestamp expiresAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TokenStatus status;
}

