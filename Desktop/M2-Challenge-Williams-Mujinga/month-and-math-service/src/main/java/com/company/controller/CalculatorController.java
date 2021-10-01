package com.company.controller;


import com.company.models.Calculator;
import jdk.dynalink.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class CalculatorController {
    private static int mathEquation(int add, int subtract, int multiply, int divide){

        int operand1;

        int operand2;

add = operand1 + operand2;
subtract = operand1 - operand2;
multiply = operand1 * operand2;
divide = operand1/operand2;
    }


   @PostMapping("/add")
           @ResponseStatus(HttpStatus.CREATED)
   public Calculator addNumbers(@RequestBody @valid Calculator mathEquation){
       if(!mathEquation.getOperation().equals("add")){
           throw new IllegalArgumentException(("operation is not addition"));
       }
       mathEquation.add(mathEquation.getOperand1(), mathEquation.getOperand2());
       return mathEquation;
        }
}
