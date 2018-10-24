import java.util.Scanner;

public class Lesson_24_Activity_One {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

		int [] array = new int[67];
        int i = 0;
        int number = 23;
      
        for (i = 0; i <= 66; i++){
            if (i >= 0 && i < 10){
              array[i] = i + 23;  
              System.out.print(array[i] + " ");
            }
            if (i >= 10 && i < 20){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;    
              System.out.print(array[i] + " ");
            }
            if (i >= 20 && i < 30){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;
                System.out.print(array[i] + " ");
            }
            if (i >= 30 && i < 40){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;
                System.out.print(array[i] + " ");
            }
            if (i >= 40 && i < 50){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;
                System.out.print(array[i] + " ");
            }
            if (i >= 50 && i < 60){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;
                System.out.print(array[i] + " ");
            }
          	if (i >= 60 && i < 70){
              if (i % 10 == 0){
                System.out.println("\n" + array[i] + " ");
              }
              array[i] = i + 23;
              System.out.print(array[i] + " ");
            }
        }
    }
}
