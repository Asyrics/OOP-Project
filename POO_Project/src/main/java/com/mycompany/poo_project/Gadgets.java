/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

public abstract class Gadgets {
    public int dB = 0;
    public int greutate = 0;
    public int autonomie = 0;
    public String culoare = null;
    public boolean software = false;
    public String brand = null;
    
    public Gadgets(){};
    
    
    public abstract int getBrand();
    public abstract int getAutonomie(); 
    
}
