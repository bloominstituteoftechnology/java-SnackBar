# Project Snack Bar

A student that completes this project shows that they can:

* install the software needed for the Java Course
* understand what makes Java a programming language worth studying
* explain the basic concept of Object Oriented Programming and how they relate to Java
* create and manipulate the base Java types which include Boolean, byte, char (including Strings), short, int, long, float, and double
* craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes
* implement and use the String and Date data types

## Introduction

In this project, you will create a few different Java classes to represent a snack bar in a Java program. Variations on the snack bar porject have long been a part of learning Java–ever since Java was first created.

At a high level, you will create snacks, vending machines, and customers. You will craft these classes so that all of these objects can interact with each other and keep track of their individual states.

## Instructions and Completion Requirements

* [ ] Please fork and clone this repository. This repository does not have a starter project, so create one inside of the cloned repository folder. Regularly commit and push your code as appropriate.
* [ ] When you are done, create a Pull Request (PR)
* [ ] To submit the assignment, paste the URL of your branch into the assignment module in Canvas.

You need to create three different classes in your project: `Snack`, `Customer`, and `VendingMachine`. Details for what fields and methods each class needs to contain are below.

### Snack Class Specs

Snack has fields (so knows):

* maxId - keep track of last used snack id
* id - automatically generated field
* name
* quantity
* cost
* vending machine id

Snack has methods (so can):

* get id
* set and get name
* set and get cost
* set and get vending machine id
* get quantity
* add quantity when given how many to add
* buy snack when given how many to buy
* get total cost given a quantity

### VendingMachine Class Specs

Vending machine has fields (so knows):

* maxId - keep track of last used vending machine id
* id - automatically generated field
* name

Vending Machine has methods (so can):

* get id
* set and get name

### Customer Class Specs

Customer has fields (so knows):

* maxId - keep track of last used customer id
* id - automatically generated field
* name
* cash on hand

Customer has methods (so can):

* get id
* set and get name
* add cash to cash on hand
* get cash on hand
* buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

The first thing you need to do is set up the three classes (as specified above) in your project:

* [ ] Snack
* [ ] VendingMachine
* [ ] Customer

Next, you need to instantiate some objects using the classes that you've designed:

* [ ] Instantiate 2 Customers
  * [ ] Jane with $45.25
  * [ ] Bob with $33.14

* [ ] Instantiate 3 Vending Machines
  * [ ] Food
  * [ ] Drink
  * [ ] Office

* [ ] Instantiate 5 Snacks
  * [ ] In "Food" Vending Machine
    * [ ] 36 Chips with a price of $1.75 each
    * [ ] 36 Chocolate Bar with a price of $1.00 each
    * [ ] 30 Pretzel with a price of $2.00 each
  * [ ] In "Drink" Vending Machine
    * [ ] 24 Soda with a price of $2.50 each
    * [ ] 20 Water with a price of $2.75 each

Now, that you've instantiated some objects and your program has a "state", you need to interact with your program's objects to make sure the fields and methods are working as expected. Completing these steps is considered the MVP of your snack bar program:

* [ ] Customer Jane buys 3 Sodas
  * [ ] Print Jane's cash on hand (example: `System.out.println("Jane's cash on hand is " + jane.getCash());`)
    * [ ] `Jane's cash on hand is 37.75`
  * [ ] Print quantity of soda (example: `System.out.println("Quantity of soda is " + soda.getQuantity());`)
    * [ ] `Quantity of soda is 21`
* [ ] Jane buys 1 Pretzel
  * [ ] Print Jane's cash on hand
    * [ ] `Jane's cash on hand is 35.75`
  * [ ] Print quantity of Pretzel
    * [ ] `Quantity of pretzel is 29`
* [ ] Bob buys 2 sodas
  * [ ] Print Bob's cash on hand
    * [ ] `Bob's cash on hand is 28.14`
  * [ ] Print quantity of soda
    * [ ] `Quantity of soda is 19`
* [ ] Jane finds $10.00 and add's it to her cash on hand
  * [ ] Print Jane's cash on hand
    * [ ] `Jane's cash on hand is 45.75`
* [ ] Jane buys 1 chocolate bar
  * [ ] Print Jane's cash on hand
    * [ ] `Jane's cash on hand is 44.75`
  * [ ] Print quantity of chocolate bar
    * [ ] `Quantity of chocolate bar is 35`
* [ ] Add 12 more pretzels
  * [ ] Print quantity of pretzels
    * [ ] `Quantity of pretzel is 41`
* [ ] Bob buys 3 pretzels
  * [ ] Print Bob's cash on hand
    * [ ] `Bob's cash on hand is 22.14`
  * [ ] Print quantity of pretzel
    * [ ] `Quantity of pretzel is 38`

The stretch goals for this project are to produce the following output

* [ ] Display each snack with
  * [ ] Name
  * [ ] Vending Machine Name
  * [ ] Quantity on hand
  * [ ] Total cost of all of the quantities of this snack on hand
* [ ] Format all dollar amount like $1,234.56
  * [ ] Starts with a dollar sign
  * [ ] comma separating group of 3 numbers
  * [ ] rounded to the nearest cents, hundredths place

For example, if you complete all of the steps above, your output for the stretch goals would look like:

```TEXT
Snack: Chips
Vending Machine: Food
Quantity: 36
Total Cost: $63.00

Snack: Chocolate Bar
Vending Machine: Food
Quantity: 35
Total Cost: $35.00

Snack: Pretzel
Vending Machine: Food
Quantity: 38
Total Cost: $76.00

Snack: Soda
Vending Machine: Drink
Quantity: 19
Total Cost: $47.50

Snack: Water
Vending Machine: Drink
Quantity: 20
Total Cost: $55.00
```
