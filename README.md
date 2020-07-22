# Waters
1.Tools:
-Build tool - As I already mentioned main language in current framework is Java and it's designed using Maven build tool as a blueprint as well as to manage dependencies. I also use maven lifecycle as well as MVN goals in command line to build, validate, test and verify my Regression suite. 
-Automation tool - used Selenium WebDriver dependencies to automate our browser . 
-Assertions: Cucumber BDD with Gherkin language and using Junit 4 assertions to verify and validate our test cases. 
-Reporting tool: usi2ng cucumber HTML reports which, converts json format reports to html document that comes with built in pie charts, information about failed and passed tests. I also utilize Log4J for debugging purposes.
-Log4J: debugging purposes.

2. Design: 

POM:   
My framework is full of OOP features and we are using Page Object Model design structure along with Cucumber BDD and Data Driven Testing. 
Under pages folder I have basePage class, which is parent of all pages classes where I am using Page Factory Design pattern to ease declaring my Web Elements with FindBy annotations. Reason for this page to be abstract is I don't want my base page to be instantiated. 

-BDD. As I mentioned we are using Cucumber BDD, which is declared under Resources folder as feature files where we have declared all the test scenarios for each feature in Gherkin format. Our non-technical team members love it. 

-StepDef - I also have StepDefinitions folder where I implement my feature files with subsequent step definitions. 
-Hooks  - I also have hooks class in this folder with hooks class in this folder where I have implemented Before and After methods that come from cucumber to open/close the browser as well as take screenshot method for failed tests. 

-Runner: I have runner folder with CukesRunner class which is kicked off by my Surefire plugin from my pom.xml file, where I have declared RunWith annotation from Junit to define Cucumber.class and my plugin for my html reports, features path, glue for step definition path.
I also have FailedTestRunner as well as Regression Runner classes for subsequent tests.


-Utilities: I have utilities folder where I have my ConfigurationReader class to inject my configuration.properties file into java using FileInputStream and Properties classes. 

-Driver: My framework uses Singleton design pattern, in order to use same browser cross project declared in Driver class. 
I also have Browser Utils class with my reusable static methods (wait, hover, javascriptExecuter, etc.). 


-BENEFITS:
Easy to maintain and reusable – If the UI elements are changed I only need to change my subsequent pages class, but my code remains unchanged. 
-Easy to understand – Gherkin format beneficial for non-technical team members
-Easy to report - smooth html reports with colorful pie charts, showing percentage of passed and failed classes. 
-Efficient – Cross browser testing as well as cross OS testing using Selenium Grid. 
-Fast - Parallel testing. 
-Supports UI, Database and RestFul Web Services testing 


