package com.sobornov.guestservice.mapper;

import com.sobornov.guestservice.model.Guest;
import com.sobornov.guestservice.model.response.GuestResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@Mapper
public interface GuestMapper {
    GuestResponse toGuestResponse(Guest guest);
}
