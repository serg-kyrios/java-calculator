package com.sergkyrios.calculator;

public class Operations {
    public enum Operation {
        ADD("+"),
        SUBTRACT("-"),     // Додано параметри для всіх
        MULTIPLY("*"),
        DIVIDE("/");

        private final String symbol;

        Operation(String symbol) {

            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }
}
