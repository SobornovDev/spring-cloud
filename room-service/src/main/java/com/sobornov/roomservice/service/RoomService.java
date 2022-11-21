package com.sobornov.roomservice.service;

import com.sobornov.roomservice.model.response.RoomResponse;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public interface RoomService {

    Iterable<RoomResponse> getRooms();

    RoomResponse getRoom(long id);
}
