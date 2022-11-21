package com.sobornov.reservationservice.exception;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public class ReservationNotFoundException extends RuntimeException{
    public ReservationNotFoundException(long resId) {
        super(String.format("Reservation with id: %s not found", resId));
    }
}
