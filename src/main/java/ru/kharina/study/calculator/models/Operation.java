package ru.kharina.study.calculator.models;

public enum Operation {
    MULTIPLICATION("*"),
    DIVISION(":"),
    ADDITION("+"),
    SUBTRACTION("-");

    private final String displayValue;

    private Operation(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
