# 9.6 Exercises - OOP Activity 8 :dragon:
## 9.6.1 Defining Terms :wolf:
In your own words, define the following terms:

1\. <b>Class</b> - is like an object constructor, or a "blueprint" for objects  to be created.<br> 
2\.<b> Object</b> - is created from a class.<br> 
3\. <b>Instantiate</b> - means calling a constructor of a class of the type of that class that produces an instance or object.<br> 
4\. <b>Instance Variable</b> - is a variable declared in a class but outside of constructors, methods, or blocks.<br> 
5\. <b>Instance Method</b> - basically a method of the class, therefore it is a non-static method  which is declared within a class.<br> 
6\. <b>Class Variables or static member variables</b> - is common to all instances (or objects) of the class because it is a class level.<br> 
7\. <b>Constructor</b> - is a special method used to initialize objects.<br> 

## 9.6.2 Java Scavenger Hunt :tiger:

1\. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given suffix is "lo", and false if the given suffix is "alp"

<b>Class:</b> String<br> 
<b>Method Declaration:</b>
```java
public boolean endsWith(String suffix)
```
<b>Sample Usage:</b>
```java
String endsWithVal = "hey big fella";
System.out.println(endsWithVal.endsWith("fella"));
```
<hr>

2\. Look for the method that determines the character representation for a specific digit in the specified radix. For example, if the input digit is 15, and the radix is 16, the method would return the character F, since F is the hexadecimal representation for the number 15 (base 10).

<b>Class:</b> Character<br> 
<b>Method Declaration:</b>
```java
public static char forDigit(int digit, int radix)
```
<b>Sample Usage:</b>
```java
char forDigitVal = Character.forDigit(15, 16);
System.out.println(forDigitVal);
```
<hr>

3\. Look for the method that terminates the currently running Java Virtual Machine.

<b>Class:</b> Runtime<br> 
<b>Method Declaration:</b>
```java
public void halt(int status)
```
<b>Sample Usage:</b>
```java
System.out.println("Program starting...");
Runtime.getRuntime().halt(0);
System.out.println("Process is still running.");
```
<hr>

4\. Look for the method that gets the floor of a double value. For example, if I input a 3.13, the method should return the value 3.

<b>Class:</b> Math<br> 
<b>Method Declaration:</b>
```java
public static double floor(double a)
```
<b>Sample Usage:</b>
```java
Double floorNum = Math.floor(3.13);
System.out.println(floorNum);
```
<hr>

5\. Look for the method that determines if a certain character is a digit. For example, input '3', it returns the value true.

<b>Class:</b> Character<br> 
<b>Method Declaration:</b>
```java
public static boolean isDigit(char ch)
```
<b>Sample Usage</b>
```java
boolean isDigitVal = Character.isDigit('3');
System.out.println(isDigitVal);
```
<hr>

Submitted by: Joshreen Reyes :rabbit:<br> 
BSCS - 2A HPC<br> 
Date Submitted: December 8, 2020
