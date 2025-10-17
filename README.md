# simulated-college-database
A Java and JDBC command-line application for querying and managing a university student database powered by MySQL. Features dynamic GPA calculation, various student search filters, and reporting capabilities.


University Database CLI �
This is a Java-based command-line interface (CLI) for interacting with a university student database. Built using JDBC to connect to a MySQL database, this application allows users to perform various queries to retrieve information about students, departments, and classes as required by the CS 336 course project.

Key Features 
- The application supports a menu-driven interface to perform the following actions:


- Search Students: Find students by name (case-insensitive, partial matching) or by academic year (Fr, So, Ju, Sr), which is calculated based on completed credits.


- Filter by GPA: Dynamically calculate student GPAs and search for students with a GPA above or below a specified threshold. The GPA is calculated on a 4.0 scale and is weighted by class credits.


- Department Statistics: Report the total number of students in a given department and their collective average GPA.


- Class Statistics: View the number of students currently enrolled in a specific class and see a breakdown of the grades received by past students.


- Execute Arbitrary SQL: A feature that allows the user to execute any valid SQL query directly against the database and view the formatted results.

Initial database was generated using Java simulations, so that the JDBC application could be tested. 
