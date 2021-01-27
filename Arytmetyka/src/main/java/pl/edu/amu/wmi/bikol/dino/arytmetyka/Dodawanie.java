/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

import java.text.DecimalFormat;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    
    public String convertToStringNumber(String a){
        if(a == "one"){
            return "1";
        }else{
            return a;
        }
    }

    public String dodaj(String a, String b){
        a = convertToStringNumber(a);
        b = convertToStringNumber(b);
        if (a.contains(".") && b.contains(".")) {
            DecimalFormat df = new DecimalFormat("#.##"); 
            
            return Double.toString(Double.valueOf(df.format(Double.parseDouble(a) + Double.parseDouble(b))));
        }
        
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            
            
            if( Integer.parseInt(a) >= 100 && Integer.parseInt(a) <=999 && Integer.parseInt(b) >= 100 && Integer.parseInt(b) <= 999){
                double n1 = Integer.parseInt(a);
                double n2 = Integer.parseInt(b);
                n1 = n1 / 10;
                n2 = n2 / 10;
                return Double.toString(n1+n2);
            }
            
            
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }
        catch( Exception e ) {
            return a+b;
        }
    }
    
    public int checkEven(int a, int b){
        
        if((a+b)%2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}