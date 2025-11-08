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
    private String Tehnologie = null;
    private String Dimensiuni = null;
    
    public Alarma(){};
    
    public Alarma(String tipd,String tipa,String tipm,String teh,String dim){
        this.tipConexiune = tipa;
        this.tipDetector = tipd;
        this.tipMontaj = tipm;
        this.Tehnologie = teh;
        this.Dimensiuni = dim;
    };
    
    public Alarma(Alarma a1){
        this.tipConexiune = a1.tipConexiune;
        this.tipDetector = a1.tipDetector;
        this.tipMontaj = a1.tipMontaj;
        this.Tehnologie = a1.Tehnologie;
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
    public void setTeh(String teh){
        this.Tehnologie = teh;
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
    public String getTeh(){
        return this.Tehnologie;
    }
    public String getDim(){
        return this.Dimensiuni;
    }
    
    //toString
    
    public String toString(){
        return "Alarma: " + super.numeProdus + " Detector: " + this.tipDetector + " Conexiune: " + this.tipConexiune + " Montaj: " + this.tipMontaj + " Tehnologie: " + this.Tehnologie + " Dim: " + this.Dimensiuni;
                
    }
    
    //Suprascrierea metodelor din clasa abstracta
    
    @Override
    public int getAutonomie(){
        return 0;
    }    
    
    @Override
    public String getBrand(){
        return null;
    }
}
