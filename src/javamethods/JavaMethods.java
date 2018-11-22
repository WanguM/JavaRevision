/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STUDENTS
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            /* there are 3 types of methods
            void methods - these methods dont return anything
            return type method - for a return type method, it returns the value of the given datatype
            parse type method - passing or retrieving data (this is an open method so it can be void or a return type)
            */
            Thread.sleep(3000);
        } catch (Exception ex) {
        }
        
        first();
        System.out.println(second());
        System.out.println((sum(3.4,4.5)));
        System.out.println(checkHealth(40.0,1.2,"Wangu"));
        System.out.println(Conditions());
        System.out.println(factorial(5));
    }
    
   public static void first() {
       System.out.println("YAY!");
   }
   
   public static String second() {
        return "Wangu";
       
   }
   
   public static double sum(double x, double y) {
      double sum = x + y;
      return sum;
      
   }
   
   public static String checkHealth(double weight, double height, String name) {
       // weight/(height*height) below 18 = underweight, between 18-24.9 = normal, above 25 = overweight, return a string statement 
       double BMI = weight/(height*height);
       String health = ""; 
       String statement = "My Name is "+name+ " with a BMI of "+BMI+" and I am  ";
  
       if (BMI >=18 && BMI <= 24.9) {
           health = "normal";
       }
        if (BMI <18) {
          health = "underweight";
       }
         if (BMI > 25) {
          health = "Overweight";
       }
        return statement+health;
   }
   
   public static String Conditions() {
       String Name = "Wangu";
       
       if (Name.matches("Table")) 
           return "Table Matches name";
       
       else if (Name.matches("Chair"))
           return "Chair matches name";
       
       else if (Name.matches(Name))
           return "Name matches name";
       
        return "Nothing was found";
   
   }
  
  public static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
}
