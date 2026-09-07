# Laboratory Activity: Recursion
# Description 
This program is a binary search that accepts user input for the array size and elements, sorts the array then searches for the desired target value of the user, displays the low, mid, high and the search direction
# Programming Language
Java
# How to compile and run
javac Binary_search.java
java Binary_search
# Sample input and output
Number of Elements: 7  
```
Element 1: 40
```
Element 2: 10
```
Element 3: 70
```
Element 4: 20
Element 5: 50
Element 6: 30
Element 7: 60

Sorted array: 10 20 30 40 50 60 70
Enter target value: 50
bSearch(0, 6, 50)  mid = 3  search right
bSearch(4, 6, 50)  mid = 5  search left
bSearch(4, 4, 50)  mid = 4  found

Target found 
index: 4
