package com.epam.date.calculator.dto;

import java.time.LocalDate;
import java.time.Period;
import lombok.Data;

@Data
public class DateCalculationRequest {

  private LocalDate effectiveSince;

  private Period contractDuration;
}
