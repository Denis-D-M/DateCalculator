package com.epam.date.calculator.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {
  //ORC-02.02 Шаг 8.
  public Instant calculateEffectiveSince(LocalDate effectiveSince){
    return effectiveSince.atStartOfDay().toInstant(ZoneOffset.UTC).minus(1, ChronoUnit.DAYS).plus(21, ChronoUnit.HOURS);
  }

  public Instant calculateEndsAt(Instant effectiveSince, String period){
    return effectiveSince.plus(Period.parse(period)).minusSeconds(1);
  }

  public Instant calculateNextOfferDatetime(Instant effectiveSince, String period){
    return effectiveSince.plus(Period.parse(period)).minus(Period.ofDays(6));
  }

  public Instant calculateDueDate(Instant startsAtInclusive, String period){
    return startsAtInclusive.minus(1, ChronoUnit.DAYS);
  }
}
