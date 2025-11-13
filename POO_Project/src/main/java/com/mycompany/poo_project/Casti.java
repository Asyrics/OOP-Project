/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author anama
 */
//clasa derivata Casti
public class Casti extends Gadgets {
    //campurile private
    private String tipCasti=null;
    private double timpIncarcare=0.0;
    private String functii=null;
    private int razaMax=0;
    private int diametruDifuzor=0;
    private int pret=0;
    
    //constructor fara argumente
    public Casti(){
        tipCasti=null;
        timpIncarcare=0.0;
        functii=null;
        razaMax=0;
        diametruDifuzor=0;
        pret=0;
    }
    
    //constructor cu toate argumentele
    public Casti(String nume, String cul,String tip, int raza, boolean soft,String Brand, double timp, int diametru, String fctii, int pr){
        super.numeProdus = nume;
        super.culoare = cul;
        super.software = soft;
        super.brand = Brand;
        this.timpIncarcare=timp;
        this.functii=fctii;
        this.razaMax=raza;
        this.tipCasti=tip;
        this.diametruDifuzor=diametru;
        this.pret=pr;
    }
    
   //constructor de copiere
    public Casti(Casti a){
        super(a);
        this.timpIncarcare=a.timpIncarcare;
        this.functii=a.functii;
        this.razaMax=a.razaMax;
        this.tipCasti=a.tipCasti;
        this.diametruDifuzor=a.diametruDifuzor;
        this.pret=a.pret;
    }
    
    //setteri (metode publice de setare)
    public void setTimpIncarcare(double timpIncarcare){
        this.timpIncarcare=timpIncarcare;
    }
    
    public void setFunctii(String functii){
        this.functii=functii;
    }
    
    public void setRazaMax( int razaMax){
        this.razaMax=razaMax;
    }
    
    public void setTipCasti(String tipCasti){
        this.tipCasti=tipCasti;
    }
    
    public void setDiametruDifuzor(int diametruDifuzor){
        this.diametruDifuzor=diametruDifuzor;
    }
    
    public void setPret(int pret){
        this.pret=pret;
    }
    
    //getteri (metode de obtinere a valorilor campurilor)
    public double getTimpIncarcare(){
        return timpIncarcare;
    }
    
    public String getFunctii(){
        return functii;
    }
    
    public int getRazaMax(){
        return razaMax;
    }
    
    public String getTipCasti(){
        return tipCasti;
    }
    
    public int getDiametruDifuzor(){
        return diametruDifuzor;
    }
    
     //override
    @Override
    public int getPret(){
        return 0;
    }
    
    @Override
    public boolean esteSmart(){
        return false;
    }
    
    //metoda de afisare a caracteristicilor claselor (toString)
    @Override
    public String toString(){
        return super.toString()+" "+timpIncarcare+" "+functii+" "+razaMax+" "+tipCasti+" "+diametruDifuzor+" "+pret;
    }
}
