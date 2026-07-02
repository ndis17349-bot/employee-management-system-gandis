CREATE DATABASE employee_management;

USE employee_management;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE divisions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    division_name VARCHAR(100) NOT NULL
);

CREATE TABLE positions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    position_name VARCHAR(100) NOT NULL,
    level_position INT NOT NULL
);

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    email VARCHAR(150) UNIQUE,
    division_id INT,
    position_id INT,

    FOREIGN KEY (division_id)
    REFERENCES divisions(id),

    FOREIGN KEY (position_id)
    REFERENCES positions(id)
);