package com.sobornov.roomservice.exception;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public class RoomNotFoundException extends RuntimeException{
    public RoomNotFoundException(long roomId) {
        super(String.format("Room with id: %s not found", roomId));
    }
}
