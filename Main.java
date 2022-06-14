//add imports
import java.text.DecimalFormat;
import java.util.Scanner;

/***************************************************************
 Filename: Change
 Created by: Melat
 Created on: 9/28/2021
 Comment: Prompt the price of item and money tendered from a user calculating the change due from the given input
 ***************************************************************/

class Main 
{
  public static void main(String[] args) 
  {
         Scanner keyboard = new Scanner(System.in); //setting up a scanner object to get information from the user
         DecimalFormat df = new DecimalFormat("##0.00"); // to get our output in this format of decimal place

         double amountDue, amountTendered, changeDue; // declaring our variables to hold the necessary data
         char a = '\u00A3'; // i use the unicode for pound sign because I dont have it on my keyboard


         System.out.println("How much does the item cost? £"); //prompt the amount of item from user
         amountDue = keyboard.nextDouble();  //read the input data through our keyboard

         System.out.println("How much has been tendered? £"); //prompt the amount of item from user
         amountTendered = keyboard.nextDouble(); //read the input data through our keyboard
         changeDue = amountTendered - amountDue; // calculating the change

         System.out.println("Amount Due:" + "£"+  df.format(amountDue));
         System.out.println("Amount Tendered:" + "£"+ df.format(amountTendered));
         System.out.println("Change Due:" + "£" + df.format(changeDue));
        
         keyboard.close();

  
  }//main
}//class