CREATE DATABASE dbfruits
DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE dbfruits;

CREATE TABLE fruits (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    quantity_kilos DECIMAL(5,2) NOT NULL   
);


