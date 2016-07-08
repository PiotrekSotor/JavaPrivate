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
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
    
    public Money reduce (String currency){
        return new Money(augend.amount + addend.amount, currency);
    }
}
