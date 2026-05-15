import java.util.Scanner;

  public class Finance {
     
     
     public static int checkProfit(int income, int expense) {
                int profit = 0; //We write it for protecting the error from 'return' statement.

           if(income > expense) {
             profit = income - expense; 
               

                    System.out.println("Congratulations! You Made a Net Profit of This Year : " +  profit);
              
           }

           else if(income < expense) {
               int loss = expense - income;
               System.out.println("Unfortunately, you have incurred a loss of : " + loss);
          
            } else {
                    System.out.println("Upps, Your income and expense are equal. No profit, no loss.");
               }



         return profit;  //Transfer to 'main' function's grossProfit variable.            

     }
    



     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Let's Check The Annual Profit & Loss for Your Business : ");
     System.out.println("\nInstruction: You can find here about your Business's Annual Profit & Loss (Only).");

     System.out.print("Please enter the total value of this year Income of your Business : ");
     int income = sc.nextInt();

     System.out.print("\nPlease enter the total value of this year expense cost of your Business : ");
     int expense = sc.nextInt();

     System.out.println("\nHere is Your Result: ");
     System.out.println("-------------------------------------------");
     System.out.println("                 RESULT                    ");
     System.out.println("-------------------------------------------");
     
     int netProfit = checkProfit(income, expense); //Transferred from 'checkProfit' function.
     int taxAmount = (netProfit * 18) / 100; //This Logic will be show the only 'Tax Amount' for the total Net Profit. 

     if(netProfit > 0) {
        int finalProfit = netProfit - taxAmount;

        System.out.println("Total Amount of Tax : " + taxAmount);
        System.out.println("Now, Your Total Profit of This Year After Deduction of Taxes: " + finalProfit);
     } 

     sc.close(); //Closing the 'Scanner' object to prevent memory leaks.

     }

  }