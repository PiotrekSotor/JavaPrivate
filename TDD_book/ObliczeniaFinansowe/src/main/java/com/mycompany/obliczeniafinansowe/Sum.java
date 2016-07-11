/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.obliczeniafinansowe;

/**
 *
 * @author Piotrek
 */
public class Sum implements Expression{
    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }
    
    @Override
    public Money reduce(Bank bank, String currency) {
        int amount = augend.reduce(bank, currency).amount + addend.reduce(bank, currency).amount;
        return new Money(amount, currency);
    }

    @Override
    public Expression times(int i) {
        return new Sum (augend.times(i), addend.times(i));
        
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

}
