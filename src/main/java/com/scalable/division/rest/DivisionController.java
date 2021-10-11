package com.scalable.division.rest;


import com.scalable.division.domain.DivisionRequest;
import com.scalable.division.domain.DivisionResponse;
import com.scalable.division.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DivisionController {

    @Autowired
    DivisionService divisionService;

    @PostMapping("/divide")
    public DivisionResponse add(@RequestBody DivisionRequest request) throws Exception {
        if (request.getFirstOperand() != null && request.getSecondOperand() != null)
            return divisionService.response(request);
        else
         return new DivisionResponse();
    }
}
