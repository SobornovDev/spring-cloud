package com.sobornov.reservationservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID")
    private long room_id;

    @Column(name = "GUEST_ID")
    private long guest_id;

    @Column(name = "RES_DATE")
    private LocalDate resDate;
}
