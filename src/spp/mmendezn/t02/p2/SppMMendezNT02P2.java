/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miguel Mendez Nevarez
//A01411490
//IMT
package spp.mmendezn.t02.p2;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SppMMendezNT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int valinf, valsup;
         
        double res;
        
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce el valor inferior");
        valinf= kb.nextInt();
        System.out.println("Introduce el valor superior");
        valsup= kb.nextInt();
    do{
            valinf ++;
            res=valinf % 3;
            if (res>0 || res<0){
                System.out.println(valinf+" no es divisible entre 3");
            }
            else{
                System.out.println(valinf+" si es divisible entre 3");
            }
            res=valinf % 5;
            if(res>0 || res<0){
                System.out.println(valinf+" no es divisible entre 5");
            }
            else{
                System.out.println(valinf+" si es divisible entre 5");
            }
            
        }
while(valinf< valsup);
    
    
        System.out.println("introduce el numero que necesites saber si es par");
        valinf = kb.nextInt();
        if(valinf%2==0){
             System.out.println(valinf+" es par");
        }else{
            System.out.println(valinf+" es impar");
          
    }
        
  }
}
