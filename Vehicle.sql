CREATE TABLE vehicle (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    registration_number VARCHAR(50),
    model VARCHAR(100),
    status VARCHAR(20),
    fuel_consumption DOUBLE
);