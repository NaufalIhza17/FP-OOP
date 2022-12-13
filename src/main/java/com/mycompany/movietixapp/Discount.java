/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movietixapp;

import java.util.Random;

/**
 *
 * @author M Naufal Ihza S
 */

interface Voucher {
    public void DiscVoucher();
}

public class Discount implements Voucher{
    StringBuilder salt = new StringBuilder();
    public String coupon;
    
    public String getCoupon() {
        this.coupon = salt.toString(); 
        return coupon;
    }
    
    public void printCoupon(){
        System.out.println(this.coupon);
    }
    
    @Override
    public void DiscVoucher() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
    }
    
    public static void main(String args[]) {
        Discount a = new Discount();
        a.DiscVoucher();
        a.getCoupon();
        a.printCoupon();
    }
    
}
