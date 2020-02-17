package org.example;
import java.util.*;
class App extends calculate_interest
{
    void App()
    {
        System.out.println("1.Simple Interest\n2.Compound Interest\nEnter Interest Type:");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter Principal Amount");
            float principal_amount = scan.nextFloat();
            System.out.println("Enter Interest Rate");
            float interest_rate = scan.nextFloat();
            System.out.println("Enter No.of Years");
            int time = scan.nextInt();
            System.out.println("Simple Interest is :"+simple_interest(principal_amount,interest_rate,time));
        }
        else if(choice == 2)
        {
            System.out.println("Enter Principal Amount :");
            float principal_amount = scan.nextFloat();
            System.out.println("Enter Interest Rate :");
            float interest_rate = scan.nextFloat();
            System.out.println("Enter No.of Years :");
            int time = scan.nextInt();
            System.out.println("Enter No.of Times :");
            int times = scan.nextInt();
            System.out.println("Compound Interest is :"+compound_interest(principal_amount,interest_rate,times,time));
        }
        else
        {
            System.out.println("Enter Valid Option !");
        }
    }
    public static void main(String args[])
    {
        App obj = new App();
        obj.App();
    }
}