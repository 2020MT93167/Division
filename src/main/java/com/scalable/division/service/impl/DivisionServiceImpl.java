package com.scalable.division.service.impl;

import com.scalable.division.domain.DivisionRequest;
import com.scalable.division.domain.DivisionResponse;
import com.scalable.division.service.DivisionService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Override
    public DivisionResponse response(DivisionRequest request) throws Exception {
        DivisionResponse resp = new DivisionResponse();
        final BigDecimal firstOperand = getOperand(request.getFirstOperand());
        final BigDecimal secondOperand = getOperand(request.getSecondOperand());
        if(secondOperand.doubleValue() > 0.0) {
            final BigDecimal result = firstOperand.divide(secondOperand, 2, RoundingMode.HALF_UP);
            resp.setResult(result.toString());
        } else resp.setResult("Second Operand should be greater than 0.00");
        return resp;
    }

    private BigDecimal getOperand(final BigDecimal operand ) throws Exception {
        return Optional.ofNullable(operand).orElseThrow(Exception::new);
    }
}
