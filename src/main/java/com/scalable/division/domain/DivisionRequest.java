package com.scalable.division.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DivisionRequest implements Serializable     {
    private static final long serialVersionUID = 3378723997062490515L;
    BigDecimal firstOperand;
    BigDecimal secondOperand;
}
