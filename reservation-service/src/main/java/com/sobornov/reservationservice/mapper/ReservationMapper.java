package com.sobornov.reservationservice.mapper;

import com.sobornov.reservationservice.model.Reservation;
import com.sobornov.reservationservice.model.response.ReservationResponse;
import org.mapstruct.Mapper;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Mapper
public interface ReservationMapper {
    ReservationResponse toReservationResponse(Reservation reservation);
}
