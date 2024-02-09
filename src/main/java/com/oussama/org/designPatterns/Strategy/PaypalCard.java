package com.oussama.org.designPatterns.Strategy;

public class PaypalCard implements CardOperator{
    public String Transaction(){
        return "Transaction Successful By PaypalCard";
    }
}
