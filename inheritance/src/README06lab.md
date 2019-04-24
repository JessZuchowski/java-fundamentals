# Lab 06: Composition and Inheritance

## Feature Tasks:

1. Create a class to represent a Restaurant. Each restaurant should have a name, number of stars, and a price category. Implement a toString method and test it. Write a test to create an instance of Restaurant and ensure that toString is working. 
2. Create a class to represent a Review. Each review should have a body, author, and number of stars. Also implement toString and tests. 
3. A Review should be about a single Restaurant. 
4. Add an instance method addReview to the Restaurant class. This method should take in a Review instance and associate that review with this Restaurant. 
5. When a review is associated with a restaurant, that restaurant's star rating should change. Ensure that addReview method updates Restaurant star rating. 