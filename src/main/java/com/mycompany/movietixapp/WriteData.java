/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movietixapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M Naufal Ihza S
 */
public class WriteData {
    private final File data = new File("data.txt");
    
    public void WriteData (String username, String password) {
        new Thread(() -> {
            try {
                FileWriter fileWriter = new FileWriter(data, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
                printWriter.println(username + ":" + password); 
                
                printWriter.close();
            } catch (Exception ignored) {
                
            }
        }).start();
    }
    
    public void WriteData (String username, ArrayList<String> order){
        
        new Thread(() -> {
            try {
                File user = new File (username + ".txt");
                FileWriter fileWriter = new FileWriter(user, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, false);
                
                for (int i=0; i < order.size() ; i++) {
                    printWriter.print(order.get(i) + "/");
                }
                printWriter.println();
                printWriter.close();
            } catch (Exception ignored) {
                
            }
        }).start();
    }
    
    
    
}

