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

    //metoda pt Boxe 
    public static void afisareVectorBoxe(ArrayList<Gadgets> lista, String functii, double greutate){
    for(Gadgets bx : lista){
        if(bx instanceof Boxe){
        Boxe b1= (Boxe) bx;
        
        if(b1.getFunctii().equalsIgnoreCase(functii) && b1.getGreutate() == greutate){
            System.out.println(b1);
        }
    }
    }    
    }
    
    //metoda pt Casti    
    public static void afisareaVectorCasti(ArrayList<Gadgets> lista, String tipCasti, int razaMax){
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
        //se creeaza listele
      ArrayList<Gadgets> listaBoxe= new ArrayList<>();
      ArrayList<Gadgets> listaCasti=new ArrayList<>();
      
      for(int a=0; a<10; a++){
          Boxe box=new Boxe("casti","roz", "ciocolata", 164, true,"skullcandy", 13.65, 4, "inghetata", 100);
          listaBoxe.add(box);
      }
      
       for(int a=0; a<10; a++){
          Casti cas=new Casti("casti","mov", "pistrui", 234, false,"cascuta", 45.21, 2, "iarna",79);
          listaCasti.add(cas);
      }
        
       afisareVectorBoxe(listaBoxe,"inghetata", 13.65 );
       
      System.out.println("\nLista Boxe");
    for (int i = 0; i < listaBoxe.size(); i++) {
        System.out.println(listaBoxe.get(i));
    }

    System.out.println("\nLista Casti");
    for (int i = 0; i < listaCasti.size(); i++) {
        System.out.println(listaCasti.get(i));
    }
}
       
    }
