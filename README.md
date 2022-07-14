# Python Documentation

# Tip Calculator

This Python script is a simple tip calculator. It prompts the user to input the total bill amount, the tip percentage they wish to give, and the number of people splitting the bill. It then calculates the total bill including the tip, and the amount each person should contribute.

## How it works

The script works by first asking the user for the total bill amount, the tip percentage, and the number of people splitting the bill. These values are stored in the variables `bill`, `tip_percentage`, and `num_people` respectively.

```python
bill = float(input("Enter the total bill amount: "))
tip_percentage = float(input("Enter the tip percentage: "))
num_people = int(input("Enter the number of people: "))
```

Next, it calculates the tip amount by multiplying the bill by the tip percentage divided by 100. This value is stored in the variable `tip_amount`.

```python
tip_amount = bill * (tip_percentage / 100)
```

The total bill, including the tip, is then calculated by adding the tip amount to the original bill. This value is stored in the variable `total_bill`.

```python
total_bill = bill + tip_amount
```

Finally, the amount each person should contribute is calculated by dividing the total bill by the number of people. This value is stored in the variable `bill_per_person`.

```python
bill_per_person = total_bill / num_people
```

The script then prints out the total bill and the amount each person should contribute.

```python
print("Total bill: ", total_bill)
print("Bill per person: ", bill_per_person)
```

## Libraries

This script does not import any libraries. It only uses built-in Python functions.

---

# C# Documentation

# CSharp Tip Calculator

This is a simple console application written in C# that calculates the tip amount based on the total bill and the tip percentage provided by the user.

## Script Explanation

The script first prompts the user to enter the total bill amount. It then asks for the tip percentage. The script calculates the tip amount by multiplying the total bill by the tip percentage and dividing by 100. The calculated tip amount is then displayed to the user.

## Libraries Used

- `System`: This is a built-in C# namespace. It provides classes that are fundamental to the design of the C# language. In this script, it is used to handle standard I/O operations through the `Console` class.

## Code Breakdown

```csharp
using System;
```
This line imports the System namespace which provides the `Console` class used for reading from and writing to the console.

```csharp
class Program
```
This line declares a class named `Program`. In C#, every application must contain a main method, and in this case, it's contained in the `Program` class.

```csharp
static void Main(string[] args)
```
This line declares the main method of the `Program` class. The `Main` method is the entry point of a C# console application.

```csharp
Console.Write("Enter the total bill amount: ");
double bill = Convert.ToDouble(Console.ReadLine());
```
These lines prompt the user to enter the total bill amount and then read the user's input from the console. The input is converted from string to double and stored in the `bill` variable.

```csharp
Console.Write("Enter the tip percentage: ");
double tipPercentage = Convert.ToDouble(Console.ReadLine());
```
These lines prompt the user to enter the tip percentage and then read the user's input from the console. The input is converted from string to double and stored in the `tipPercentage` variable.

```csharp
double tipAmount = (bill * tipPercentage) / 100;
```
This line calculates the tip amount by multiplying the total bill by the tip percentage and dividing by 100.

```csharp
Console.WriteLine("The tip amount is: " + tipAmount);
```
This line displays the calculated tip amount to the user.

```csharp
Console.Write("Press any key to exit...");
Console.ReadKey();
```
These lines display a message to the user and wait for the user to press a key before the console window closes.

---

# Java Documentation

# Java Tip Calculator

This is a simple Java program that calculates the tip for a given bill amount and tip percentage. The user is prompted to enter the bill amount and the tip percentage, and the program calculates the tip amount and the total bill amount.

## Script Explanation

The script begins by importing the `java.util.Scanner` class, which is a part of the Java API that allows us to read user input from the console.

The main method of the `TipCalculator` class is where the program execution begins. Here's a breakdown of what happens:

1. A `Scanner` object is created to read the user input.

2. The user is prompted to enter the bill amount, which is read and stored as a `double`.

3. The user is then prompted to enter the tip percentage, which is also read and stored as a `double`.

4. The tip amount is calculated by multiplying the bill amount by the tip percentage divided by 100 (to convert the percentage to a decimal).

5. The total bill amount is calculated by adding the tip amount to the original bill amount.

6. The tip amount and the total bill amount are then printed to the console.

## Imported Libraries

- `java.util.Scanner`: This class is part of the Java API and is used for obtaining the input of the primitive types like int, double, etc. and strings. It is the easiest way to read input in a Java program, though not very efficient if you want an input method for scenarios where time is a constraint, like in competitive programming.

---
