package com.epam.date.calculator.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import lombok.Data;

@Data
public class DateCalculationRequest {

  private Instant effectiveSince;

  private String contractDuration;
}
