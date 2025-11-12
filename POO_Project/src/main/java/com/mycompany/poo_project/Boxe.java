/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author anama
 */
public class Boxe extends Gadgets {
    private String tipAmplificare=null;
    private int rmsPutere=0;
    private double greutate=0.0;
    private int nrBoxe=0;
    private String functii=null;
    
    public Boxe(){
        tipAmplificare=null;
        rmsPutere=0;
        greutate=0;
        nrBoxe=0;
        functii=null;
    }
    
   
    public Boxe(String nume, String cul,String tip, int rms, boolean soft,String Brand, double greu, int boxe, String fctii){
        super.numeProdus = nume;
        super.culoare = cul;
        super.software = soft;
        super.brand = Brand;
        this.tipAmplificare=tip;
        this.rmsPutere=rms;
        this.greutate=greu;
        this.nrBoxe=boxe;
        this.functii=fctii;
    }
    
    public Boxe(Boxe a){
        super.numeProdus = a.numeProdus;
        super.culoare = a.culoare;
        super.software = a.software;
        super.brand = a.brand;
        this.tipAmplificare=a.tipAmplificare;
        this.rmsPutere=a.rmsPutere;
        this.greutate=a.greutate;
        this.nrBoxe=a.nrBoxe;
        this.functii=a.functii;
    }
    
    //setteri
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
    
    //getteri
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
        return 0;
    }
    
    @Override
    public boolean esteSmart(){
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+tipAmplificare+" "+rmsPutere+" "+greutate+" "+nrBoxe+" "+functii;
    }
}
