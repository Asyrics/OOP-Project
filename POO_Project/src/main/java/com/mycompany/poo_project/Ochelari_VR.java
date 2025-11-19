/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_project;

/**
 *
 * @author fl3dh
 */
public class Ochelari_VR extends Gadgets 
{
    // proprietati >:)
    private String rezolutie = null;
    private int rata_refresh = 0;
    private int fov = 0;
    private String material = null;
    private String tip_conexiune = null;
    private int pret = 0;
    
    //constructor
    
    public Ochelari_VR(){
        rezolutie = null;
        rata_refresh = 0;
        fov = 0;
        material = null;
        tip_conexiune = null;
        pret = 0;
    }
    
    //constructor cu parametrii
    public Ochelari_VR(String nume, String culoare, String brand,int pret, boolean software,String rezolutie, 
            int rata_refresh, int fov, String material,String tip_conexiune)
    {
        super.numeProdus = nume;
        super.culoare = culoare;
        super.brand = brand;
        super.software = software;
        this.rezolutie = rezolutie;
        this.rata_refresh = rata_refresh;
        this.fov = fov;
        this.material = material;
        this.tip_conexiune = tip_conexiune;
        this.pret = pret;
    }
    
    //constructor de copiere
    public Ochelari_VR(Ochelari_VR a1)
    {
        super(a1);
        this.rezolutie = a1.rezolutie;
        this.rata_refresh = a1.rata_refresh;
        this.fov = a1.fov;
        this.material = a1.material;
        this.tip_conexiune = a1.tip_conexiune;
        this.pret = a1.pret;
    }
    
    //setteri
    public void setRezolutie(String rez)
    {
        this.rezolutie = rez;
        
    }
    
    public void setRataRefresh(int refresh)
    {
        this.rata_refresh = refresh;
    }
    
    public void setFov(int fov1)
    {
        this.fov = fov1;
    }
    
    public void setMaterial(String material1)
    {
        this.material = material1;
    }
    
    public void setTipConexiune(String conexiune)
    {
        this.tip_conexiune = conexiune;
    }
    
    public void setPret(int pre)
    {
        this.pret = pre;
    }
    
    //getteri
    
    public String getRezolutie()
    {
        return this.rezolutie;
    }
    
    public int getRataRefresh()
    {
        return this.rata_refresh;
    }
    
    public int getFov()
    {
        return this.fov;
    }
    
    public String getMaterial()
    {
        return this.material;
    }
    
    public String getTipConexiune()
    {
        return this.tip_conexiune;
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
        return super.toString()+ " "+ rezolutie + " " + rata_refresh + " " + fov + " " + material + " "+ tip_conexiune;
            
    }
    
}
    
    
    
    
    
    

