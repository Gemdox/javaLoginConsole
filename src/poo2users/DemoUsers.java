/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2users;

import java.util.ArrayList;
import poo1.Persona;

/**
 *
 * @author alumne
 */
public class DemoUsers {
    
    public static void main(String[] args) {
        
        ArrayList<User> profes = new ArrayList<User>();
        User pr1 = new User("pga","123456","ADMIN", 23, 1200);
        profes.add(pr1);
        profes.add(new User("mba","123456","ADMIN",40, 2000));
        profes.add(new User("rse","123456","ADMIN", 32, 1600));
        profes.add(new User("vra","123456","ADMIN", 34, 1600));
        User pr5 = new User("mam","123456","ADMIN", 54, 2100);
        profes.add(pr5);
        profesList(profes);
        System.out.println("Existe el usuario pga ? ");
        boolean existPr1 = profes.contains(pr1);
        System.out.println(existPr1?"SÍ":"NO");
        User prnew = new User("new","123456","USER");
        System.out.println("Existe el usuario new ? ");
        boolean existprnew = profes.contains(prnew);
        System.out.println(existprnew?"SÍ":"NO");
    }

    private static void profesList(ArrayList<User> profes) {
        for (User prof : profes) {
            System.out.println(prof);
        }
    }
    
    
    
}
