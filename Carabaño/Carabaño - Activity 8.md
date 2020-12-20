9.6 Exercises 
9.6.1 Defining terms In your own words, define the following terms: 
1. Class- In simple words, Class is a template or blueprint that determines how an object will behave and what it will contain. 
2. Object – Object plays a big role in java because Java is an object-oriented language. Object refers to the combination of data and procedures working on the available data. It has state and behaviors where state refers to the variables and behaviors refer to methods or functions performed.
3. Instantiate- Instantiate means calling a constructor of a Class which creates an instance or object, of the type of that Class.
4. Instance Variable – Instance Variable are variables that are defined inside a class but outside a constructor or any method and block. It holds values that be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.
5. Instance Method – Instance method refers to the method that requires an object of its class to be created before it can be called.
6. Class Variables or static member variables – Class Variables or static member variables are variables that are defined inside a class but outside a constructor, method or block. It is different with the instance variable because class variables should have only one copy per class, regardless the number of objects that are created from it.
7. Constructor – A constructor is said to be a special method in java because it does not have a return type. It is a block of code that initializes objects and it is called when an object of a class is created.

 
9.6.2 Java Scavenger Hunt

1.
Class: String
Method of declaration : public boolean endsWith(String string)
Sample usage:
String str = "Hello";
Scanner sc = new Scanner (System.in);
System.out.println("Enter the suffix of the string ");
String suffix = sc.nextLine();
System.out.println( "Does " + str + " ends with " + suffix + "? = " + str.endsWith(suffix)); 

2.
Class :  Character
Method of declaration: public static char forDigit(int i, int i1)
Sample usage:
int num1 = 15;
char ch1 = Character.forDigit(num1, 16);
System.out.println("The character representation for " + num1 + " with the radix of 16 is "+ ch1);

3.
Class :  System
Method of declaration: public static void exit(int i)
Sample usage:
String choice1 = "A";
String choice2 = "B";
Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String choice = sc.nextLine();
        
        if(choice1.equals(choice) || choice2.equals(choice)){
            System.out.println("You entered a correct choice");
         }
        else{
            System.exit(0);
        }

4.
Class :  Math
Method of declaration: public static double floor(double d)
Sample usage:
double num1 = 3.13;
        System.out.println(Math.floor(num1));

5.
Class :  Character
Method of declaration: public static boolean isDigit(char c)
Sample usage:
char ch = '3';
    System.out.println("Is the character " + ch +" a digit?= " +Character.isDigit(ch));


