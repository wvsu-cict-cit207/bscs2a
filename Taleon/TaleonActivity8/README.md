# 9.6 Exercises - OOP Activity 8 :muscle:

## 9.6.1 Defining Terms :pencil2:
In your own words, define the following terms:
1. **Class** - classes are like blueprints for java objects.
2. **Object** - objects are instances of a class. They are the representation of the blue print.
3. **Instantiate** - instantiation is the process of creating an object from a class using the *new* keyword.
4. **Instance Variable** - are variables that belong the instance or the object. In other words, they are not *static* because they are created from a separate copy of the variable inside the class upon instantiation.
5. **Instance Method** - are methods or functions that belong to the instance or the object. In other words, they are not *static* because they are created from a separate copy of the variable inside the class upon instantiation.
6. **Class Variables or static member variables** - are variables that belong to the class itself. In other words, they *are static* and are only created once in the class declaration. Instantiating variables from a class with static member variables only creates a reference of the variable from the object to the class.
8. **Constructor** - are functions that are called upon the instantiation of an object.


## 9.6.2 Java Scavenger Hunt :mag:

1\. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp".

**Class:** String<br>
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
<hr>

2\. Look for the method that determines the character representation for a specific digit
in the specified radix. For example, if the input digit is 15, and the radix is 16, the
method would return the character F, since F is the hexadecimal representation for
the number 15 (base 10).

**Class:** Character<br>
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
<hr>

3\. Look for the method that terminates the currently running Java Virtual Machine.

**Class:** System<br>
**Method Declaration:**
```java
public static void exit(int status)
```
**Sample Usage:**
```java
System.exit(-1)

//Outputs Command exited with non-zero status 255
``` 
<hr>

4\.  Look for the method that gets the floor of a double value. For example, if I input a
3.13, the method should return the value 3.

**Class:** Math<br>
**Method Declaration:**
```java
public static double floor(double a)
```
**Sample Usage:**
```java
double flooredDouble = Math.floor(3.13);
System.out.println(flooredDouble);

//Outputs 3
``` 
<hr>

5\. Look for the method that determines if a certain character is a digit. For example, if I
input '3', it returns the value true.

**Class:** Character<br>
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
<hr>

> Submitted by **Carlo Antonio T. Taleon**<br>
> BSCS-2A-AI<br>
>  10:50pm December 7, 2020<br>
