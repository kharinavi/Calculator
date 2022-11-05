package ru.kharina.study.calculator.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Calculator {
    private int firstField;
    private int secondField;
    private Operation operation;
    private double result = 0;
    private String history = "";

    public int getFirstField() {
        return firstField;
    }

    public void setFirstField(int firstField) {
        this.firstField = firstField;
        System.out.println("first = "+firstField);
    }

    public int getSecondField() {
        return secondField;
    }

    public void setSecondField(int secondField) {
        this.secondField = secondField;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getResult() {
        return Double.toString(result);
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getHistory() {
        return history;
    }

    public void setResultList(String history) {
        this.history = history;
    }

    public void calculate() {
        switch (operation) {
            case ADDITION:
                result = (double)firstField + (double)secondField;
                break;
            case SUBTRACTION:
                result = (double)firstField - (double)secondField;
                break;
            case MULTIPLICATION:
                System.out.println(firstField+" "+secondField);
                result = (double)firstField * (double)secondField;
                System.out.println(result);
                break;
            case DIVISION:
                result = (double)firstField / (double)secondField;
                break;
            default:
                result = 0;
                break;
        }
        history = history + "\n" + (String.format("%d %s %d = %s ",firstField,operation.getDisplayValue(),secondField,getResult()));
    }
}