package com.epam.date.calculator.resource.impl;

import com.epam.date.calculator.dto.DateCalculationRequest;
import com.epam.date.calculator.dto.DateCalculationResponse;
import com.epam.date.calculator.resource.DateController;
import com.epam.date.calculator.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class DateControllerImpl implements DateController {

    private final CalculationService service;

    @Override
    public DateCalculationResponse calculateDays(DateCalculationRequest request) {
        DateCalculationResponse response = new DateCalculationResponse();

        Instant effectiveSince = request.getEffectiveSince();
        String contractPeriod = request.getContractDuration();

        service.calculateEndsAt(effectiveSince, contractPeriod);
        service.calculateNextOfferDatetime(effectiveSince, contractPeriod);
//        service.calculateDueDate()

        return response;
    }
}
