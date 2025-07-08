package com.example.account_service.model;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatisticDTO {
    @NonNull
    private String message;
    @NonNull
    private Date createdDate;
}
