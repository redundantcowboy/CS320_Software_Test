# CS320_Software_Test
CS 320 SNHU Software Test, Automation and Quality Analysis 

1. How can I ensure that my code, program, or software is functional and secure ?

In order to make sure that my code for the Contact Service project is functional and secure, I implemented JUnit tests. These tests checked to see if the different parts of the project were working correctly, for instance, in ContactServiceTest.java I wrote tests to check that contacts could be added, updated, and deleted without any issues. I made sure that the code was functional by running my JUnit tests after every change. If all of the tests passed, then I knew the code was still working. When I got feedback from my professor about the phone validation, I fixed it and then reran all of the tests to confirm I didn't break anything. When I saw that all 11 tests passed I knew the code was still functional. After writing the code, I checked test coverage and saw that Contact Service had over 85% coverage, which showed that most of the code was being tested. I also made sure the code was secure by testing for things like null values and inputs that were too long. These tests stop the program from crashing and stop bad data from getting into the system where it could cause problems.  

2. How do I interpret needs and incorporate them into a program?

I used the requirements given in the assignment to figure out what the user specifically needed. I read through them thoroughly to make sure I understood everything, then I went through them one by one and implemented whatever the user entailed. If something wasn't fully met yet, I went back and fixed it, like when my professor pointed out that the phone validation needed to check for exactly 10 digits instead of just 10 characters. 

3. How do I approach designing software?

My approach for designing this software was that I started by looking at examples from the course resources to build a basic skeleton of the classes with fields, a constructor, and getters. Then I went through the requirements one by one and added validation to check for things like null values and length limits. Then I wrote JUnit tests to make sure each requirement was actually working. I ran the tests, fixed anything that failed, and kept going until everything passed. Finally, when my professor gave feedback, I went back and made improvements like fixing the phone validation to check for exactly 10 digits. 
    
