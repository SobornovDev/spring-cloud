package com.sobornov.roomservice.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Guest info")
public class RoomResponse {

    @Schema(description = "Id")
    private long id;

    @Schema(description = "Name of room")
    private String name;

    @Schema(description = "Number of room")
    private char roomNumber;

    @Schema(description = "Bed info")
    private char bedInfo;

}
