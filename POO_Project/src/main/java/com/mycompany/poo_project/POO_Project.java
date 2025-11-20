/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_project;
import java.util.ArrayList;

/**
 *
 * @author Pestily
 */
    
public class POO_Project {
    //functii statice pt a putea fi folosit in clasa
    public static void afisareVectorAlarme(ArrayList<Gadgets> lista, String tipd, String Brand) {
            System.out.println("Alarme ce au detectia " + tipd + " si sunt de la brandul " + Brand);
            for(Gadgets a : lista){
                if(a instanceof Alarma){
                    Alarma a1 = (Alarma) a;
                    if(a1.getTipDet().equalsIgnoreCase(tipd) && a1.getBrand().equalsIgnoreCase(Brand)){
                        System.out.println(a1);
                    }
                }
            }
    }
    public static void afisareVectorPrize(ArrayList<Gadgets> lista, int nrprize, String Brand) {
            System.out.println("Prize ce au numarul de prize " + nrprize + " si de la brandul: " + Brand);
            for(Gadgets p : lista){
                if(p instanceof PrizaSmart){
                    PrizaSmart p1 = (PrizaSmart) p;
                    if(p1.getNrPrize() == nrprize && p1.getBrand().equalsIgnoreCase(Brand)){
                        System.out.println(p1);
                    }
                }
            }
    }
    
    public static void afisareVector(ArrayList<Gadgets> lista){
        for(Gadgets p : lista){
            System.out.println(p);
        }
    }
    

    public static void main(String[] args) {
            
        //vectori
        ArrayList<Gadgets> listaAlarme = new ArrayList<>();
        ArrayList<Gadgets> listaPrize = new ArrayList<>();
        
        //Alarma
        // String nume,String cul,boolean soft,String Brand,String tipd,String tipa,String tipm,int greutate,String dim
        //Priza
        //String nume,String cul,boolean soft,String Brand,String tipd,String tipa,String tipm,int greutate,String dim
        for(int i = 0 ; i<10 ;i++){
            Alarma a = new Alarma("ART-ARC3800H-03-W2","Alb",false,"Dahua","PIR","Wireless","Perete",510,"74.8x174.8x38.3");
            listaAlarme.add(a);
        }
        for(int i = 0 ; i<10 ;i++){
            PrizaSmart p = new PrizaSmart("G20","Alb",true,"GAVIO",1,20,240,"Suprasarcina","European");
            listaPrize.add(p);
        }
        afisareVectorAlarme(listaAlarme,"PIR","Dahua");
        afisareVectorPrize(listaPrize,1,"GAVIO");
        System.out.println("Vector fara filtre");
        afisareVector(listaAlarme);
    }
    
}