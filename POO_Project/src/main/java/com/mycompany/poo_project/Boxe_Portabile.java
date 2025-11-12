
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

import java.util.Set;

/**
 *
 * @author fl3dh
 */
public class Boxe_Portabile extends Gadgets
{
    private String rezistenta = null;
    private int autonomie = 0;
    private double greutate = 0.0;
    private String dimensiuni = null;
    private String tip_alimentare = null;
    private int pret = 0;
    
    //constructor
    
    public Boxe_Portabile(){
        rezistenta = null;
        autonomie = 0;
        greutate = 0.0;
        dimensiuni = null;
        tip_alimentare = null;
        pret = 0;
    }
    
    //constructor cu parametrii
    public Boxe_Portabile(String nume, String culoare, String brand,int pret, boolean software,String rezistenta, 
            int autonomie, double greutate, String dimensiuni,String tip_alimentare)
    {
        super.numeProdus = nume;
        super.culoare = culoare;
        super.brand = brand;
        super.software = software;
        this.rezistenta = rezistenta;
        this.autonomie = autonomie;
        this.greutate = greutate;
        this.dimensiuni = dimensiuni;
        this.tip_alimentare= tip_alimentare;
        this.pret = pret;
    }
    
    //constructor de copiere
    public Boxe_Portabile(Boxe_Portabile a1)
    {
        super.numeProdus = a1.numeProdus;
        super.culoare = a1.culoare;
        super.brand = a1.brand;
        super.software = a1.software;
        this.rezistenta = a1.rezistenta;
        this.autonomie = a1.autonomie;
        this.greutate = a1.greutate;
        this.dimensiuni = a1.dimensiuni;
        this.tip_alimentare = a1.tip_alimentare;
        this.pret = a1.pret;
    }
    
    //setteri
    public void setRezistenta(String rezis)
    {
        this.rezistenta = rezis;
        
    }
    
    public void setAutonomie(int auto)
    {
        this.autonomie = auto;
    }
    
    public void setGreutate(double greu)
    {
        this.greutate = greu;
    }
    
    public void setDimensiuni(String dim)
    {
        this.dimensiuni = dim;
    }
    
    public void setTipAlimentare(String alimentare)
    {
        this.tip_alimentare = alimentare;
    }
    
    public void setPret(int pre)
    {
        this.pret = pre;
    }
    
    //getteri
    
    public String getRezistenta()
    {
        return this.rezistenta;
    }
    
    public int getAutonomie()   
    {
        return this.autonomie;
    }
    
    public double getGreutate()
    {
        return this.greutate;
    }
    
    public String getDimensiuni()
    {
        return this.dimensiuni;
    }
    
    public String getTipAlimentare()
    {
        return this.tip_alimentare;
    }
    
    //Overrides
   @Override
    public int getPret() 
    {
     return this.pret;
    }
    
    @Override 
    public boolean esteSmart() 
    {
     return super.software;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " "+  rezistenta + " " + autonomie + " " + greutate + " " + dimensiuni + " "+ tip_alimentare;
            
    }
    
    
    
    
}
