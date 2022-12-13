/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movietixapp;

/**
 *
 * @author M Naufal Ihza S
 */

abstract class DiscountCut {
    public abstract double Cut();
}

public class GoldMember extends Membership {
    
    public double disc = 0;
    
//    public double setDisc() {
//        
//    }
    
//    public double Cut(double balance) {
//        balance -= 
//    }
    
    @Override
    public String member () {
        return "GOLD";
    }
}
