/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author Pestily
 */
public class PrizaSmart extends Gadgets{
    private int numarPrize = 0;
    private String tipProtectie = null;
    private int amperaj = 0;
    private int tensiune_alim = 0;
    private String tipPriza = null;
    
    public PrizaSmart(){};
    
    public PrizaSmart(String nume,String cul,boolean soft,String Brand,int numarp,int amp,int tensiune,String tipProt,String tipPriza){
        super.numeProdus = nume;
        super.culoare = cul;
        super.software = soft;
        super.brand = Brand;
        this.numarPrize = numarp;
        this.tipProtectie = tipProt;
        this.amperaj = amp;
        this.tensiune_alim = tensiune;
        this.tipPriza = tipPriza;
    };
    
    public PrizaSmart(PrizaSmart a1){
        super.numeProdus = a1.numeProdus;
        super.culoare = a1.culoare;
        super.brand = a1.brand;
        super.software = a1.software;
        this.numarPrize = a1.numarPrize;
        this.tipProtectie = a1.tipProtectie;
        this.amperaj = a1.amperaj;
        this.tensiune_alim = a1.tensiune_alim;
        this.tipPriza = a1.tipPriza;
    }
    
    //Setteri
    
    public void setNrPrize(int nrP){
        this.numarPrize = nrP;
    }
    public void setTipProt(String tipP){
        this.tipProtectie = tipP;
    }
    public void setAmperaj(int amp){
        this.amperaj = amp;
    }
    public void setTensiune(int tens){
        this.tensiune_alim = tens;
    }
    public void setTipPriza(String tipPriza){
        this.tipPriza = tipPriza;
    }
    
    //Getteri
    
    public int getNrPrize(){
        return this.numarPrize;
    }
    public String getTipProt(){
        return this.tipProtectie;
    }
    public int getAmperaj(){
        return this.amperaj;
    }
    public int getTensiune(){
        return this.tensiune_alim;
    }
    public String getTipPriza(){
        return this.tipPriza;
    }
    
    //toString
    
    public String toString(){
        return "Priza Smart: " + super.numeProdus + " Numar Prize: " + this.numarPrize + " Protectie: " + this.tipProtectie + " Amperaj: " + this.amperaj + " Tensiune alimentare: " + this.tensiune_alim + " Tip Priza: " + this.tipPriza;
                
    }
    
    //Suprascrierea metodelor din clasa abstracta
    
    @Override
    public int getPret(){
        return 0;
    }    
    
    @Override
    public boolean esteSmart(){
        return false;
    }
}
