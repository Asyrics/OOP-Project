/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

public abstract class Gadgets {
    
    protected String numeProdus = null;
    protected String culoare = null;
    protected boolean software = false;
    protected String brand = null;
    
    public Gadgets(){};
    public Gadgets(String nume,String cul,boolean soft,String Brand){
        this.numeProdus = nume;
        this.culoare = cul;
        this.software = soft;
        this.brand = Brand;
    };
    public Gadgets(Gadgets a1){
        this.brand = a1.brand;
        this.culoare = a1.culoare;
        this.numeProdus = a1.numeProdus;
        this.software = a1.software;
    }
    
    public String getNumeProdus(){ 
        return this.numeProdus; 
    }
    public String getCuloare(){ 
        return this.culoare; 
    }
    public boolean areSoftware(){
        return this.software; 
    }
    public String getBrand(){
        return this.brand;
    }
    public void setCuloare(String culoare){ 
        this.culoare = culoare; 
    }
    public void setNumeProdus(String numeProdus){ 
        this.numeProdus = numeProdus; 
    }
    public void setSoftware(boolean software){ 
        this.software = software; 
    }

    public void setBrand(String brand)
    { 
        this.brand = brand; 
    }
    
    public abstract int getPret();
    public abstract boolean esteSmart();
    
    public String toString(){
        return "Nume: " + this.numeProdus + " Culoare: " + this.culoare + " Softare: " + this.software + " Brand: " + this.brand;
    }
}