/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

//clasa abstracta
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
    
    public Gadgets(Gadgets g){
        this.numeProdus = g.numeProdus;
        this.culoare = g.culoare;
        this.software = g.software;
        this.brand =g.brand;
    }
    
    public String getNumeProdus(){ 
        return this.numeProdus; 
    }
    public String getCuloare(){ 
        return this.culoare; 
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
    public void setSoftware(boolean smart){ 
        this.software = smart; 
    }

    public void setBrand(String brand)
    { 
        this.brand = brand; 
    }
    
    //metodele
    public abstract int getPret();
    public abstract boolean esteSmart();
    
    public String toString(){
        return "Nume: " + this.numeProdus + " Culoare: " + this.culoare + " Softare: " + this.software + " Brand: " + this.brand;
    }
}