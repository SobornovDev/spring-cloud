package com.sobornov.reservationservice.service;

import com.sobornov.reservationservice.model.response.ReservationResponse;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public interface ReservationService {
    Iterable<ReservationResponse> getReservations();

    ReservationResponse getReservation(long resId);
}
