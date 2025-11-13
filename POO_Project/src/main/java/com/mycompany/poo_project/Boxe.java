/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author anama
 */
//clasa derivata Boxe
public class Boxe extends Gadgets {
    //campurile private
    private String tipAmplificare=null;
    private int rmsPutere=0;
    private double greutate=0.0;
    private int nrBoxe=0;
    private String functii=null;
    private int pret=0;
    
    //constructor fara argumente
    public Boxe(){
        tipAmplificare=null;
        rmsPutere=0;
        greutate=0;
        nrBoxe=0;
        functii=null;
        pret=0;
    }
    
   //constructor cu toate argumentele
    public Boxe(String nume, String cul,String tip, int rms, boolean soft,String Brand, double greu, int boxe, String fctii, int pr){
        super.numeProdus = nume;
        super.culoare = cul;
        super.software = soft;
        super.brand = Brand;
        this.tipAmplificare=tip;
        this.rmsPutere=rms;
        this.greutate=greu;
        this.nrBoxe=boxe;
        this.functii=fctii;
        this.pret=pr;
    }
    
    //constructor de copiere
    public Boxe(Boxe a){
        super(a);
        this.tipAmplificare=a.tipAmplificare;
        this.rmsPutere=a.rmsPutere;
        this.greutate=a.greutate;
        this.nrBoxe=a.nrBoxe;
        this.functii=a.functii;
        this.pret=a.pret;
    }
    
    //setteri (metode publice de setare)
    public void setTipAmplificare(String tipAmplificare){
        this.tipAmplificare=tipAmplificare;
    }
    
    public void setRmsPutere(int rmsPutere){
        this.rmsPutere=rmsPutere;
    }
    
    public void setGreutate( double greutate){
        this.greutate=greutate;
    }
    
    public void setNrBoxe(int nrBoxe){
        this.nrBoxe=nrBoxe;
    }
    
    public void setFunctii(String functii){
        this.functii=functii;
    }
    
    public void setPret(int pret){
        this.pret=pret;
    }
    
    //getteri (metode de obtinere a valorilor campurilor)
    public String getTipAmplificare(){
        return tipAmplificare;
    }
    
    public int getRmsPutere(){
        return rmsPutere;
    }
    
    public double getGreutate(){
        return greutate;
    }
    
    public int getNrBoxe(){
        return nrBoxe;
    }
    
    public String getFunctii(){
        return functii;
    }
    
   

     //override
    @Override
    public int getPret(){
        return this.pret;
    }
    
    @Override
    public boolean esteSmart(){
        return super.software;
    }
    
    //metoda de afisare a caracteristicilor claselor (toString)
    @Override
    public String toString(){
        return super.toString()+" "+tipAmplificare+" "+rmsPutere+" "+greutate+" "+nrBoxe+" "+functii+" "+pret;
    }
}
