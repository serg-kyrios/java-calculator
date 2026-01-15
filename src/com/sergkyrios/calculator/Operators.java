package com.sergkyrios.calculator;

public class Operators {
enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator fromString(String text) {
        for (Operator op : Operator.values()) {
            if (op.symbol.equals(text)) {
                return op;
            }
        }
        return null;
    }}

}
