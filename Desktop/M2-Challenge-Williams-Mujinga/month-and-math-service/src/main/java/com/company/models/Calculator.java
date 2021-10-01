package com.company.models;

import java.util.Objects;

public class Calculator {

    private int operand1;
    private int operand2;
    private int operation
    private int answer;
    private int add;
    private int subtract;
    private int multiply;
    private int divide;

    public Calculator(int operand1, int operand2, int operation, int answer, int add, int subtract, int multiply, int divide) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSubtract() {
        return subtract;
    }

    public void setSubtract(int subtract) {
        this.subtract = subtract;
    }

    public int getMultiply() {
        return multiply;
    }

    public void setMultiply(int multiply) {
        this.multiply = multiply;
    }

    public int getDivide() {
        return divide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && operation == that.operation && answer == that.answer && add == that.add && subtract == that.subtract && multiply == that.multiply && divide == that.divide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer, add, subtract, multiply, divide);
    }

    public void setDivide(int divide) {
        this.divide = divide;


    }
}

