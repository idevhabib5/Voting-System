# Voting-System

Sure! Below is an example of a **README.md** file for your Voting System project that uses **Java**, **MySQL**, and **Swing**. You can modify the content according to your specific implementation details.

## Features

- **User Interface**: A graphical user interface (GUI) built with Java Swing to allow users to interact with the system.
- **Voting Process**: Users can vote for candidates and the system will record their choices in a MySQL database.
- **Vote Counting**: After voting, the system can count and display the number of votes for each candidate.
- **Database Integration**: MySQL database is used to store the election candidates, users, and vote data.
- **Admin Features**: Admin can add candidates, delete them, and view election results.
  
## Technologies Used

- **Java**: Core language for application logic.
- **Swing**: Used for building the graphical user interface (GUI).
- **MySQL**: A relational database used to store candidate details, user information, and votes.
- **JDBC (Java Database Connectivity)**: Used to connect Java with MySQL to perform database operations.

## Installation Instructions

### Prerequisites

- **Java** (JDK 8 or higher) installed on your machine.
- **MySQL** installed and running.
- **MySQL Workbench** or any other MySQL client (optional) for managing the database.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java IDE.

### Steps to Run the Voting System

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/voting-system.git
   ```

2. **Set Up MySQL Database**:
   - Create a MySQL database for the voting system. For example, name it `voting_system`.
   - Inside the MySQL shell or using MySQL Workbench, run the following commands to create the necessary tables:
   
   ```sql
   CREATE DATABASE voting_system;
   USE voting_system;

   CREATE TABLE candidates (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       votes INT DEFAULT 0
   );

   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(50) NOT NULL,
       password VARCHAR(255) NOT NULL,
       role ENUM('admin', 'user') DEFAULT 'user'
   );

   CREATE TABLE votes (
       id INT AUTO_INCREMENT PRIMARY KEY,
       user_id INT,
       candidate_id INT,
       FOREIGN KEY (user_id) REFERENCES users(id),
       FOREIGN KEY (candidate_id) REFERENCES candidates(id)
   );
   ```

3. **Configure Database Connection**:
   - Open the Java project in your IDE.
   - Locate the **`DatabaseConnection.java`** file (or any file responsible for connecting to the MySQL database).
   - Change the connection details to match your MySQL credentials:
     ```java
     String url = "jdbc:mysql://localhost:3306/voting_system"; // Database URL
     String username = "root"; // Your MySQL username
     String password = "password"; // Your MySQL password
     ```

4. **Run the Application**:
   - After configuring the database connection, run the Java application.
   - The Swing GUI will open, allowing you to interact with the voting system.

### Running the Application

1. **Login**: Enter a valid username and password. 
   - Admins can manage candidates and view results.
   - Regular users can cast votes.
   
2. **Voting**: Users can vote for one of the available candidates.
   
3. **View Results**: Admins can view the number of votes each candidate has received.

## Database Schema

### Tables

1. **Candidates Table**: Stores information about candidates.
   - `id`: Unique identifier for each candidate.
   - `name`: Name of the candidate.
   - `votes`: Number of votes the candidate has received.

2. **Users Table**: Stores user information.
   - `id`: Unique identifier for each user.
   - `username`: Username of the user.
   - `password`: Password for authentication.
   - `role`: Role of the user (admin or user).

3. **Votes Table**: Records votes cast by users.
   - `id`: Unique identifier for each vote.
   - `user_id`: ID of the user who cast the vote (foreign key).
   - `candidate_id`: ID of the candidate who received the vote (foreign key).

## GUI Features

- **Login Screen**: Allows users to log in as either admin or regular voter.
- **Voting Screen**: Displays a list of candidates where voters can select one and cast their vote.
- **Admin Dashboard**: Allows the admin to add new candidates, delete existing ones, and view the vote counts.
- **Results Screen**: Displays the number of votes each candidate has received.

## Code Structure

- **`src/`**: Contains the main source files for the application.
  - **`VotingSystem.java`**: The main class that runs the application.
  - **`DatabaseConnection.java`**: Handles the database connection.
  - **`Login.java`**: GUI for the login screen.
  - **`VotingScreen.java`**: GUI for the voting screen.
  - **`AdminDashboard.java`**: GUI for the admin dashboard.
  
- **`resources/`**: Contains any assets like icons or images used in the GUI.

## Example Use Cases

1. **Admin Add Candidate**:
   - Admin logs in and goes to the admin dashboard.
   - Admin clicks **Add Candidate** and fills in the candidate's name.
   - The new candidate is added to the `candidates` table in the MySQL database.

2. **User Vote**:
   - A user logs in and sees the available candidates.
   - The user selects a candidate and clicks **Vote**.
   - The vote is recorded in the `votes` table, incrementing the vote count for the selected candidate.

3. **View Results**:
   - The admin can click on **View Results** to see the total votes for each candidate.

## Troubleshooting

- **Database Connection Issues**:
   - Ensure that MySQL is running and that you have configured the correct database credentials in your project.

- **GUI Not Loading**:
   - Make sure you have the necessary Swing libraries included in your project (most IDEs handle this automatically).

- **Incorrect Votes**:
   - Double-check that the `votes` table is being updated properly and that each user can vote only once.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
