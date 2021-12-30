package com.epam.date.calculator.resource;


import com.epam.date.calculator.dto.DateCalculationRequest;
import com.epam.date.calculator.dto.DateCalculationResponse;
import io.swagger.annotations.Api;

@Api(
        value = "DateController"
)
public interface DateController {

    DateCalculationResponse calculateDays(DateCalculationRequest request);

}
