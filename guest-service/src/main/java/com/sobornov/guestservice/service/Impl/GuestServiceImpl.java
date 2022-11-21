package com.sobornov.guestservice.service.Impl;

import com.sobornov.guestservice.exception.GuestNotFoundException;
import com.sobornov.guestservice.mapper.GuestMapper;
import com.sobornov.guestservice.model.response.GuestResponse;
import com.sobornov.guestservice.repository.GuestRepository;
import com.sobornov.guestservice.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {
    private final GuestRepository guestRepository;
    private final GuestMapper guestMapper;
    @Override
    public Iterable<GuestResponse> getGuests() {
        return StreamSupport
                .stream(guestRepository.findAll().spliterator(), false)
                .map(guestMapper::toGuestResponse).collect(Collectors.toList());
    }
    @Override
    public GuestResponse getGuest(long guestId) {
        return guestRepository.findById(guestId)
                .map(guestMapper::toGuestResponse)
                .orElseThrow(() -> new GuestNotFoundException(guestId));
    }
}
