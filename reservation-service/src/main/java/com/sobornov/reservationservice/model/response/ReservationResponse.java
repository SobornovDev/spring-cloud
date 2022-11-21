package com.sobornov.reservationservice.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Reservation info")
public class ReservationResponse {

    @Schema(description = "Reservation Id")
    private long id;

    @Schema(description = "Room Id")
    private long room_id;

    @Schema(description = "Guest Id")
    private long guest_id;

    @Schema(description = "Reservation's date")
    private LocalDate resDate;
}
