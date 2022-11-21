package com.sobornov.reservationservice.service.Impl;

import com.sobornov.reservationservice.exception.ReservationNotFoundException;
import com.sobornov.reservationservice.mapper.ReservationMapper;
import com.sobornov.reservationservice.model.response.ReservationResponse;
import com.sobornov.reservationservice.repository.ReservationRepository;
import com.sobornov.reservationservice.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;

    @Override
    public Iterable<ReservationResponse> getReservations() {
        return StreamSupport.stream(reservationRepository.findAll().spliterator(), false)
                .map(reservationMapper::toReservationResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ReservationResponse getReservation(long resId) {
        return reservationRepository.findById(resId)
                .map(reservationMapper::toReservationResponse)
                .orElseThrow(() -> new ReservationNotFoundException(resId));
    }
}
