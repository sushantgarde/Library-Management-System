### Library Management System

This is a **Library Management System** project developed in Java. The system helps manage library operations such as adding student details, adding books, issuing books, and returning books. This application streamlines the management of library resources and provides a user-friendly interface for librarians and students.

## Features

- **Add Student Details**:
  - Record and manage student information such as name, ID, contact details, and course.
  - Ensure easy retrieval and updating of student records.

- **Add Book**:
  - Add new books to the library database with details such as title, author, genre, ISBN, and quantity.
  - Maintain an organized and searchable catalog of library resources.

- **Issue Book**:
  - Issue books to students by linking the book details with the student's information.
  - Track issued books, including the due date and status.

- **Return Book**:
  - Manage the return of books and update their availability in the database.
  - Calculate and record late fees if applicable.

- **Search and View Records**:
  - Search for books or student details using various filters.
  - Display comprehensive information on books and students.

## Technologies Used

- **Programming Language**: Java
- **Database**: MySQL
  - Tables for students, books, issued books, and return records.
- **IDE**: NetBeans (or any Java-supported IDE)
- **Additional Tools**:
  - JDBC for database connectivity.
  - Apache POI (optional) for exporting data to Excel files.

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   ```
2. Import the project into your preferred Java IDE (e.g., NetBeans, Eclipse).

3. Set up the database:
   - Install and configure MySQL on your system.
   - Create a new database (e.g., `library_db`) using MySQL Workbench or command-line tools.
   - Execute the provided SQL script (`database.sql`) to create the necessary tables and sample data.

4. Update the database connection settings in the project:
   - Open the `dbConfig.java` file in the project.
   - Update the following parameters with your MySQL details:
     ```java
     String url = "jdbc:mysql://localhost:3307/library_db";
     String user = "your-username";
     String password = "your-password";
     ```

5. Build and run the project in your IDE.

## How to Use

1. **Launch the Application**:
   - Run the `Loading1.java` file.

2. **Main Menu Options**:
   - **Add Student**:
     - Enter the required details to register a new student in the system.
   - **Add Book**:
     - Input book details to add new entries to the library.
   - **Issue Book**:
     - Select a student and book, then specify the issue date and due date.
   - **Return Book**:
     - Locate the issued book record and update the return status.

3. **Additional Features**:
   - Search and filter records by ID.

## Project Structure

- `src/`: Contains the Java source files for the project.
  - `Login.java` : Validating the user.
  - `Student.java`: Manages student-related data.
  - `Book.java`: Handles book-related data and operations.
  - `LibraryManagementSystem.java`: Main entry point for the application.
  - `dbConfig.java`: Contains database connection configurations.

- `resources/`: Includes additional assets like images, icons, or configuration files.
- `database.sql`: SQL script for setting up the database schema and tables.

##Preview
![Screenshot 2024-12-22 124752](https://github.com/user-attachments/assets/5a06e9b3-189a-43f8-a302-ec7635a0a7fa)
---
![Screenshot 2024-12-22 124758](https://github.com/user-attachments/assets/4aa2a219-72d1-409c-ab70-771a7169e23e)
---
![Screenshot 2024-12-22 124816](https://github.com/user-attachments/assets/30094771-f7cf-419f-a713-ad37f218875a)
---
![Screenshot 2024-12-22 124822](https://github.com/user-attachments/assets/c83da8c0-ee81-4c4e-afcd-6efc0f73a230)
---
![Screenshot 2024-12-22 124829](https://github.com/user-attachments/assets/9355ce3c-a475-41c4-81a4-a849df8280d6)
---
![Screenshot 2024-12-22 125241](https://github.com/user-attachments/assets/c0460f6e-39cd-425d-9049-54ae20cf9131)
---
![Screenshot 2024-12-22 124833](https://github.com/user-attachments/assets/2df2d07b-0226-470b-8ad0-99c289258a2b)
---
![Screenshot 2024-12-22 130108](https://github.com/user-attachments/assets/3eecbd7f-54ff-4cf1-addb-e5cad8e07c37)
---
![Screenshot 2024-12-22 124838](https://github.com/user-attachments/assets/1c1c1f37-8985-4114-8c23-f1979f74651d)
---
![Screenshot 2024-12-22 125824](https://github.com/user-attachments/assets/a70e9ddb-2ca0-4e5c-967a-77dac6e91ef7)
---
![Screenshot 2024-12-22 125830](https://github.com/user-attachments/assets/8c3bdc3e-adf3-4878-9c26-5a8f7c073ebd)
---
![Screenshot 2024-12-22 124842](https://github.com/user-attachments/assets/cb9b28de-5832-4841-b2a6-9d040a231648)
---
![Screenshot 2024-12-22 125848](https://github.com/user-attachments/assets/dbcde537-5a7f-4c43-bc2c-c3227f9a21a8)
---
![Screenshot 2024-12-22 125855](https://github.com/user-attachments/assets/1af884e6-e91f-4b3c-8439-1564fc95b24a)


---

## Authors

- [@sushantgarde](https://www.github.com/sushantgarde)

## Support

For support, email gardesushant1@gmail.com.


## Feedback

If you have any feedback, please reach out to us at gardesushant1@gmail.com

---

## Contributing

Contributions are welcome! Here are some ways to get involved:

1. Report bugs or suggest new features by opening an issue.
2. Fork the repository, make changes, and submit a pull request.
3. Improve the documentation or enhance the UI/UX.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any queries or feedback, reach out to:

- **Email**: gardesushant1@gmail.com
- **GitHub**: [sushantgarde](https://github.com/sushantgarde)

---

Thank you for exploring the Library Management System project! We hope this project simplifies your library management needs and inspires further enhancements. 😊

