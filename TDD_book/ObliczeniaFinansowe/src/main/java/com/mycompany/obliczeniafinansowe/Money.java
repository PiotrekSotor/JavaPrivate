/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.obliczeniafinansowe;

public class Money {
    protected int amount;
 
    
    @Override
    public boolean equals(Object obj){
        Money instance = (Money)obj;
        if (this.amount == instance.amount)
            return true;
        return false;
    }
}
