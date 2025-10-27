TITLE: EXPENSE TRACKER - JAVA PROJECT COMPLETE REPOSITORY CONTENT
PROJECT NAME: Expense Tracker PROJECT TYPE: Desktop Application (Java + SQLite + Swing) AUTHOR: Ayyappa Murala DEPARTMENT: Artificial Intelligence Machine Learning(CSE(AI&ML) ACADEMIC YEAR: 2025 PROJECT CATEGORY: Software Development / Mini Project PROJECT PURPOSE: To create a user-friendly and efficient application to record, store, and manage daily expenses using Java technology and a local SQLite database.

SECTION 1: PROJECT STRUCTURE
ExpenseTracker-Java/ │ ├── src/ │ ├── Database.java │ ├── Expense.java │ ├── ExpenseDAO.java │ ├── ExpenseTrackerUI.java │ ├── lib/ │ ├── sqlite-jdbc-3.43.2.2.jar │ ├── flatlaf-3.2.jar │ ├── expenses.db │ ├── README.txt │ └── .gitignore

This structure separates the source code, libraries, and database clearly. The "src" folder contains all the main Java source files. The "lib" folder contains external libraries required for JDBC connectivity and GUI styling. The "expenses.db" file acts as the local storage for the application. README.txt provides documentation and usage guide.

SECTION 2: PROJECT DESCRIPTION
The Expense Tracker is a Java-based standalone application that helps users to keep track of their daily expenditures. The system allows users to add new expenses, view previous expenses, and delete unwanted records. Each entry consists of an expense name, amount spent, and the date of the transaction.

This project combines three main areas:

Java GUI programming using Swing
Database handling using SQLite through JDBC
Object-oriented design using classes and DAO pattern
The project follows a simple Model-View-Controller (MVC) architecture:

Model: Expense.java
View: ExpenseTrackerUI.java
Controller: ExpenseDAO.java and Database.java
SECTION 3: MAIN OBJECTIVES
To design a graphical application that can manage personal expenses.
To implement persistent data storage using an embedded SQLite database.
To apply Java’s OOP concepts (Encapsulation, Abstraction, Classes, Objects).
To demonstrate integration of GUI, logic, and database layers in a single project.
To create a simple and efficient user experience.
SECTION 4: FEATURES AND FUNCTIONALITIES
Add Expense: Users can add an expense with name, amount, and date.
View Expenses: Displays all recorded expenses in a table.
Delete Expense: Allows removing unwanted records.
Local Database Storage: Uses SQLite for data persistence.
Modern Interface: FlatLaf library provides a clean, flat look for the GUI.
Error Handling: Checks for missing fields and invalid data entries.
Data Integrity: Prevents duplicate records and ensures consistent database structure.
SECTION 5: TECHNOLOGIES USED
Programming Language: Java Database System: SQLite (via JDBC) User Interface: Swing (Java AWT/Swing components) Libraries: FlatLaf and SQLite-JDBC Architecture Pattern: MVC (Model-View-Controller) Operating Environment: Windows / Linux / macOS Development Tools: VS Code, IntelliJ IDEA, or Eclipse

SECTION 6: FILE DESCRIPTIONS
File: Database.java Purpose: Handles all database connections and initialization. Description:

Connects Java application to the SQLite database file (expenses.db).
Ensures that the database file exists; if not, it automatically creates one.
Provides a reusable connection object for other classes. Key Methods:
connect(): Establishes and returns the SQLite connection.
disconnect(): Closes database connection safely.
getConnection(): Returns active connection object for reuse.
File: Expense.java Purpose: Defines the structure (model) of an Expense object. Attributes:

int id (auto-increment primary key)
String name (name of the expense)
double amount (monetary value)
String date (date in YYYY-MM-DD format) Description:
Provides constructors, getters, and setters.
Represents a single expense record from the database.
File: ExpenseDAO.java Purpose: Handles all CRUD (Create, Read, Update, Delete) operations. Responsibilities:

Insert new expense data into database.
Retrieve all expenses for viewing.
Delete a specific expense using ID. Key Methods:
addExpense(Expense e): Adds an expense record.
getAllExpenses(): Fetches all records and returns as a list.
deleteExpense(int id): Removes the expense by ID. Logic:
Uses prepared statements to avoid SQL injection.
Automatically connects through Database.java.
File: ExpenseTrackerUI.java Purpose: Main graphical user interface of the application. Description:

Creates GUI using Swing components (JFrame, JTable, JButton, JTextField, JLabel).
Integrates FlatLaf library to improve visual appearance.
Uses ExpenseDAO methods to perform backend actions. Features:
Add Button: Adds expense to database.
Delete Button: Deletes selected record.
Refresh Button: Updates the displayed data.
Table: Displays all expenses in a structured way.
Input Fields: Name, Amount, Date. Event Handling:
Each button has an ActionListener that triggers relevant DAO operations.
File: expenses.db Purpose: Local SQLite database file storing all expense data. Contains: Table: expenses Columns: id INTEGER PRIMARY KEY AUTOINCREMENT name TEXT NOT NULL amount REAL NOT NULL date TEXT NOT NULL

This file is automatically connected when the program runs.

SECTION 7: HOW TO COMPILE AND RUN THE PROJECT
METHOD 1: Command Line (CMD)

Open Command Prompt.
Navigate to project directory: cd ExpenseTracker-Java
Compile the source files: javac -cp ".;lib\sqlite-jdbc-3.43.2.2.jar;lib\flatlaf-3.2.jar" src*.java
Run the main file: java -cp ".;lib\sqlite-jdbc-3.43.2.2.jar;lib\flatlaf-3.2.jar;src" ExpenseTrackerUI
METHOD 2: Visual Studio Code

Open ExpenseTracker-Java folder in VS Code.
Add both JAR libraries to referenced libraries.
Select ExpenseTrackerUI.java as main class.
Click “Run Java” or use terminal with same command.
METHOD 3: IntelliJ IDEA or Eclipse

Create a new Java Project.
Import all source files and JAR libraries.
Configure classpath.
Run ExpenseTrackerUI.java as main class.
SECTION 8: SAMPLE OUTPUT (TEXT)
Console Mode: Welcome to Expense Tracker

Add Expense
View All Expenses
Delete Expense
Exit
Enter choice: 1 Enter Expense Name: Groceries Enter Amount: 500 Enter Date (YYYY-MM-DD): 2025-10-27 Expense Added Successfully!

Displayed Table (in GUI):
ID	Name	Amount	Date
1	Groceries	500.00	2025-10-27
2	Fuel	700.00	2025-10-28
SECTION 9: DATABASE SCHEMA
CREATE TABLE IF NOT EXISTS expenses ( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, amount REAL NOT NULL, date TEXT NOT NULL );

Database Integration Notes:

SQLite is a file-based database, no external server needed.
All records are stored in expenses.db file.
JDBC driver handles SQL commands via Java methods.
SECTION 10: LIBRARIES USED
sqlite-jdbc-3.43.2.2.jar Purpose: JDBC driver for SQLite. Function: Allows Java to communicate with SQLite database. Source: https://github.com/xerial/sqlite-jdbc/releases

flatlaf-3.2.jar Purpose: Provides Flat Look and Feel for Java Swing. Function: Modernizes GUI with smooth visuals and consistent color theme. Source: https://mvnrepository.com/artifact/com.formdev/flatlaf

SECTION 11: SYSTEM REQUIREMENTS
Operating System: Windows / Linux / macOS Java Version: JDK 8 or higher RAM: Minimum 2 GB Disk Space: Minimum 100 MB External Libraries: sqlite-jdbc, flatlaf Editor: VS Code, Eclipse, or IntelliJ IDEA

SECTION 12: ADVANTAGES
Easy to use, simple interface.
Data is stored locally and securely.
No internet connection required.
Lightweight and fast performance.
Reusable and extendable code structure.
Open-source and suitable for students.
SECTION 13: FUTURE ENHANCEMENTS
Add income tracking alongside expenses.
Introduce category-wise expense charts.
Integrate export feature to generate monthly reports in PDF or Excel.
Add user authentication for multiple profiles.
Introduce cloud database synchronization.
SECTION 14: LEARNING OUTCOMES
Mastered integration of Java with SQLite using JDBC.
Understood the MVC design pattern in Java applications.
Learned GUI development using Swing components.
Practiced event handling and database logic connection.
Experienced real-world mini-project lifecycle.
SECTION 15: CONCLUSION
This Java-based Expense Tracker provides an efficient way to manage financial records. It is a complete standalone system combining frontend (Swing), backend logic (DAO), and database (SQLite). The project highlights core Java development skills and database connectivity — making it suitable as a CSE academic mini-project. It can be expanded into a full-fledged financial management application with reporting and cloud features.

SECTION 16: AUTHOR DETAILS
Name: Lakshmi Mule Branch: Computer Science and Engineering (CSE) Project Title: Expense Tracker Mentor: [Faculty Name if applicable] Year: 2025 Institution: [Your College or University Name]

SECTION 17: LICENSE AND USAGE
This project is open source for educational use. Anyone can modify, extend, or reuse this project with proper credit to the author. Commercial usage requires permission from the developer.

SECTION 18: GITIGNORE CONTENT
*.class *.log .idea/ .vscode/ out/ bin/

OUTPUT : 
<img width="437" height="716" alt="Image" src="https://github.com/user-attachments/assets/62b0664e-894b-4383-90bb-7a628bd49d5a" />
