import java.util.Scanner;

  public class Pyramid {

//1: Full Pyramid.

    public static void printPattern(int rowCount, String symbol) {

        //Using Nested 'for-loop' for the pattern logic.

        if (rowCount > 0) { //Using 'if-else' to protect from negative values', which can instantly terminat the loop.
        //Outer loop.
        for(int i = 1; i <= rowCount; i++) {
            //1st inner loop.
            for(int j = 1; j <= rowCount - i; j++) {
                System.out.print(" "); // It will make some spaces to make it look like full. 

            }

            //2nd inner loop. 
            for(int j = 1; j <= i; j++) {
                System.out.print(symbol + " "); //It will make some spaces for better visibility and add that symbol to make a Pyramid. 

            }

            System.out.println(); //Make Spaces pixel by pixel as rows for inner symbol printing.
        }

    } else {

        System.out.println(" Your Input (Row) do not match our condition. Please enter values greater than 0.");
    }


    }

    //2: Numeric Half Pyramid.

    public static void numericHalfPyramid(int rowCount) {

        //Using Nested 'for-loop' for the pattern logic.

        if (rowCount > 0) { //Using 'if-else' to protect from negative values', which can instantly terminat the loop.
        //Outer loop.
        for(int i = 1; i <= rowCount; i++) {

            //Inner loop. 
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " "); //It will make some spaces for better visibility and add that symbol to make a Pyramid. 

            }

            System.out.println(); //Make Spaces pixel by pixel as rows for inner symbol printing.
        }

    } else {

        System.out.println(" Your Input (Row) do not match our condition. Please enter values greater than 0.");
    }


    }




      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Print a Numeric Half Pyramid Pattern.");
        System.out.print("\n Enter The Row Number (Without Decimal): ");
        int rowCount = sc.nextInt();
        

        System.out.println(" Result:____________\n");

        numericHalfPyramid(rowCount);
        

        sc.close(); //Closing the 'Scanner' object to prevent memory leaks.
          
      }
  }