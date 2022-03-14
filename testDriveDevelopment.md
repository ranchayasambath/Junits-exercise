

Follow the setup and first steps instructions to get a JUnit project running and create a class named MyFirstTest inside of the src/test/java directory and do the following:

    Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
    Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:

List<String> languages = new ArrayList<>();
List<String> moreLanguages = new ArrayList<>();

Create a test method that uses assertArrayEquals to verify the following arrays are equal.

int[] numbers = {1, 2, 3};
int[] otherNumbers = new int[3];
otherNumbers[0] = 1;
otherNumbers[1] = 2;
otherNumbers[2] = 3;

Create a test method that uses both assertFalse and assertTrue to verify the following statements:

String language = "PHP";
language.contains("H"); // use assertTrue for this statement
language.contains("J"); // use assertFalse for this statement

# Testing Legacy Code with JUnit

## Getting Started
1. Fork this repository to make a copy on your own GitHub account.
1. Make sure that your browser is showing this project in your own repositories list in your own account.
1. Click the green button on the right that says "Clone or Download". 
1. The clone address should look like `git@github.com:your-github-username/junit-tests.git`, where `your-github-username` is actually your own username on GitHub.
1. Once you've copied your repo's clone address, it's time to clone the project in one of two ways: 
    - If you're using IntelliJ, choose New->Project From Version Control->Git and then paste in the clone address.`git clone git@github.com:your-github-username/junit-tests.git`.
    - If you're using command line, then execute the following command line command: `git clone git@github.com:your-github-username/junit-tests.git`.
1. Once cloned to your projects directory, open up the project.

## Exercises

### Part One: The Test Driven Development Cycle (Red, Green, Refactor) 

We will follow the best practices of TODD and we will create our tests first and write production code once we see the test fail. We will create a `Student` and a `StudentTest` class for a grades application, before you start let's analyse the requirements for the `Student` class:
 
- `id` should be a `long` number used to represent a "unique user" in our application.
- `name` is a `String` that holds the name of the student.
- `grades` is an `ArrayList` that contains a list of `Integer` numbers.

1. Create a new branch called `students-tests` and read carefully the next instructions.
1. Create a `StudentTest.java` class file inside of `src/test/java` (you might have to create these folders yourself) and remember to write the test before the actual production code. We will simulate the `C(reate) R(ead)` from the `CRUD` functionality in our grades application, you should be able to test and create the following requirements:

    - The `Student` class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    - The `Student` class should have the following methods:
    ```java
        // returns the student's id
        public long getId();  
        // returns the student's name
        public String getName();
        // adds the given grade to the grades list
        public void addGrade(int grade);
        // returns the average of the students grades
        public double getGradeAverage();
    ```
1. As always, commit and push all your changes once you're done.   
_At the end of the exercise you will ended up with a `Student.java` and a `StudentTest.java` class._

#### Bonus

- Go ahead and try to add the rest of the `CRUD` tests and functionality, write the methods for `updateGrade()` and `deleteGrade()` in the `Student` class.

### Part Two: Testing Legacy Code

Once you are done with the `Student.java` class.
 
1. Checkout to the `cohorts-feature` branch, there you will find a `Cohort.java` class inside the `src/main/java` folder, this class has already a lot of methods to calculate the cohort average grade and add a student. Let's go ahead and make sure there's sufficient tests for this class to be deployed to production:

1. Start by creating a new branch called: `cohorts-tests`.
1. Then create a `CohortTest` class and build a test for each of the following requirements:
    - A `Cohort` instance can add a `Student` to the `List` of students.
    - A `Cohort` instance can get the current `List` of students.
    - A `Cohort` instance can get the average and it's being calculated correctly. 
1. Go back to the `StudentTest` class and refactor the code to avoid any repetition in the test cases, the use of the `@Before` annotation will be useful to achieve this, do the same with this new `CohortTest` class if you find any code repetition as well.

#### Bonus

- Follow the TDD cycle and create a new feature to find students by their ID like: `findStudentById(long id)` in the `Cohort` class, remember to create the tests first before any production code.