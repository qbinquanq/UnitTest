# UnitTest
Question: In the programming language of your choice create a class with a method to return the length and longest words in a sentence. For example, “The cow jumped over the moon.” should return 6 and “jumped”. 

Assumption 1: if the input is empty String, the output of length of longest word should be 0, and longest word should be empty string.

Assumption 2: if the input is null, the output of length of longest word should be 0, and longest word should be empty string.

Assumption 3: valid word includes a-z, A-Z, 0-9

Assumption 4: if the input has two or more words which are the longest word, return the first caught word.

Assumption 5: if the special character is between two words, ex. I#have, this should be treated as two words 'I' and 'have'. Ex. "power-driven", treated as two words, "power" and "driven"

Assumption 6: longest word accepts "'" as the only one punctuation can be printed. If the words have "'" between it, it should be treated as on word. If the longest word contains "'", the return word should contain this punctuation, and length should not contain it. Ex, "I've", the longest word should be "I've", the length should be 3. 

Assumption 7: if the longest word is like "''''''''", which only contains quote, this is not treated as valid word, should return empty string and the length is 0.

1. clone the project, if uses Eclipse, need to install TestNG, this is the link about how to install TestNG in Eclipse, https://www.seleniumeasy.com/testng-tutorials/how-to-install-testng-step-by-step

2. Open AppUnitTest file, UnitTest\src\test\java\unittestdemo, right click the file to run as Junit Test.


