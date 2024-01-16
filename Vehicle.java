
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
public abstract class Vehicle  {
    
   
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    Scanner input = new Scanner(System.in); 
    int price ; 
    int washPrice[] = {15,20,30};
    int steamPrice = 15 , rinsePrice = 10,  vaccumPrice = 10, waxPrice = 5, scrubPrice = 20 ; 
    public int totalPrice = 0 ;
    
     
    void wash() {
        System.out.println("Washing... ");
        System.out.println("\n1:basic washing"
                    + "\n2:advanced washing"
                    + "\n3:premium washing");
        System.out.print("Select An Option: ");
        wash(input.nextInt());
        
    }
    
    
    // OVERLOADING for wash method 
    void wash(int select){
       
       
        
        while ( select > 3 || select <1 ){
            System.out.println("Please Select A Valid Option: ");  
            
            select = input.nextInt();
        }
        
        switch (select){
            case 1 :
                System.out.println("You have used basic washing"); 
                totalPrice = totalPrice + washPrice[0];
                break; 
           case 2 :
                System.out.println("You have used advaced washing"); 
                totalPrice = totalPrice + washPrice[1];
                break; 
           case 3 :
                System.out.println("You have used premium washing"); 
                totalPrice = totalPrice + washPrice[2];
                break; 
        }
            
    }
    
    void paint (){
        char choice ; 
        
        
        System.out.println("Chose the color that you would like to print :");
        System.out.println("RED: R/r"
                + "\nBlue: B/b"
                + "\nCyan: C/c"
                + "\nWhite: W/w"
                + "\nYellow: Y:y"
                + "\nGreen: G/g"
                + "\nPurple: P/p"); 
        choice = input.next().charAt(0); 
        choice =    Character.toLowerCase(choice);
        
        while (choice != 'r' && choice != 'b' && choice != 'c'&&
               choice != 'w' && choice != 'y' && choice != 'g'&&
                choice != 'p') {
            System.out.println("Chose an available color N/n to exit"); 
            System.out.println(choice); 
            
        choice = input.next().charAt(0); 
        choice =    Character.toLowerCase(choice);
        }
        
        switch (choice){
            case 'r':System.out.println(RED+"HERE IS YOUR VEHICLE ");break;
            case 'b':System.out.println(BLUE+"HERE IS YOUR VEHICLE");break;
            case 'c':System.out.println(CYAN+"HERE IS YOUR VEHICLE");break;
            case 'w':System.out.println(WHITE+"HERE IS YOUR VEHICLE");break;
            case 'y':System.out.println(YELLOW+"HERE IS YOUR VEHICLE");break;
            case 'g':System.out.println(GREEN+"HERE IS YOUR VEHICLE");break;
            case 'p':System.out.println(PURPLE+"HERE IS YOUR VEHICLE");break;  
        }
        totalPrice += 50; 
  
    }
    
    
    // Overloading the paint method 
    // use this method with JAVA FX becasue the first can not be chosen in java.
    void paint (char choice){
        switch (choice){
            case 'r':System.out.println(RED+"HERE IS YOUR VEHICLE");break;
            case 'b':System.out.println(BLUE+"HERE IS YOUR VEHICLE");break;
            case 'c':System.out.println(CYAN+"HERE IS YOUR VEHICLE");break;
            case 'w':System.out.println(WHITE+"HERE IS YOUR VEHICLE");break;
            case 'y':System.out.println(YELLOW+"HERE IS YOUR VEHICLE");break;
            case 'g':System.out.println(GREEN+"HERE IS YOUR VEHICLE");break;
            case 'p':System.out.println(PURPLE+"HERE IS YOUR VEHICLE");break;  
        }
        totalPrice += 50; 
    }
    
   
    abstract void vaccum(); 
    abstract void scrub (); 
    abstract void steam (); 
    abstract void wax (); 
    abstract void rinse (); 
    abstract int getTotal(); 
    
}

