package com.sobornov.guestservice.service;

import com.sobornov.guestservice.model.response.GuestResponse;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/

public interface GuestService {

    Iterable<GuestResponse> getGuests();

    GuestResponse getGuest(long id);

}
