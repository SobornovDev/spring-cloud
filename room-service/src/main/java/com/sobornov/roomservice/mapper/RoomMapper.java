package com.sobornov.roomservice.mapper;

import com.sobornov.roomservice.model.Room;
import com.sobornov.roomservice.model.response.RoomResponse;
import org.mapstruct.Mapper;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Mapper
public interface RoomMapper {
    RoomResponse toRoomResponse(Room room);
}
