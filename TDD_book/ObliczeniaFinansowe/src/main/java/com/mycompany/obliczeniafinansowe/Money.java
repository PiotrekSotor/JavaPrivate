/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.obliczeniafinansowe;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int i, String a_currency) {
        amount = i;
        currency = a_currency;
    }
    
    public static Money dollar(int i) {
        return new Money(i, "USD");
    }

    public static Money franc(int i) {
        return new Money(i, "CHF");
    }
 
    
    @Override
    public boolean equals(Object obj){
        Money instance = (Money)obj;
        if (this.amount == instance.amount && this.currency.equals(instance.currency))
            return true;
        return false;
    }
    
    public Money times(int i) {
        return new Money(amount * i, currency);
    }
    
    public String currency(){
        return currency;
    }
    
    public String toString(){
        return new String (amount + " " + currency);
    }

    public Money plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
