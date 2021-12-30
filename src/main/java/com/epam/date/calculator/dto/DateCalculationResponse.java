package com.epam.date.calculator.dto;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class DateCalculationResponse {

  private LocalDate effectiveSince;

  private Instant endsAt;

  private Instant nextOfferDatetime ;

  private Instant dueDate;
}
