/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.obliczeniafinansowe;

import java.util.Hashtable;

/**
 *
 * @author Piotrek
 */
public class Bank {
    
    Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
                
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer)rates.get(new Pair(from, to));
        return rate.intValue();
    }
    
}
