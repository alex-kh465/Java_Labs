# Java Programming Lab

## Lab1

### Program 1: Credit Card Validation
This program demonstrates the use of constructors in Java and includes functionality to check whether a credit card number is valid. It implements the given constrains in the question to determine the validity of the credit card number entered by the user.

- **Concepts Covered**: Constructors and switch case
- **Programming Language**: Java

### Program 2: Alphabet War Game
This program involves a game called Alphabet War, where characters battle based on specified rules to determine the winning side. Each letter has an assigned point value, and the total score determines the winner.

- **Concepts Covered**: Control Structures, Data Manipulation
- **Programming Language**: Java

- ## Lab2

### Program 1: Top K Frequent Numbers
This program uses the `static` keyword to manage an array of N numbers and a positive integer K. It identifies the K numbers with the highest frequency, prioritizing numbers with higher values in case of frequency ties. The results are displayed in descending order of frequency.

- **Concepts Covered**: Static Keyword, Arrays, Frequency Calculation
- **Programming Language**: Java

### Program 2: Maximum Profit in Share Trading
In the context of daily share trading, this program simulates a trader who can make up to two transactions in a day (Buy -> Sell -> Buy -> Sell). It determines the maximum profit achievable based on stock prices over the day while adhering to transaction constraints.

- **Concepts Covered**: Classes, Maximum Profit Calculation, Trading Constraints
- **Programming Language**: Java

---
# Lab 3: Employee Payroll System

## Overview
The Employee Payroll System is a Java application designed to manage employee roles and payment structures at CHRIST (Deemed to be University) using object-oriented programming principles.

## Features
- Supports Hourly, Salaried, and Executive employees.
- Calculates weekly and annual salaries.
- Computes tailored bonuses based on employee type.
- Validates employee data.
- Provides detailed employee reports.

## Class Hierarchy
1. **Employee**: Base class with attributes like `employeeId`, `employeeName`, and `designation`. Contains methods for bonus calculation and displaying details.
2. **HourlyEmployee**: Inherits from Employee, adding `hourlyRate` and `hoursWorked`. Calculates weekly pay and overrides bonus calculation.
3. **SalariedEmployee**: Inherits from Employee with `monthlySalary`. Calculates weekly pay based on monthly salary and overrides bonus calculation.
4. **ExecutiveEmployee**: Inherits from SalariedEmployee, adding `bonusPercentage`. Overrides bonus calculation to include percentage-based bonuses.
# Lab4 - Java: Robber Class Inheritance and Method Implementation

## Problem Statement

In this lab, we are tasked with establishing an abstract class named `Robber` and a class named `JAVAProfessionalRobber` that extends `Robber`. The main objectives are as follows:

1. **Abstract Class**: 
   - Create an abstract class `Robber` with a function `RobbingClass` that prints `"MScAI&ML"`.
   - The abstract class will also include an abstract method for `RowHouses()`, `RoundHouses()`, `SquareHouse()`, and `RectangleHouse()`.
   - A default method `MachineLearning` will also be implemented in the abstract class, which prints `"I love MachineLearning."`.

2. **Concrete Class**:
   - Create a class `JAVAProfessionalRobber` that inherits from the abstract class `Robber` and implements the four abstract methods: `RowHouses()`, `RoundHouses()`, `SquareHouse()`, and `RectangleHouse()`.

### Class Structure

1. **Robber (Abstract Class)**:
   - Contains a method `RobbingClass()` which prints `"MScAI&ML"`.
   - Contains four abstract methods:
     - `RowHouses()`
     - `RoundHouses()`
     - `SquareHouse()`
     - `RectangleHouse()`
   - Contains a default method `MachineLearning()` that prints `"I love MachineLearning."`.

2. **JAVAProfessionalRobber (Concrete Class)**:
   - Inherits from `Robber` and implements all abstract methods:
     - `RowHouses()`
     - `RoundHouses()`
     - `SquareHouse()`
     - `RectangleHouse()`

# Lab5 - Bank System and Water Conservation

This project consists of two problems: a Bank System to calculate interest based on balances and a Water Conservation System for calculating the volume of water that can be trapped between city blocks during the rainy season.

## Problem 1: Bank System
An interface `BankInterface` is created with abstract methods `getBalance` and `getInterestRate`. Three banks, `BankA`, `BankB`, and `BankC`, implement this interface, each defining their own balance and interest rates:

- **BankA**: Interest rate of 7% on the balance.
- **BankB**: Interest rate of 7.4% on the balance.
- **BankC**: Interest rate of 7.9% on the balance.

The program deposits different amounts into each bank:
- Bank A: 10,000
- Bank B: 150,000
- Bank C: 200,000

It then displays the balance and interest rate of each bank separately.

## Problem 2: Water Conservation System
An interface `WaterConservationSystem` defines the method `calculateTrappedWater(int[] blockHeights)`, which calculates the amount of water that can be trapped between city blocks during rainfall. 

- An abstract class `RainySeasonConservation` implements the `WaterConservationSystem` interface, serving as a base for different implementations.
- The class `CityBlockConservation` extends `RainySeasonConservation` and implements the `calculateTrappedWater(int[] blockHeights)` method to calculate the total trapped water based on the heights of city blocks.

# Lab6 - Currency Combinations and Coffee Shop Simulation

This project consists of two problems: **Currency Combinations** to find the number of ways to make a given sum using different coin denominations, and a **Coffee Shop Simulation** to manage interactions between baristas (producers), customers (consumers), and a coffee reviewer (observer), ensuring proper synchronization using multithreading.

## Problem 1: Currency Combinations
You are given an integer array `coins[]` representing different denominations of currency and an integer `sum`. The task is to find the number of ways to make the given sum by using different combinations of the coins array. 

- **Input**: 
  - `N = 3`, `sum = 4`, coins = {1, 2, 3}
- **Output**: 
  - `4` (Four possible ways: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3})

Multithreading is incorporated to optimize the computation of different combinations. Multiple threads are used to explore and calculate the various combinations concurrently, ensuring faster processing for larger inputs.

## Problem 2: Coffee Shop Simulation
A coffee shop simulation where baristas (producers) prepare coffee orders, and customers (consumers) pick them up. Additionally, a coffee reviewer (observer) randomly samples coffee from the counter to rate its quality.

- **Synchronization**:
  - Baristas stop making coffee if the counter is full, and customers wait if the counter is empty.
  - The reviewer only attempts to sample when at least one coffee is available.
  - A custom exception `CounterEmptyException` is used when the counter is empty.
  - The program uses `wait()` and `notify()` to synchronize interactions between baristas, customers, and the reviewer.


### Example Input and Output
**Inputs**:
- Baristas' tasks:
  - Barista 1: Prepares 2 coffees.
  - Barista 2: Prepares 3 coffees.
- Customers' tasks:
  - Customer 1: Picks up 1 coffee.
  - Customer 2: Picks up 2 coffees.
  - Customer 3: Picks up 1 coffee.
- Coffee Reviewer task: Samples 1 coffee for review.

**Expected Output**:

Barista 1 prepared coffee. Counter: 1
Barista 1 prepared coffee. Counter: 2
Barista 2 prepared coffee. Counter: 3
Barista 2 is waiting. Counter is full.
Customer 1 picked up coffee. Counter: 2
Barista 2 prepared coffee. Counter: 3
Barista 2 is waiting. Counter is full.
Customer 2 picked up coffee. Counter: 2
Customer 2 picked up coffee. Counter: 1
Barista 2 prepared coffee. Counter: 2
Customer 3 picked up coffee. Counter: 1
Coffee Reviewer sampled coffee. Counter: 0
Barista 1 is notified. Counter is empty.
Barista 2 is notified. Counter is empty.


# Lab7 - Amazon Menu-Driven Application

This project simulates an Amazon system to manage customer data and process orders efficiently using object-oriented concepts and various data structures. It involves creating classes to manage customer information, products, and orders, while using multithreading, custom sorting, and synchronization techniques.

## Problem Description

### **Customer Class**
- Manages customer details, including registration and updates.
  
### **Product Class**
- Represents products and allows the addition and update of product details in the catalog.

### **Order Class**
- Facilitates order placement, modification, and retrieval of order history.

### **Data Structures Used**
- **ArrayList**: Stores dynamic lists of customers, products, and orders, allowing flexible addition and removal of elements.
- **HashMap**: Enables fast retrieval of customers and products using unique IDs.
- **HashSet**: Ensures only unique products are associated with each customer, preventing duplicates.
- **TreeSet**: Implements sorting for customers or products based on custom attributes.

### **Custom Sorting**
The `Comparator` interface is used to enable custom sorting in the `TreeSet`:
- Sort products by price, name, or other attributes.
- Sort orders by delivery date or customers by loyalty points.

### Example Operations
- Adding new customers and products.
- Creating orders with specific products and calculating order history.
- Sorting products by price and customers by loyalty points using the custom sorting functionality.

### **Multithreading Concepts**
- Use of multithreading to process orders concurrently for customers, ensuring efficiency and real-time updates to product inventory and customer data.
