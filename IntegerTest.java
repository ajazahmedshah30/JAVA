//WAP to detect whether a number entered by the user is an integer or not. 
  
 import java.util.Scanner; 
 public class Nocheck { 
     public static void main(String[] args) { 
         System.out.println("Enter your number"); 
         Scanner sc = new Scanner(System.in); 
         System.out.println(sc.hasNextInt()); 
     } 
 }
