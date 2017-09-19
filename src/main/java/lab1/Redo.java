package lab1;

import java.util.*;

public class Redo {
  
  
  public static void main(String[] args){
    
//    int n = 17;
    
//    for(int i=1; i<n; i++){
//      if(i%15 ==0){
//        System.out.println("FizzBuzz");
//      }
//      else if(i%5 ==0){
//        System.out.println("Buzz");
//      }
//      else if(i%3 ==0){
//        System.out.println("Fizz");
//      }
//      else{
//        System.out.println(Integer.toString(i));
//      }
//    }
  }
  public static Object[] fizzBuzz(int n){
    Object[] array = new Object[n];
    for(int i = 1; i <= array.length; i++){
      if(i%15 == 0){
        array[i-1] = "FizzBuzz";
      }
      else if(i%5 == 0){
        array[i-1] = "Buzz";
      }
      else if(i%3 ==0){
        array[i-1] = "Fizz";
      }
      else{
        array[i-1] = i;
      }
    }
    return array;
      }
    }