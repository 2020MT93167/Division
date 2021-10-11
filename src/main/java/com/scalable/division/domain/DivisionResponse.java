package com.scalable.division.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DivisionResponse implements Serializable {
    private static final long serialVersionUID = -6543262445504289504L;
    String result;
}
