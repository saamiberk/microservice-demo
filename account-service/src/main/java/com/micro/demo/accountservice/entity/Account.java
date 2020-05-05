package com.micro.demo.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Table(value = "accounts")
public class Account implements Serializable {

    @PrimaryKeyColumn(
            name = "email",
            ordinal = 0,
            type = PrimaryKeyType.CLUSTERED)
    private String id = UUID.randomUUID().toString();
    @Column(value = "uname")
    private String username;
    @Setter
    @PrimaryKeyColumn(
            type = PrimaryKeyType.PARTITIONED,
            ordinal = 1)
    private String email;
    @Column(value = "pwd")
    private String password;
    @Column(value = "created_at")
    private Date createdAt = new Date();
    @Column(value = "is_active")
    private Boolean active = true;

}
