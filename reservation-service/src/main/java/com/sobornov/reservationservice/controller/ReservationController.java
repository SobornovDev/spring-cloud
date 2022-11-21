package com.sobornov.reservationservice.controller;

import com.sobornov.reservationservice.model.response.ReservationResponse;
import com.sobornov.reservationservice.service.ReservationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@RestController
@RequestMapping(value = "/reservations")
@RequiredArgsConstructor
@Tag(name = "Reservation management API")
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping
    @Operation(summary = "Get all reservations")
    public Iterable<ReservationResponse> getReservations() {
        return reservationService.getReservations();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get reservation by id")
    public ReservationResponse getReservation(@PathVariable("id") long id) {
        return reservationService.getReservation(id);
    }
}
