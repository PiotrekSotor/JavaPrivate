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
public class Franc extends Money{

    public Franc(int i) {
        amount = i;
    }

    public Franc times(int i) {
        return new Franc (amount * i);
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.amount;
        return hash;
    }
    
}
