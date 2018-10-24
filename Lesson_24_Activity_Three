//THIS CODE WILL NOT PASS ALL TESTS, WILL FAIL TEST #2

//Input an int between 0 and 100 and print the numbers between it and 100, 
//including the number itself and the number 100. If the number is not between 0 and 100 print "error". 
//Print 20 numbers per line.



import java.util.Scanner;

class Lesson_24_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a number between 0 and 100:");
    int[] array = new int[101];
    
    int userInput = scan.nextInt();
    int i = 0;
    int initialcondition = 1;
    
    if (userInput > 100 || userInput < 0){
      System.out.println("error");
    }
    else{
          
    	for (i = 0; i < 101; i++){  
          array[i] = userInput;
      		userInput++;

          System.out.print(array[i] + " ");
      
      		if (i % 20 == 0){
        		System.out.println("");
      }
    }

    }
    
  }
}
