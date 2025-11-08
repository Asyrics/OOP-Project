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
    
    public static void vectorOchelari_VR(ArrayList<Gadgets> lista, String rezolutie, int fov)
    {
        for(Gadgets vr : lista)
        {
            if(vr instanceof Ochelari_VR)
            {
                Ochelari_VR vr1 = (Ochelari_VR) vr;
                if(vr1.getRezolutie().equalsIgnoreCase(rezolutie) && vr1.getFov() == fov)
                {
                    System.out.println(vr1);
                }
            }
        }
    }
    
    public static void vectorBoxe_Portabile(ArrayList<Gadgets> lista, String rezistenta, int max_greutate)
    {
        for(Gadgets bp : lista)
        {
            if(bp instanceof Boxe_Portabile)
            {
                Boxe_Portabile bp1 = (Boxe_Portabile) bp;
                if(bp1.getRezistenta().equalsIgnoreCase(rezistenta) && bp1.getGreutate() <= max_greutate)
                {
                    System.out.println(bp1);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        //vectori
        ArrayList<Gadgets> listaAlarme = new ArrayList<>();
        ArrayList<Gadgets> listaPrize = new ArrayList<>();
        ArrayList<Gadgets> listaBoxe_Portabile = new ArrayList<>();
        ArrayList<Gadgets> listaOchelari_VR = new ArrayList<>();
   
        for(int i = 0 ; i <10 ; i++)
        {
            Ochelari_VR vr1 = new Ochelari_VR("Quest 3", "Alb", "Meta",true,"1920x1080p",90,120,"Titanium","Uifi");
            listaOchelari_VR.add(vr1);
        }
    
    
        for(int i = 0 ; i <10 ; i++)
        {
            Boxe_Portabile bp1 = new Boxe_Portabile("Sony", "Negru","JBL",false,"la apa", 20,3,"310 mm latime","Acumulator");
            listaBoxe_Portabile.add(bp1);
        }
        
        vectorOchelari_VR(listaOchelari_VR,"1920x1080p",120);
        
        //Alarma
        // String nume,String cul,boolean soft,String Brand,String tipd,String tipa,String tipm,int greutate,String dim
        //Priza
        //String nume,String cul,boolean soft,String Brand,String tipd,String tipa,String tipm,int greutate,String dim
        for(int i = 0 ; i<10 ;i++){
            Alarma a = new Alarma("ART-ARC3800H-03-W2","Alb",false,"Dahua","PIR","Wireless","Perete",510,"74.8×174.8×38.3");
            listaAlarme.add(a);
        }
        for(int i = 0 ; i<10 ;i++){
            PrizaSmart p = new PrizaSmart("G20","Alb",true,"GAVIO",1,20,240,"Suprasarcina","European");
            listaPrize.add(p);
        }
        
        afisareVectorAlarme(listaAlarme,"PIR","Dahua");
        afisareVectorPrize(listaPrize,1,"GAVIO");
    }
    
}