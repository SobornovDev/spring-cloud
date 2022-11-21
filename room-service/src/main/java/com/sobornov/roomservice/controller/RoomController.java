package com.sobornov.roomservice.controller;

import com.sobornov.roomservice.model.response.RoomResponse;
import com.sobornov.roomservice.service.RoomService;
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
@RequestMapping(value = "/rooms")
@RequiredArgsConstructor
@Tag(name = "Room management API")
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    @Operation(summary = "Get all rooms")
    public Iterable<RoomResponse> getRooms() {
        return roomService.getRooms();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get room by id")
    public RoomResponse getRoom(@PathVariable("id") long id) {
        return roomService.getRoom(id);
    }
}
