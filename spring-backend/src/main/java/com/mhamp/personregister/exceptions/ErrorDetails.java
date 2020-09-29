package com.mhamp.personregister.exceptions;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
public class ErrorDetails {
    @Getter
    private Date timestamp;
    @Getter
    private String message;
    @Getter
    private String details;
}