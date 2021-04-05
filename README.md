# Project Snack Bar

A student that completes this project shows that they can:

* install the software needed for the Java Course
* understand what makes Java a programming language worth studying
* explain the basic concept of Object-Oriented Programming and how they relate to Java
* create and manipulate the base Java types, which include Boolean, byte, char (including Strings), short, int, long, float, and double
* craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes
* implement and use the String and Date data types

## Introduction

In this project, you will create a few different Java classes to represent a snack bar in a Java program. Variations on the snack bar project have long been a part of learning Java–ever since Java was first created.

At a high level, you will create snacks, vending machines, and customers. You will craft these classes so that all of these objects can interact with each other and keep track of their states.

## Instructions and Completion Requirements

* [x] Please fork and clone this repository. This repository does not have a starter project, so create one inside of the cloned repository folder. Regularly commit and push your code as appropriate.
* [x] When you are done, create a Pull Request (PR)
* [x] To submit the assignment, paste the URL of your branch into the assignment module in Canvas.

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

VendingMachine has fields (so knows):

* maxId - keep track of last used vending machine id
* id - automatically generated field
* name

VendingMachine has methods (so can):

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

* [x] Snack
* [x] VendingMachine
* [x] Customer

Next, you need to instantiate some objects using the classes that you've designed:

* [x] Instantiate 2 Customers
  * [x] Jane with $45.25
  * [x] Bob with $33.14

* [x] Instantiate 3 Vending Machines
  * [x] Food
  * [x] Drink
  * [x] Office

* [x] Instantiate 5 Snacks
  * [x] In "Food" Vending Machine
    * [x] 36 Chips with a price of $1.75 each
    * [x] 36 Chocolate Bar with a price of $1.00 each
    * [x] 30 Pretzel with a price of $2.00 each
  * [x] In "Drink" Vending Machine
    * [x] 24 Soda with a price of $2.50 each
    * [x] 20 Water with a price of $2.75 each

Now, that you've instantiated some objects and your program has a "state", you need to interact with your program's objects to make sure the fields and methods are working as expected. Completing these steps is considered the MVP of your snack bar program:

* [x] Customer Jane buys 3 Sodas
  * [x] Print Jane's cash on hand (example: `System.out.println("Jane's cash on hand is " + jane.getCash());`)
    * [x] `Jane's cash on hand is 37.75`
  * [x] Print quantity of soda (example: `System.out.println("Quantity of soda is " + soda.getQuantity());`)
    * [x] `Quantity of soda is 21`
* [x] Jane buys 1 Pretzel
  * [x] Print Jane's cash on hand
    * [x] `Jane's cash on hand is 35.75`
  * [x] Print quantity of Pretzel
    * [x] `Quantity of pretzel is 29`
* [x] Bob buys 2 sodas
  * [x] Print Bob's cash on hand
    * [x] `Bob's cash on hand is 28.14`
  * [x] Print quantity of soda
    * [x] `Quantity of soda is 19`
* [x] Jane finds $10.00 and add's it to her cash on hand
  * [x] Print Jane's cash on hand
    * [x] `Jane's cash on hand is 45.75`
* [x] Jane buys 1 chocolate bar
  * [x] Print Jane's cash on hand
    * [x] `Jane's cash on hand is 44.75`
  * [x] Print quantity of chocolate bar
    * [x] `Quantity of chocolate bar is 35`
* [x] Add 12 more pretzels
  * [x] Print quantity of pretzels
    * [x] `Quantity of pretzel is 41`
* [x] Bob buys 3 pretzels
  * [x] Print Bob's cash on hand
    * [x] `Bob's cash on hand is 22.14`
  * [x] Print quantity of pretzel
    * [x] `Quantity of pretzel is 38`

The stretch goals for this project are:

* [ ] Display each snack with
  * [ ] Name
  * [ ] Vending Machine Name
  * [ ] Quantity on hand
  * [ ] Total cost of all of the quantities of this snack on hand
* [ ] Format all dollar amount like $1,234.56
  * [ ] Starts with a dollar sign
  * [ ] comma separating group of 3 numbers
  * [ ] rounded to the nearest cents, hundredths place

For example, if you complete all of the steps above, your output for the stretch goals would look like this:

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
