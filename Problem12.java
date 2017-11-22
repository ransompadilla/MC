import java.util.*;
public class Problem12{
   public static void main(String [] args){
      int cust_no = 0;
      char acc_type = '\u0000';
      double min_bal = 0.0;
      double curr_bal = 0.0;
      Scanner scan = new Scanner(System.in);
      System.out.print("CustNO: ");
         cust_no = scan.nextInt();
      System.out.print("ACC TYPE: ");
      
            acc_type = scan.next().charAt(0);
         System.out.print("MIN BAL: ");
            min_bal = scan.nextInt();
         System.out.print("CURRENT BAL: ");
           curr_bal = scan.nextInt();
           
           
           if(curr_bal < min_bal){
            if(acc_type == 's' || acc_type == 'S'){
               curr_bal = (curr_bal - 10.00);              
            }
            else if(acc_type == 'c' || acc_type == 'C'){
               curr_bal = (curr_bal - 25.00); 
            }
           }
           else{
           
            if(acc_type == 's' || acc_type == 'S'){
               curr_bal += (curr_bal * 0.04);   
            }
            else if(acc_type == 'c' || acc_type == 'C'){
              
            if(curr_bal <= 5000){
               curr_bal += (curr_bal * 0.03);
            }
            else{
               curr_bal += (curr_bal * 0.05);
            }
            }
           }
           
         System.out.println("--------------------------");
        System.out.print("CUSTNO: "+ cust_no+"\n");
        System.out.print("ACCTYPE: "+ acc_type+"\n");
        System.out.print("CURRENT BALANCE: "+ curr_bal+"\n");
   }
}