-- Create the database
CREATE DATABASE IF NOT EXISTS catalog;

-- Create the user
CREATE USER IF NOT EXISTS 'user'@'%' IDENTIFIED BY 'password';

-- Grant privileges
GRANT ALL PRIVILEGES ON *.* TO 'user'@'%' WITH GRANT OPTION;

-- Flush privileges
FLUSH PRIVILEGES;

-- Create the Item table
USE catalog;
CREATE TABLE IF NOT EXISTS Item (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    price DECIMAL(10, 2),
    description TEXT,
    imgsrc VARCHAR(255)
);

-- Insert sample data
INSERT INTO Item (id, name, price, description, imgsrc) VALUES 
(1, 'Advanced Gadget', 149.99, 'A high-quality item with advanced 
features.', 'item_image.jpg');

