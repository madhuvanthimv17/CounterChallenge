## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

The src folder has a sub-directory project which has the following 5 packages:

- `main`: Contains App class which is the entry point to the application, has the main() function
- `handler`: Contains InputOutputHandler class which validates the input and prints the final output
- `core`: Contains Counter class which performs the core functionality of counting distinct characters in every word and constructing the output in the desired format
- `exception`: Contains InvalidArgumentException, a custom defined exception handling class
- `test`: Contains AppTest class with unit test cases to test the core function

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> The command line argument is mentioned as a value within double quotes to the parameter args in .vscode/launch.json

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
