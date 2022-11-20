package com.sobornov.guestservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "GUEST")
public class Guest {

    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
}
