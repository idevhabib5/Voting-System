CREATE DATABASE votingsystem;

use votingsystem;

CREATE TABLE admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
-- Insert the root admin user with a password
INSERT INTO admin (username, password)
VALUES ('root', '12345');

CREATE TABLE voter (
    name VARCHAR(100) NOT NULL,
    cnic VARCHAR(20) NOT NULL UNIQUE,
    age INT NOT NULL,
    state VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    candidate VARCHAR(100) NOT NULL,
    PRIMARY KEY (cnic)
);

select * from voter;




