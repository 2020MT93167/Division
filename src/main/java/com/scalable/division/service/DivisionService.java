package com.scalable.division.service;

import com.scalable.division.domain.DivisionRequest;
import com.scalable.division.domain.DivisionResponse;

public interface DivisionService {
    DivisionResponse response(DivisionRequest request) throws Exception;
}