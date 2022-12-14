/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movietixapp;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author M Naufal Ihza S
 */

abstract class Cut {
    Queue<Integer> discVTotal = new PriorityQueue<>();
    int totalCut = 0;
    public abstract void PaymentCut(String code);
    public int getPayment() {
        Iterator iterator = discVTotal.iterator();
        while(iterator.hasNext()) {
            totalCut += (int)iterator.next();
        }
        return totalCut;
    }
}

public class Payment extends Cut {
    
    @Override
    public void PaymentCut(String code) {
            String value = code;
            String lastTwo = null;
            if (value != null && value.length() >= 2) {  
                lastTwo = value.substring(value.length() - 2);
                
                if ("30".equals(lastTwo)) {
                discVTotal.add(30000);
                } else if ("10".equals(lastTwo)) {
                    discVTotal.add(10000);
                } else {
                    discVTotal.add(5000);
                }
            }
    }
    
//    public static void main(String args[]) {
//        Payment a = new Payment();
//        
//        a.PaymentCut("AGHCH1231205");
//        a.PaymentCut("AGHCH1231210");
//        a.PaymentCut("AGHCH1231230");
//        System.out.println(a.getPayment(30000));
//    }
}
