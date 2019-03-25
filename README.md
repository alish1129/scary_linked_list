<h2> CMPS 390, Data Structures, Assignment 4 2nd Linked List program </h2>

<strong>Read the following program spec completely before you start.</strong>

You are to write a program that reads a data file of numbers and inserts them into a list in the correct sorted position.  Your program should have the following functionality:

•	Ask user for file name to read from.
•	Read in data from the file, numbers.txt.  The numbers will be between 0 and 100.
•	Data should be inserted in the appropriate place.
•	Do not store duplicates, but do record when they occur. 
o	Do not presort the list
•	Have menu options (just text using a console application) to do the following:
o	Display the list.
o	Request the length of the list
o	The user should be able to delete a single number from the list.  To do this you either decrement the count parameter ( see below, or delete the node1)

1To do this efficiently you should include a count parameter in your node class.  Each time you find a duplicate of a number that is already in the list, increment the count.  A new node is put into the list only if the number is not already in the list.
Code requirements
1.	You must have separate functions for each list operation (i.e insert, empty, delete, etc.)
2.	No GUI’s required, concentrate on the functionality.
3.	JAVA or C/C variant
4.	No fancy built in types will be accepted.  Make your own structures, your own functions, etc.
 
