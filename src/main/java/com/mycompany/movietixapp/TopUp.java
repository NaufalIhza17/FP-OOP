/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movietixapp;


/**
 *
 * @author M Naufal Ihza S
 */


public class TopUp{
    public double balance = 0;
    public int paymentCode;

    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double topUpBalance) {
        balance += topUpBalance;
    }
    
}
