# Cipher

The User and Bot classes are subclasses of the Account super class. They represent typical 
internet traffic. A data file is provided for testing purposes. The file is read in and the 
values are used to create Bot and User objects. The data is printed out in a neat format using the
toString method. The password for each account is checked for strength. It must be 8 digits long, contain an 
uppercase letter, lowercase letter, and a symbol. A regular expression is used to check that 
the criteria is met. The password is then encrypted by shifting up through the alphabet given by the
salt number value that is provided in the test file.

