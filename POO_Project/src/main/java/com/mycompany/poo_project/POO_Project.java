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
    
  
    
    public static void afisareOchelari_VR(ArrayList<Gadgets> lista, String rezolutie, int fov)
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
    
    public static void afisareBoxe_Portabile(ArrayList<Gadgets> lista, String rezistenta, int max_greutate)
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
        
        ArrayList<Gadgets> listaBoxe_Portabile = new ArrayList<>();
        ArrayList<Gadgets> listaOchelari_VR = new ArrayList<>();
   
        for(int i = 0 ; i <10 ; i++)
        {
            Ochelari_VR vr1 = new Ochelari_VR("Quest 3", "Alb", "Meta",1999,true,"1920x1080p",90,120,"Titanium","Uifi");
            listaOchelari_VR.add(vr1);
        }
    
    
        for(int i = 0 ; i <10 ; i++)
        {
            Boxe_Portabile bp1 = new Boxe_Portabile("Sony", "Negru","JBL",1999,false,"la apa", 20,3,"310 mm latime","Acumulator");
            listaBoxe_Portabile.add(bp1);
        }
        
        afisareOchelari_VR(listaOchelari_VR,"1920x1080p",120);
        
        
        
        
        
        
        
       
    }
    
}