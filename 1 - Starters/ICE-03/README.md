# ICE 03 - Classes
## Exercise 03-01: Create a Class

*Learning Objective:  Be able to create a basic class with instance variables*

1. Create a class called Book with instance variables title and author of type String

2. Create an instance of Book in Program.main and set some basic info: 

   ```java
   Book book1 =  new Book();  
   book1.title =  "Effective Java"  
   book1.author  = "Joshua Bloch" 
   ```

3. Create a second Book object (instance) called book2 with title = Java: A Beginner's Guide, Seventh Edition and author = Herbert Schildt

4. Write a line of code to output the title and author of the first book: System.out.println("Title: " + book1.title + "; Author: " + book1.author);

5. Write a second line of code that prints the second book info out: System.out.printf("Title: %s; Author: %s", book2.title, book2.author);

6. Run your code and check the output



## Exercise 03-02 - Apply Encapsulation

*Learning Objective:  Apply concept of encapsulation by creating accessor / mutator methods*

1. Write an accessor and mutator for title and author : 
   - Create getTitle, setTitle, getAuthor, setAuthor methods
   - setTitle and setAuthor will both accept a String parameter to update the title and author instance variables)
2. Update your Program.main code to use the accessor / mutators
   - Change direct assignment of instance variable to use the mutator method
   - Change direct access of instance variable to use the accessor method



## Exercise 03-03:  Use Constructors

*Learning Objective:  Apply constructors  to initialize state of object at creation*

1. Create a default constructor (i.e. no parameters). 

   Add the constructor body: 

   ```java
   public Book() { }
   ```

   Inside the constructor body, initialize instance variables title and author to empty strings (i.e.””)

2. Create a parameterized constructor

   Add the constructor body: 

   ```java
   public Book(String title, String author) { }
   ```

   Initialize (i.e. assign) instance variables from parameters (you’ll need to use “this” keyword on instance variables)