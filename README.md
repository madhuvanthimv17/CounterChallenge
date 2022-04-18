## Counter Challenge

This application parses a sentence and replaces each word with the following: first letter, number of distinct characters between first and last character, and last letter. The words are separated by spaces or non-alphabetic characters and these separators are maintained in their original form and location in the answer.

## Folder Structure

The workspace contains two folders, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

The src folder has a sub-directory project which has the following 5 packages:

- `main`: Contains App class which is the entry point to the application, has the main() function
- `handler`: Contains InputOutputHandler class which validates the input and prints the final output
- `core`: Contains Counter class which performs the core functionality of counting distinct characters in every word and constructing the output in the desired format
- `exception`: Contains InvalidArgumentException, a custom defined exception handling class
- `test`: Contains AppTest class with unit test cases to test the core function. It also contains a screenshot of the results of my test run and a spreadsheeet with all my test input and the expected output.

The lib folder contains the following dependencies required for JUnit testing framework:

- `hamcrest-core-1.3.jar`
- `junit-4.13.2.jar`

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

The command line argument is mentioned as a value within double quotes to the parameter args in .vscode/launch.json

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
