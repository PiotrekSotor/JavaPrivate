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
public interface Expression {
 
    public Money reduce(String currency);
}
