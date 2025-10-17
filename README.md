# University Database CLI 
This is a Java-based command-line interface (CLI) for interacting with a university student database. Built using JDBC to connect to a MySQL database, this application allows users to perform various queries to retrieve information about students, departments, and classes as required by the CS 336 course project.

Key Features 
- The application supports a menu-driven interface to perform the following actions:


- Search Students: Find students by name (case-insensitive, partial matching) or by academic year (Fr, So, Ju, Sr), which is calculated based on completed credits.


- Filter by GPA: Dynamically calculate student GPAs and search for students with a GPA above or below a specified threshold. The GPA is calculated on a 4.0 scale and is weighted by class credits.


- Department Statistics: Report the total number of students in a given department and their collective average GPA.


- Class Statistics: View the number of students currently enrolled in a specific class and see a breakdown of the grades received by past students.


- Execute Arbitrary SQL: A feature that allows the user to execute any valid SQL query directly against the database and view the formatted results.

The initial database was generated using Java simulations so that the JDBC application could be tested. Here are more details:

*Data Generation Process*

The database was populated with 100 random students and associated records. The process for generating this data is as follows:

After manually populating the Departments table, a JavaScript was used to generate and insert the remaining data.

- Course & Name Generation: Large lists of course names for each department, first names, and last names were pre-generated (using ChatGPT) and stored in ArrayLists. Each course was also assigned a random credit value (3 or 4).


- Student Tiers: To ensure a rough balance between academic years, the 100 students were generated in four blocks, with each block having progressively more completed credits (e.g., 0-29 for freshmen, 30-59 for sophomores, etc.).


- Majors & Minors: For each student, a primary major was chosen randomly. Then, using random probabilities, the student was assigned a potential second or third major, as well as one or more minors. The logic ensured a student could not have the same department for a major and a minor, or for multiple majors.


- Course Enrollment: Each student was enrolled in 5 "current" courses (IsTaking table) and a variable number of "completed" courses (HasTaken table). For completed courses, a grade was assigned based on a random probability distribution. The number of completed courses was randomized within a range appropriate for the student's academic year.


*Database Schema*

The database uses the following tables as specified by the assignment:


- Departments (name, campus) 


- Students (first_name, last_name, id) 


- Classes (name, credits) 


- Majors (sid, dname) 


- Minors (sid, dname) 


- IsTaking (sid, name) 


- HasTaken (sid, name, grade)
