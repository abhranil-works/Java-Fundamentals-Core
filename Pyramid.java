import java.util.Scanner;

  public class Pyramid {
//Full Pyramid.

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

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Print a Full Pyramid Pattern.");
        System.out.print("\n Enter The Row Number (Without Decimal): ");
        int rowCount = sc.nextInt();
        

        sc.nextLine(); //Using it as a 'Buffer' for cleaning the 'Enter or Return' key (that is a String) to protect the 'symbol input' box.

        System.out.print("\n Enter the symbol (e.g. @, #, *, A,a etc.) you want to show in you pattern: ");
        String symbol = sc.nextLine();

        System.out.println(" Result:____________\n");

        printPattern(rowCount, symbol);
        

        sc.close(); //Closing the 'Scanner' object to prevent memory leaks.
          
      }
  }