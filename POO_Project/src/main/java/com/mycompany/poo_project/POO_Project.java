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

    public static void vectorBoxe(ArrayList<Gadgets> lista, String functii, double greutate){
    for(Gadgets bx : lista){
        if(bx instanceof Boxe){
        Boxe b1= (Boxe) bx;
        
        if(b1.getFunctii().equalsIgnoreCase(functii) && b1.getGreutate() == greutate){
            System.out.println(b1);
        }
    }
    }    
    }
    
        public static void vectorCasti(ArrayList<Gadgets> lista, String tipCasti, int razaMax){
    for(Gadgets cs : lista){
        if(cs instanceof Casti){
        Casti c1= (Casti) cs;
        
        if(c1.getTipCasti().equalsIgnoreCase(tipCasti) && c1.getRazaMax() == razaMax){
            System.out.println(c1);
        }
    }
    }    
    }
    
    public static void main(String[] args) {
      ArrayList<Gadgets> listaBoxe= new ArrayList<>();
      ArrayList<Gadgets> listaCasti=new ArrayList<>();
      
      for(int a=0; a<10; a++){
          Boxe box=new Boxe("casti","roz", "ciocolata", 164, true,"skullcandy", 13.65, 4, "inghetata");
          listaBoxe.add(box);
      }
      
       for(int a=0; a<10; a++){
          Casti cas=new Casti("casti","mov", "pistrui", 234, false,"cascuta", 45.21, 2, "iarna");
          listaCasti.add(cas);
      }
        
       vectorBoxe(listaBoxe,"inghetata", 13.65 );
       
    }
}
