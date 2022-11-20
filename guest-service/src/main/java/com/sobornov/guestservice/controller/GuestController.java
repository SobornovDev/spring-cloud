package com.sobornov.guestservice.controller;

import com.sobornov.guestservice.model.response.GuestResponse;
import com.sobornov.guestservice.service.GuestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@RestController
@RequestMapping(value = "/guests")
@RequiredArgsConstructor
@Tag(name = "Guest management API")
public class GuestController {

    private final GuestService guestService;

    @GetMapping()
    @Operation(summary = "Get all guests")
    public Iterable<GuestResponse> getGuests() {
        return guestService.getGuests();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get guest by id")
    public GuestResponse getGuest(@PathVariable("id") long id) {
        return guestService.getGuest(id);
    }
}
