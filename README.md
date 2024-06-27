
# Introduction
This Java project is designed to automate the control of lawnmowers for handling rectangular lawns. The mower's position is represented by coordinates (x, y) and a cardinal letter denoting its orientation (N, E, W, S). The controller processes a sequence of commands from a file to navigate the mower across the lawn without moving out of the predefined boundaries.


# Features
- File Input: The program reads the initial setup and commands from a text file.
- Boundary Detection: Prevents the mower from moving outside the lawn.
- Sequential Execution: Processes commands for multiple mowers one at a time.


# Project structure
- `src/`: Source files for the project
    - `main/java/com/outerleys/giovanni/controller`: Contains the MovwerController which reads input and controls the mower based on the command. 
    - `main/java/com/outerleys/giovanni/model/`: Contains Mower and Lawn classes that represent the mower and the lawn. 
- `test/`: Test files for the project.     
