/*
     Lemonade Change

     Given an integer array bills where bills[i] is the bill the ith customer pays,
      return true if you can provide every customer with the correct change, or false otherwise.


        Input: bills = [5,5,5,10,20]
        Output: true
        Explanation: 
        From the first 3 customers, we collect three $5 bills in order.
        From the fourth customer, we collect a $10 bill and give back a $5.
        From the fifth customer, we give a $10 bill and a $5 bill.
        Since all customers got correct change, we output true.

 */
package DSA;

public class Leet860 {
    public static void main(String[] args) {
        int bills[] = { 5, 5, 5, 10, 20 };
        int stock = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                stock++;
            } else if (bills[i] == 10) {
                if (stock) {

                }
            }
        }
    }
}
