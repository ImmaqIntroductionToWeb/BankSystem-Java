package com.mycompany.banksystem;

import java.util.Scanner;

public class BankSystem {
    
 static String accountHolder = "Khloe Khumalo",Username,MySavings;
    static String accountNumber = "5767984765";
    static int Balance = 5000;
    static int Options = 1+2+3+4,Pin, newAccountNumber,Amount;
    static double newBalance = 0.00,code;
    
    public static void Menu(){
        Scanner a = new Scanner (System.in);
        System.out.println("WELOME TO LIBERTY BANK");
        System.out.println("Enter 1 to Login");
        System.out.println("Enter 2 to Register Account ");
        Options = a.nextInt();
       if (Options == 1){
            System.out.println("Enter Remote Pin");
            Pin = a.nextInt();
            System.out.println("ACOUNT DETAILS");
            System.out.println("---------------------------");
            System.out.println("Account Holder "+accountHolder);
            System.out.println("Account Number "+accountNumber);
            System.out.println("Available Blance "+Balance);
        }
          if (Options == 2){
            System.out.println("You Are Registering An Acount");
            System.out.println("-----------------------------");
            System.out.println("Enter A Username ");
            Username = a.next();
            System.out.println("Enter Your Unique Pin");
            Pin = a.nextInt();
            System.out.println("Account Created Successfully Please See Your Account Details Below");
            System.out.println("-------------------------------------");
            System.out.println("Account Holder "+Username);
            System.out.println("Available Balance R"+newBalance);
        }
          else{
              System.out.println("Invalid input ");
          }
      }
public static void Menu2(){
    Scanner b = new Scanner (System.in);
    System.out.println("OPTIONS:");
    System.out.println("----------------------");
    System.out.println("1 Deposit ");
    System.out.println("2 Withdraw");
    System.out.println("3 Transfer ");
    System.out.println("4 Send Cash ");
    Options = b.nextInt();
    
    switch (Options){
        case 1:
            if (Options == 1){
                System.out.println("Enter the account number you wish to desposit to ");
                newAccountNumber = b.nextInt();
                System.out.println("Enter the amount you wish to deposit ");
                Amount = b.nextInt();
                Balance  -= Amount;
                System.out.println("You Are Depositing "+Amount+ " To "+newAccountNumber+" Enter Unique Pin To Confirm Transaction :");
                Pin = b.nextInt();
                System.out.println("Transaction Successfull");
                System.out.println("Your Current Balance left: R"+Balance);
            }
            else{
                System.out.println("Insuficient Funds ");
            }
            break;
            
        case 2:
            if(Options == 2){
                Scanner c = new Scanner(System.in);
                System.out.println("Withdrawal Amount");
                Amount = c.nextInt();
            }
                if(Amount <= Balance){
                    Balance -= Amount;
                    System.out.println("You are withdrawing "+Amount+"cash");
                    System.out.println("Your current balance left: R"+Balance);
                }
                else {
                    System.out.println("Insuficient balance ");
                }
                break;
        case 3:
            if(Options == 3){
                Scanner d = new Scanner(System.in);
                System.out.println("Transfer Money");
                System.out.println("Enter 1 for Account ");
                System.out.println("Enter 2 for MySavings ");
                Options = d.nextInt();
            }
            if(Options == 1){
                Scanner d = new Scanner(System.in);
                System.out.println("Enter Account Nummber");
                newAccountNumber = d.nextInt();
                System.out.println("Enter Amount ");
                Amount = d.nextInt();
                Balance -=Amount;
                System.out.println("You Are Transferring R"+Amount+" To "+newAccountNumber+" Enter Unique Pin To Confirm Transaction ");
                Pin = d.nextInt();
                System.out.println("Transfer Successfull");
                System.out.println("Current Balance Lef R"+Balance);
            }
            if(Options == 2){
                Scanner d = new Scanner (System.in);
                System.out.println("Transfer To Savings");
                System.out.println("Enter Amount ");
                Amount = d.nextInt();
                Balance -=Amount;
                System.out.println("You Transferred R"+Amount+ " To "+MySavings);
                System.out.println("Current Balance R"+Balance);
                System.out.println("Current Savings Balance R"+Amount);             
            }
            else{
                System.out.println("Insuficient Funds");
            }  
            break;
        case 4:
            if(Options == 4){
                Scanner e = new Scanner(System.in);
                System.out.println("Send Cash ");
                System.out.println("Amount R40 - R3000");
                Amount = e.nextInt();
                Balance -= Amount;
                System.out.println("Create 4 digit secret code ");
                 code = e.nextInt();
                System.out.println("Cash Send of R "+Amount+" Enter Unique Pin To Proceed");
                Pin = e.nextInt();
                System.out.println("Cash Send Transaction Successful");
                System.out.println("You need to send this secret code to the recipient in a separate message in order for them to collect the cash");
                System.out.println("HISTORY");
                System.out.println("==========================================");
                System.out.println("Transaction type: Cash sent");
                System.out.println("Amount R"+Amount);
                System.out.println("From account "+accountNumber);
            }
            else{
                System.out.println("Insuficient Funds");
            }
    }
}


    public static void main(String[] args) {
        Menu();
        Menu2();
    }
}
