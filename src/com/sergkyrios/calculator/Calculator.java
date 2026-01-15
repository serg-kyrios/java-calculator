package com.sergkyrios.calculator;



public enum Calculator {

    ADD {double apply(double a, double b) { return a + b; }},
    SUBTRACT {double apply(double a, double b) { return a - b; }},
    MULTIPLY {double apply(double a, double b) { return a * b; }},
    DIVIDE {double apply(double a, double b) { return a / b; }};

    abstract double apply(double a, double b);



}
