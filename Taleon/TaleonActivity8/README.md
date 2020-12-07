# 9.6 Exercises - OOP Activity 8 

## 9.6.1 Defining Terms :coffee:



## 9.6.2 Java Scavenger Hunt
1. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp".

**Class:** String
**Method Declaration:**
```java
public boolean endsWith(String suffix)
```
**Sample Usage:**
```java
String strValue = "yo maboi"; //instantiation
System.out.println(strValue.endsWith("boi"));

//Outputs true
```

2. Look for the method that determines the character representation for a specific digit
in the specified radix. For example, if the input digit is 15, and the radix is 16, the
method would return the character F, since F is the hexadecimal representation for
the number 15 (base 10).

**Class:** Character
**Method Declaration:**
```java
public static char forDigit(int digit, int radix)
```
**Sample Usage:**
```java
char charValue = Character.forDigit(15, 16);
System.out.println(charValue);

//Outputs f
```

3. Look for the method that terminates the currently running Java Virtual Machine.

**Class:** System
**Method Declaration:**
```java
public static void exit(int status)
```
**Sample Usage:**
```java
System.exit(-1)

//Outputs Command exited with non-zero status 255
``` 
4.  Look for the method that gets the floor of a double value. For example, if I input a
3.13, the method should return the value 3.

**Class:** Math
**Method Declaration:**
```java
public static double floor(double a)
```
**Sample Usage:**
```java
Double flooredDouble = Math.floor(3.13);
System.out.println(flooredDouble);

//Outputs 3
``` 

5. Look for the method that determines if a certain character is a digit. For example, if I
input '3', it returns the value true.

**Class:** Character
**Method Declaration:**
```java
public static boolean isDigit(char ch)
```
**Sample Usage:**
```java
boolean isDigitVal = Character.isDigit('3');
System.out.println(isDigitVal);

//Outputs true
``` 