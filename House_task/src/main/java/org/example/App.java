package org.example;
import java.util.Scanner;
class App extends houseTask
{
    void App()
    {
        System.out.println("Enter Area in Square Feet :");
        Scanner scan = new Scanner(System.in);
        float area = scan.nextFloat();
        System.out.println("Enter Choice for Fully Automated House or Not :\n1.Yes\n2.No");
        int choice = scan.nextInt();
        if (choice == 2)
        {
            System.out.println("Enter House Type needed:\n1.Standard material\n2.Above Standard material\n3.High Standard material");
            int choice1 = scan.nextInt();
            if (choice1<1 && choice1>3)
            {
                System.out.println("Enter Valid choice");
            }
            else
            {
                System.out.println("Cost of Construction : "+calculate_cost(choice1,area));
            }
        }
        else if(choice==1)
        {
            System.out.println("Cost of Construction : "+calculate_cost(4,area));
        }
        else
        {
            System.out.println("Enter Valid choice");
        }
    }
    public static void main(String[] args)
    {
        App obj = new App();
        obj.App();
    }
}
