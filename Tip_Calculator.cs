using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the total bill amount: ");
        double bill = Convert.ToDouble(Console.ReadLine());

        Console.Write("Enter the tip percentage: ");
        double tipPercentage = Convert.ToDouble(Console.ReadLine());
    }
}