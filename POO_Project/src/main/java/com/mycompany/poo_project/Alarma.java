/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author Pestily
 */
public class Alarma extends Gadgets{
    
    private String tipDetector = null;
    private String tipConexiune = null;
    private String tipMontaj = null;
    private int greutate = 0;
    private String Dimensiuni = null;
    
    public Alarma(){};
    
    public Alarma(String nume,String cul,boolean soft,String Brand,String tipd,String tipa,String tipm,int greutate,String dim){
        super.numeProdus = nume;
        super.culoare = cul;
        super.software = soft;
        super.brand = Brand;
        this.tipConexiune = tipa;
        this.tipDetector = tipd;
        this.tipMontaj = tipm;
        this.greutate = greutate;
        this.Dimensiuni = dim;
    };
    
    public Alarma(Alarma a1){
        super.numeProdus = a1.numeProdus;
        super.culoare = a1.culoare;
        super.brand = a1.brand;
        super.software = a1.software;
        this.tipConexiune = a1.tipConexiune;
        this.tipDetector = a1.tipDetector;
        this.tipMontaj = a1.tipMontaj;
        this.greutate = a1.greutate;
        this.Dimensiuni = a1.Dimensiuni;
    }
    
    //Setteri
    
    public void setTipDet(String tipD){
        this.tipDetector = tipD;
    }
    public void setTipConex(String tipA){
        this.tipConexiune = tipA;
    }
    public void setTipMontaj(String tipM){
        this.tipMontaj = tipM;
    }
    public void setGreutate(int greutate){
        this.greutate = greutate;
    }
    public void setDim(String dim){
        this.Dimensiuni = dim;
    }
    
    //Getteri
    
    public String getTipDet(){
        return this.tipDetector;
    }
    public String getTipConex(){
        return this.tipConexiune;
    }
    public String getTipMontaj(){
        return this.tipMontaj;
    }
    public int getGreutate(){
        return this.greutate;
    }
    public String getDim(){
        return this.Dimensiuni;
    }
    
    //toString
    
    public String toString(){
        return "Alarma: " + super.numeProdus + " Detector: " + this.tipDetector + " Conexiune: " + this.tipConexiune + " Montaj: " + this.tipMontaj + " Greutate: " + this.greutate + " Dim: " + this.Dimensiuni;
                
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
