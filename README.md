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
