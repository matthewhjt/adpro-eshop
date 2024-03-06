Nama    : Matthew Hotmaraja Johan Turnip
NPM     : 2206081231
Kelas   : Pemrograman Lanjut B

# TUTORIAL

---
# Tutorial 1

### Reflection 1

You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code.  If you find any mistake in your source code, please explain how to improve your code.

I have implemented some clean code principles in this tutorial:
- Variables written by me are all descriptive
- Each functions/methods has one purpose only
- Since there are no complex block of codes, I don't use comments because they're all explanatory and descriptive
- I added some exceptions to the code to handle error

Some mistakes I found in the code:
- Edit Product uses @PostMapping, even though it should be using PUT. I tried to use PUT but the code couldn't work properly because for some reason I couldn't state the form method to be PUT (I could only use GET)
- Like Edit Product, Delete Product also uses @PostMapping even though @DeleteMapping exists. The reason is similar, I couldn't set the form's method to Delete (for some reason it always use the POST method)

### Reflection 2
1. After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors? 

   Writing unit tests can provide a sense of assurance and confidence in my code. It ensures that my code behaves as expected under different scenarios. Successful unit tests can be satisfying, knowing that my code is covered by tests that help catch potential issues. There shouldn't be a fixed number of how many test should be mae. The goal is to have enough tests to cover different cases, including edge cases and common scenarios. Code coverage is a useful metric to understand how much of my code is tested by my unit tests. However, having 100% code coverage does not guarantee that my code is free of bugs or errors. It only means that every line of code has been executed during my tests. To ensure the test we should cover different scenarios and review the codes we've written.

2. Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables.
   What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner! 

    Some of the code cleanlisness corncern i can think is that it may cause duplicates and the codes are not independent anymore

---
# Tutorial 2
Code quality issues I've identified include the need to eliminate the public modifier from tests due to deprecation. To enhance adaptability, a test case should be added to the main app test class. Consistency should be improved by transitioning from @Autowired field injection to method injection. I've also removed several unused imports from the code base.

In terms of Continuous Integration and Continuous Deployment (CI/CD), the project aligns with these principles. Three workflows (ci, scorecard, and sonarcloud) exist, each containing specific jobs with custom commands for automated tasks, mainly focused on testing. The workflows are triggered automatically after push or pull requests, demonstrating a well-implemented CI/CD process.

---
# Tutorial 3
1. Explain what principles you apply to your project!
   - SRP: 
     - Moved CarController from ProductController.java to its own file CarController.java
     - CarController now isn't extending ProductController anymore
     - Removed constructor from model Product.java (now id is assigned by ProductRepository)
   - OCP:
     - The code given by the module didn't violate any OSP
   - LSP:
     - The code given by the module didn't violate any LSP
   - ISP:
     - The code given by the module didn't violate any ISP
   - DIP:
     - Used the interface CarService instead of CarServiceImpl
   

2. Explain the advantages of applying SOLID principles to your project with examples.

   Applying SOLID principles in this project brings several advantages that contribute to the creation of robust and maintainable code. Firstly, the Single Responsibility Principle (SRP) ensures that each class has a single reason to change, enhancing code maintainability and readability. The Open/Closed Principle (OCP) encourages extensibility without modifying existing code. Liskov Substitution Principle (LSP) enables derived classes to be used interchangeably with base classes. This promotes flexibility and ease of code extension. Interface Segregation Principle (ISP) encourages the creation of specific interfaces, preventing the implementation of unnecessary methods and ensuring that classes only adhere to interfaces relevant to their functionality. Finally, the Dependency Inversion Principle (DIP) enhances flexibility by allowing the substitution of dependencies, making it easier to adapt to changes in lower-level implementations without affecting higher-level modules.


3. Explain the disadvantages of not applying SOLID principles to your project with examples.

   Not Applying SOLID principles can lead to a variety of disadvantages, making the codebase difficult to maintain. Without adhering to the Single Responsibility Principle, classes may have multiple reasons to change, resulting in code that is hard to modify and prone to unintended consequences. Reduced reusability is another drawback, particularly when the Open/Closed Principle and Liskov Substitution Principle are ignored. Code modifications become a necessity, diminishing the potential for reuse and increasing the complexity of the system. The lack of flexibility can hinder the adaptability of the codebase to evolving requirements. In summary, the absence of SOLID principles often results in complex, confusing code that is challenging to understand and modify, leading to decreased overall software quality.

---
# Tutorial 4
1. You have followed the Test-Driven Development workflow in the Exercise. Now answer these questions:
Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests.

    - In my opinion, the Test-Driven Development (TDD) flow has its benefits, even though it's challenging to implement.
    I believe that the Test-Driven Development (TDD) approach is valuable. I still struggle with making tests before implementing a class. Regardless of that, the TDD flow assists me in evaluating whether what I'm doing meets correctness, maintainability, and a productive workflow. I find it necessary to consistently verify whether the tests, both unit and functional, are correct.
    

2. You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.
    - I don't think i've fully implemented the F.I.R.S.T. principle. I still am not sure on some tests that I made, due to the amount of tests that I made. I also didn't check the coverage and I'm pretty sure it didn't reach 100% coverage. I'll have to check and fix more tests to fully implement F.I.R.S.T principles, but I think it's good enough for a first-timer like me.


