# HashMap Overflow Sprint 1: Bookazon
# Claire Yu, Ming Zhang, Jordan Smith, and Tim Pratt
# CS321 Software Engineering

## Overview
This repository contains the code for extending and improving an existing online Bookstore called "Bookazon," where an user can place an order for a variety of media types to be shipped (e.g. books, DVDs, and ebooks). By placing an order, a user can add/remove items and apply certain discounts depending on their membership. Throughtout this project, we gained a better understanding in using Git/Github Command, demonstrating Agile fundamentals, and working collaboratively. 

## Bookazon
The `Bookazon` is the main class where all the functionalities from the other class are being used and tested. There exists a main method to be certain that all the methods are working properly. 

## Address
The `address` is an abstract class that is shared by the BillingAddress and ShippingAddress

## BillingAddress
The `BillingAddress` is a class that extends from the Address, to print out the billing information for an user. 

## ShippingAddress
The `ShippingAddress` is a class that extends from the Address, to print out the shipping information for an user. 

## Cart
The `Cart` is a class to hold what items an user is currently looking to purchase. 

## CartItem
The `CartItem` is a class that extends from the Cart, to add each item into a Cart

## Subscription
The `Subscription` is a class that is used to distinguish the user's membership and apply the correct discount, respectively. 

## GoldMember
The `GoldMember` is a class that extends from Subscription, therefore applying the Gold Membership discount to the user.

## PlatinumMember
The `PlatinumMember` is a class that extends from Subscription, therefore applying the Platinum Membership discount to the user.

## RegularMember
The `RegularMember` is a class that extends from Subscription, therefore applying the Regular Membership discount to the user.

## SilverMember
The `SilverMember` is a class that extends from Subscription, therefore applying the Silver Membership discount to the user.

## Media
The `Media` is a class that allows other media types to be used, such that not only books are available in "Bookazon"

## Order
The `Order` is a class that allows users to place an order whenever they are ready to checkout

## User
The `User` is a class that provides the methods for a User's functionalitites

## Data Structures
We used arrayLists in this project to demonstrate a working Bookazon

## Control Flow
Bookazon is implemented in Bookazon.java, with the calls of other functions also in the repository.

## main
The `main` function initializes the other modulues presented in the repository to have everything working properly. 

## Implementation
Bookazon was implemented by initially identifying the possible code smells and issues that were presented in the code, and then proposing solutions to each issue encountered. From there, we were able to distinguish what needed to fix, and then collaboratively work together to fix all the problems found. This allowed us to to have a software project that followed the guidance of the SOLID Principles and result with no CODE smells presented

## Function prototype
# Bookazon
Below is each function's interface in Bookazon to apply the other classes created in this project.
```java
public Bookazon();
public void addBook(Book book);
public void addUser(User user);
public void viewBooks();
public void viewUsers();
public void removeBook(Book book);
public void removeUser(User user);
public static void main(String[] args);
```

## Testing Plan
# Integration/System testing
We tested Bookazon through using the main to check each method we have updated was working correctly. For instance, when we updated Bookazon to include more forms of media, we need to make sure that Users could add/remove various media types from their cart. We verified that our system was working by studying the output and confirming it logically. 

