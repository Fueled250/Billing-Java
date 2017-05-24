/*S.McDonald 10/26/2016
Billing.java
Billing class uses method overloading three times.
Computes the total cost of photobooks.
*/

public class Billing
{
   //define a constant for TAX of 8%
   final static double TAX = 0.08;
   
   public static void main(String[] args)
   {
      double bill;
      double cost = 24.99; //cost of one book
      
      bill = computeBill(cost);
      System.out.println("the total cost for one book is: " + bill);
      
      bill = computeBill(cost, 10); //order 10 books
      System.out.println("the total cost for ten books is: " + bill);
      
      bill = computeBill(cost, 10, 30); //order 10 books, get $7.5 off the order
      System.out.println("the total cost for 10 books using the coupon is: " + bill);
   
   }//main method
   
   public static double computeBill(double amt)
   {
      double bill = computeTotalWithTax(amt); //call the method to compute total price with tax
      return bill;   
   
   }//computeBill method
   
   public static double computeBill(double amt, int quanity)
   {
      double bill = amt * quanity; //price for a number of books pre-tax
      bill = computeTotalWithTax(bill); //total price including tax
      return bill;   
   
   }//computeBill method -- 2 parameters
   
   public static double computeBill(double amt, int quanity, double coupon)
   {
      double bill = amt * quanity; //price for a number of books pre-tax
      bill = bill - coupon; //subtract the coupon value pre-tax
      bill = computeTotalWithTax(bill); //totla price including tax
      return bill;
   
   }//computeBill method -- 3 parameters
   
   public static double computeTotalWithTax(double amt)
   {
      double total = amt + amt * TAX;
      return total;
   
   }//computeTotalWithTax method


}//class