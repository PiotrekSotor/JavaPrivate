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
public class Bank {

    public Money reduce(Expression source, String currency) {
        return source.reduce(currency);
                
    }

    public void addRate(String from, String to, double rate) {
        
    }
    
}
