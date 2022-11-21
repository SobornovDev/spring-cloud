package com.sobornov.reservationservice.repository;

import com.sobornov.reservationservice.model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
