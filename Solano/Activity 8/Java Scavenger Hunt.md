# 9.6.2 Java Scavenger Hunt

1. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp".

<b> Class: </b> String
<b> Method Declaration: </b>
```java
public boolean endsWith(String suffix)
```
<b> Sample Usage: <b/>
```java
String endsWithWord = "Hello world!";
System.out.println(endsWithWord.endsWith("world!"));
```
<hr>

2. Look for the method that determines the character representation for a specific digit in the specified radix. For example, if the input digit is 15, and the radix is 16, the method would return the character F, since F is the hexadecimal representation for the number 15 (base 10).

<b> Class: </b> Character
<b> Method Declaration: </b>
```java
public static char forDigit(int digit, int radix)
```
<b> Sample Usage: <b/>
```java
char forDigitNum = Character.forDigit(15, 16);
System.out.println(forDigitNum);
```
<hr>

3. Look for the method that terminates the currently running Java Virtual Machine

<b> Class: </b> Runtime
<b> Method Declaration: </b>
```java
public void exit(int status)
```
<b> Sample Usage: <b/>
```java
System.exit(0);
```
<hr>

4. Look for the method that gets the floor of a double value. For example, if I input a 3.13, the method should return the value 3.

<b> Class: </b> Math
<b> Method Declaration: </b>
```java
public static double floor(double a)
```
<b> Sample Usage: <b/>
```java
double val = Math.floor(3.13);
System.out.println(val);
```
<hr>

5. Look for the method that determines if a certain character is a digit. For example, if I input '3', it returns the value true.

<b> Class: </b> Character
<b> Method Declaration: </b>
```java
boolean isDigit(char ch)
```
<b> Sample Usage: <b/>
```java
System.out.println(Character.isDigit('3'));
```
<hr>