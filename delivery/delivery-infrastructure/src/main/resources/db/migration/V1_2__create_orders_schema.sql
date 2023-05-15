CREATE TABLE `orders` (
    `order_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `customer_id` int NOT NULL,
    `order_date` date NOT NULL,
    `total_amount` decimal(10,2) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES Customers (customer_id)
    );
