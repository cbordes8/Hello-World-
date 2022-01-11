//Christopher Bordes

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.PrintStream;

public class Calculator {

  public static void menu() {
   
  System.out.printf("1: Add \n");
  System.out.printf("2: Subtract \n");
  System.out.printf("3: Divide \n");
  System.out.printf("4: Multiply \n");
  System.out.printf("5: Average \n");
  System.out.printf("6: Max \n");
  System.out.printf("7: Square \n");
  System.out.printf("8: Quit \n");
 
 
  }
 
  public static double add(int x, int y){
    int add;
     
    add = (x + y); // takes the value of x and y and adds.
   
    return add;
  }
 
  public static int sub(int x, int y){
    int sub;
     
    sub = (x - y); // takes the value of x and y and subtracts.
   
    return sub;
  }
 
  public static int div(int x, int y){
    int div;
     
    div = (x / y); // takes the value of x and y and divides them.
   
    return div;
  }
 
   public static int multi(int x, int y){
    int multi;
     
    multi = (x * y); // takes the value of x and y and multiplies them.
   
    return multi;
  }
 
  public static int avg(int x, int y){
    int avg;
     
    avg = ((x + y)/2); // takes the value of x and y adds them together then divides by 2.
   
    return avg;
  }
 
  public static void max(int x, int y) {
 
    if(x > y){
      System.out.printf("The max is: %d ", x); // takes the value of x and y and compares which one is greater than the other.
    }
    else{
      System.out.printf("The max is: %d ", y);
    }
   
  }
 
  public static int square(int x) {
 int square;
 
 square =  (x * x);  
 
 return square;
  }

  public static void main(String[] args) throws Exception {
   
    Scanner sc = new Scanner(System.in);
    PrintStream ps = new PrintStream("Calculator.txt");
   
    int x, y;
   
    menu();
   
    for(int i = 0; i <= 5; i++) {
   
    System.out.printf("Enter the number of the operation you would like to calculate: \n");
   
    int response = sc.nextInt();
     
    if(response == 1){
     
      ps.printf("Enter two numbers to add: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.println(add(x,y));
     
    }
   
    else if(response == 2){
     
      ps.printf("Enter two numbers to subtract: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.println(sub(x,y));
     
    }
   
    else if(response == 3){
     
      ps.printf("Enter two numbers to divide: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.println(div(x,y));
    }
   
    else if(response == 4){
     
      ps.printf("Enter two numbers to multiply: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.println(multi(x,y));
     
    }
   
    else if(response == 5){
     
      ps.printf("Enter two numbers for average: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.printf("The average of the numbers are: " + String.format("%.2f", avg(x,y)) + " \n");
    }
   
    /*else if(response == 6){
     
      ps.printf("Enter two numbers for max: \n");
     
      ps.println(String.format("%.2f",x = sc.nextDouble()));
      ps.println(String.format("%.2f",y = sc.nextDouble()));
     
      ps.println(String.format("%.2f",max(x, y));
    }
    */
   
    else if(response == 6){
       
      ps.printf("Enter two numbers for max: \n");
     
      ps.println(x = sc.nextInt());
      ps.println(y = sc.nextInt());
     
      ps.printf("The maximum number is: " +  Math.max(x,y) + "\n");
     
    }
   
    else if(response == 7){
       
        ps.printf("Enter a number for Square: \n");
       
        ps.println( x = sc.nextInt());
       
        ps.printf("The square number is: " + square(x) + "\n");
       
      }
   
    else if (response == 8) {
    break;
    }
   
  }
   
  ps.close();
  sc.close();
   
 }
}
