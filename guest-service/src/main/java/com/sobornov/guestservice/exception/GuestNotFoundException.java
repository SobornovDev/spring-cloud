package com.sobornov.guestservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GuestNotFoundException extends RuntimeException{
    public GuestNotFoundException(Long guestId) {
        super(String.format("Guest with id: %s not found", guestId));
    }
}
