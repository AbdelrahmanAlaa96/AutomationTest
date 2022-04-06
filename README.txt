1- Specify files and tags that should be run from runner class under Test Runner package
2- Configure TestNG.xml file for test environment the run the file as testng file
3- Every scenario should has its id in its name
5- Every feature file should has tag with its US id
6- If we run FE we write tag @FERegression and if we runapi we write tage @APIRegression in feature file
7- Every feature should has 3 files (feature file - step def. - page)
8- pages should hold locators, strings, actions and assertions and inherits from element actions
9- feature files should has bussiness scenarios
10- step def should has technical steps and inherits from pages
11- assertions uses assertion class
12- we locate element using method in element actions class (getElement())
13- variables and methods should start with small letters
14- write locators, tickets, scenario steps and step def methods in the order of the page under test
15- step def class should end with _StepDef
16- do not assert on existence of a certain element if we will assert on its text
17- do not write any methods if you will not use it
18- Do not make more than 2 then in the scenario except view page scenario
19- for every api we create feature file with its name, endpoint class, extraction class and step def
20- assertions of api errors is under Assersions_API class
21- endpoint class, extraction class are under pages package