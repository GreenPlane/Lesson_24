//Use a for loop to print the even numbers between 1 and 50, including the first even number, 
//and the number 50. Print each number on a new line.

import java.util.Scanner;

class Lesson_24_Activity_Two {
  public static void main(String[] args) {
    
    int [] array = new int[28];
    int i = 0, n = 2;
    
    for (i = 2; i < 27; i++){
      array[i] = n;
      System.out.println(array[i]);
      n+=2;
    }
  }
}
