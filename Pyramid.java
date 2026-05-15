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

    //3: Numeric Inverted Half Pyramid Pattern.
    public static void numericInvertedHalfPyramid(int rowCount) {
        //Using 'if-else' statement to protect from false inputs.
        if(rowCount > 0) {
            //Outer loop.
            for(int i = rowCount; i >= 1; i--) {
                //Inner loop for printing the symbol, for the pattern visulization.
                for(int j = 1; j <= i; j++) {

                    System.out.print(i + " ");
                }

                System.out.println(); //Row blocks/pixels printing for inner loop operation.
            }

        } else {

            System.out.println(" Your Input (Row) do not match our condition. Please enter values greater than 0.");
        }


    }

    //4: Rotated Numeric Inverted Half Pyramid Pattern.

    public static void rotatedInvertedNumericHalfPyramid(int rowCount) {
        //Using 'if-else' statement to protect from false inputs.
        if(rowCount > 0) {
            //Outer loop.
            for(int i = rowCount; i >= 1; i--) {
                 //1st Inner loop to make spaces before the pattern for the pattern visulization as a rotated pattern.
                 for(int j = 1; j <= rowCount - i; j++) {

                    System.out.print("  ");
                 }

                //2nd Inner loop for printing the numbers, for the Numeric pattern visulization.
                for(int j = 1; j <= i; j++) {

                    System.out.print(i + " ");
                }

                System.out.println(); //Row blocks/pixels printing for inner loop operation.
            }

        } else {

            System.out.println(" Your Input (Row) do not match our condition. Please enter values greater than 0.");
        }


    }


    //5: Floyd's Triangle Pattern.

    public static void floydsTriangle(int rowCount) {
        //Using 'if-else' statement to protect from false inputs.
        if(rowCount > 0) {
            int number = 1; //It will be the number that will be printed in the pattern, and it will be increased by 1 for each print.

            //outer loop.
            for(int i = 1; i <= rowCount; i++) {
                //Inner loop.
                for(int j = 1; j <= i; j++) {
                    System.out.print(number + " "); //It will print the current number and make some space for better visibility.
                    number++; //It will increase the number by 1 for the next print.
                }
                System.out.println(); //Row blocks/pixels printing for inner loop operation.
            }
        } else {
            System.out.println("Your Input (Row) do not match our condition. Please enter values greater than 0.");
        }
    }




      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Let's Print a Full Pyramid Pattern.");
        // System.out.println("Let's Print a Numeric Inverted Half Pyramid Pattern.");
        // System.out.println("Let's Print a Rotated Numeric Inverted Half Pyramid Pattern.");
        System.out.println("Let's Print a Floyd's Triangle Pattern.");
        System.out.print("\n Enter The Row Number (Without Decimal): ");
        int rowCount = sc.nextInt();
        
        // sc.nextLine(); //Using it as a 'Buffer' for cleaning the 'Enter or Return' key (that is a String) to protect the 'symbol input' space.

        // System.out.print("\n Enter the symbol (e.g. @, #, *, A,a etc.) you want to show in you pattern: ");
        // String symbol = sc.nextLine();


        System.out.println(" Result:____________\n");

        floydsTriangle(rowCount);     

        sc.close(); //Closing the 'Scanner' object to prevent memory leaks.
          
      }
  }