package com.sobornov.guestservice.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author : Sobornov Vladimir
 * @since : 20.11.2022
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Guest info")
public class GuestResponse {

    @Schema(description = "Id")
    private long id;

    @Schema(description = "First name")
    private String firstName;

    @Schema(description = "Last name")
    private String lastName;

    @Schema(description = "Email address")
    private String emailAddress;

    @Schema(description = "Address")
    private String address;

    @Schema(description = "Country")
    private String country;

    @Schema(description = "State")
    private String state;

    @Schema(description = "Phone number")
    private String phoneNumber;
}
