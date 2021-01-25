# 9.6 Exercises
## 9.6.1 Defining Terms
---
1. **Class** - A class is a blueprint for creating an object providing initial values for state and implementations of behavior.
2. **Object** - An object is an instance of a class.
3. **Instantiate** - To instantiate is to create an object of a class.
4. **Instance Variable** - An instance variable is a variable belonging to the object. The value of these variable is unique for every object.
5. **Instance Method** - An instance method is a method which belongs to the object.
6. **Class Variables or Static member variables** - A class variable is a variable that belongs to the class itself.
7. **Constructor** - A constructor is a method invoked when an instance of a class is to be created.

---
## 9.6.2 Java Scavenger Hunt
---
1. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp".

**Class :** String

**Method Declaration :** 
```Java
public boolean endsWith(String suffix); 
```
**Sample Usage :**
```Java
String str = "Hello";
boolean b = str.endsWith("lo");
System.out.println(b);

//outputs true
```
***

2. Look for the method that determines the character representation for a specific digit in the specified radix. For example, if the input digit is 15, and the radix is 16, the method would return the character F, since F is the hexadecimal representation for the number 15 (base 10).

**Class :** Character

**Method Declaration :** 
```Java
public static char forDigit(int digit, int radix); 
```
**Sample Usage :**
```Java
int digit = 15;
int radix = 16;
char c = Character.forDigit(digit, radix);
System.out.println(c);

//outputs f
```
***

3.  Look for the method that terminates the currently running Java Virtual Machine.

**Class :** Runtime

**Method Declaration :** 
```Java
public void exit(int status); 
```
**Sample Usage :**
```Java
Runtime.getRuntime().exit(0);
```
***

4.  Look for the method that gets the floor of a double value. For example, if I input a 3.13, the method should return the value 3.

**Class :** Math

**Method Declaration :** 
```Java
public static double floor(double a); 
```
**Sample Usage :**
```Java
double a = 3.13;
double val = Math.floor(a);
System.out.println(val);

//outputs 3.0
```
***

5.  Look for the method that determines if a certain character is a digit. For example, if I input '3', it returns the value true.

**Class :** Character

**Method Declaration :** 
```Java
public static boolean isDigit(char c); 
```
**Sample Usage :**
```Java
char c = '3';
boolean b = Character.isDigit(c);
System.out.println(b);

//outputs true
```
***