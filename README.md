# VehicleRental

VehicleRental is a Java-based application that calculates the rental cost of a vehicle, including taxes, based on the rental duration. It demonstrates the use of object-oriented programming principles such as encapsulation, inheritance, and dependency injection.

## Features

- Input rental details such as car model, rental start time, and end time.
- Specify pricing details (price per hour and price per day).
- Automatically calculates:
  - Basic payment based on rental duration.
  - Tax based on the rental cost.
  - Total payment (basic payment + tax).
- Modular design with separate classes for entities, services, and application logic.

## Project Structure

- **Entities**: Represent the core objects of the system.
  - `Vehicle`: Represents the vehicle being rented.
  - `CarRental`: Represents the rental details, including start and finish times, vehicle, and invoice.
  - `Invoice`: Represents the payment details, including basic payment, tax, and total payment.
- **Services**: Contain the business logic.
  - `BrazilTaxService`: Calculates tax based on Brazilian tax rules.
  - `RentalService`: Processes the rental and generates an invoice.
- **Application**: Contains the main program logic to interact with the user.

## How to Run

1. Compile the project using a Java 21-compatible compiler.
2. Run the `Program` class located in the `application` package.
3. Follow the prompts to input rental details and pricing information.
4. View the generated invoice in the console output.

## Example Usage

```plaintext
Enter the rental details:
Car model: Toyota Corolla
Removal (dd/MM/yyyy hh:mm): 15/10/2023 10:00
Return (dd/MM/yyyy hh:mm): 16/10/2023 14:00
Enter the price per hour: 10.00
Enter the price per day: 100.00

INVOICE:
Basic payment: 200.00
Tax: 30.00
Total payment: 230.00
