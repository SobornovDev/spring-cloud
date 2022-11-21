package com.sobornov.roomservice.service.Impl;

import com.sobornov.roomservice.exception.RoomNotFoundException;
import com.sobornov.roomservice.mapper.RoomMapper;
import com.sobornov.roomservice.model.response.RoomResponse;
import com.sobornov.roomservice.repository.RoomRepository;
import com.sobornov.roomservice.service.RoomService;
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
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;

    @Override
    public Iterable<RoomResponse> getRooms() {
        return StreamSupport.stream(roomRepository.findAll().spliterator(), false)
                .map(roomMapper::toRoomResponse)
                .collect(Collectors.toList());
    }

    @Override
    public RoomResponse getRoom(long roomId) {
        return roomRepository.findById(roomId)
                .map(roomMapper::toRoomResponse)
                .orElseThrow(() -> new RoomNotFoundException(roomId));
    }
}
