# 9.6.1 Defining Terms
1\. <b> Class</b> - basically, class is a template of code that are used extensively for defining methods and variables for a particular object. 
2\. <b> Object</b> - object is an example of class that carries variables and methods. It contains methods and properties that make a particular data 
structure valuable.
3\. <b> Instantiate</b> - instantiate in java refers in declaring a specified constructor in the class as means of creating an object in a certain class. in simpler terms instantiate in java means creating a new object.
4\. <b> Instance Variable </b> - instance variable is declaration of a variable in a class but outside of constructors, blocks and methods. With the use of access modifiers, instance variables are visible to other subclasses. 
5\. <b> Instance Method</b> - unlike instance variable, instance method is declared inside the class. It is kind of method that needs an object of its class created before it can be invoked.
6\. <b>Class variable or static member variable </b> - static variable is common among all instances. Also called as class variable, this class level variable is created and shared among all instances(objects) on the class.
7\.  <b>Constructor</b> constructor is a kind of special method that is declared when initializing objects. In addition, it can be used to set object attributes and initial values.

# 9.6.2 Java Scavenger Hunt
Now let's start the search! 
1\. Look for a method that checks if a certain String ends with a certain suffix. For example, if the given string is "Hello", the method should return true the suffix given is "lo", and false if the given suffix is "alp". 
<b>Class:</b> String
 <b>Method Declaration:</b>
 ```java
  public boolean endsWith(String suffix)
   ``` 
 <b>Sample Usage:</b> 
 ```java
  String endsWithVal = ""; 
  System.out.println(endsWithVal.endsWith("I make it!")); 
   ```
  <hr>

2\. Look the method that determines the character representation for a specific digit in the specified radix. For example, if the input digit is 15, and the radix is 16, the method would return the character F, since F is the hexadecimal representation for the number 15 (base 10). 

<b>Class:</b> Character 
<b>Method Declaration:</b>
```java
`public static char forDigit(int digit, int radix)`
```
<b>Sample Usage:</b>
```java
char fornNum = Character.forDigit(15, 16); 
System.out.println(forDigitVal);`
```
<hr>
3\. Look for the method that terminates the currently running Java Virtual Machine 

<b>Class: </b> Runtime
<b>Method Declaration: </b>
``` java
public void exit (int status)
```
<b> Sample Usage </b>
``` java
System.exit(0);
``` 
<hr>

4\. Look for the method that gets the floor of a double value. For example, if I input a 3.13, the method should return the value 3. 
<b> Class: </b>  </b> Math
<b>Method Declaration: </b>
``` java
Math.floor(double value)
``` 
<b> Sample Usage </b>
``` java
public static double floor(double a)
``` 
<hr>


5\. Look for the method that determines if a certain character is a digit. For example, if I input '3', it returns the value true.

<b> Class: </b>  </b> Character
<b>Method Declaration: </b>
``` java
 Java Character isDigit() 
``` 
<b> Sample Usage </b>
``` java
public static boolean isDigit(int codePoint)
``` 
<hr>
