# Banking Application

## Overview
The Banking Application is a comprehensive banking system built using Spring Boot. It provides features such as account management, transaction processing, and user authentication. The application performs all CRUD operations and uses various HTTP methods including GET, POST, PUT, and DELETE. It has multiple routes to handle different functionalities throughout the project. 

### Routes and Their Functionality

- **Add Account**:
  - **HTTP Method**: POST
  - **Endpoint**: `/api/accounts`
  - **Functionality**: Creates a new bank account.
  
- **Get Account by ID**:
  - **HTTP Method**: GET
  - **Endpoint**: `/api/accounts/{id}`
  - **Functionality**: Retrieves account details by its ID.
  
- **Deposit Funds**:
  - **HTTP Method**: PUT
  - **Endpoint**: `/api/accounts/{id}/deposit`
  - **Functionality**: Deposits funds into the specified account.

- **Withdraw Funds**:
  - **HTTP Method**: PUT
  - **Endpoint**: `/api/accounts/{id}/withdraw`
  - **Functionality**: Withdraws funds from the specified account.

- **Get All Accounts**:
  - **HTTP Method**: GET
  - **Endpoint**: `/api/accounts`
  - **Functionality**: Retrieves a list of all accounts.

- **Delete Account**:
  - **HTTP Method**: DELETE
  - **Endpoint**: `/api/accounts/{id}`
  - **Functionality**: Deletes an account by its ID.

## Features
- **User Authentication**: Secure login and registration system.
- **Account Management**: Create, update, and delete bank accounts.
- **Transaction Processing**: Perform deposits, withdrawals, and transfers.
- **Balance Inquiry**: Check account balance and transaction history.
- **Form Validation**: Ensures data integrity with client-side and server-side validation.
- **Thymeleaf Templates**: Uses Thymeleaf for rendering dynamic web pages.

## Technologies Used
- **Spring Boot**: Main framework for the application.
- **Thymeleaf**: Template engine for rendering views.
- **Spring Security**: Handles authentication and authorization.
- **Hibernate/JPA**: ORM for database operations.
- **PostgreSQL**: Database for storing persistent data.
- **Maven**: Dependency management and build tool.

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven
- Git

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Abd-pathan/Spring-Banking-App.git
   cd Spring-Banking-App
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application:
   Open your web browser and go to `http://localhost:8080`

## Usage

### Running Tests
To run tests, use the following command:
```bash
mvn test
```

## Contributing
Contributions are welcome! Please read the contributing guidelines before submitting a pull request.

## Contact
For any inquiries or feedback, please reach out to:

- **Name**: Abd Pathan
- **Email**: abd.pathan812@gmail.com
