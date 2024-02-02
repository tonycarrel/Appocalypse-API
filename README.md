Doomsday-API
an API system to the human race manage and capture location, inventory and infection of other survivors

Survivors and Robots Database API Overview This API provides functionality to manage survivors and robots in a post-apocalyptic scenario. It includes features to add survivors to the database, update survivor locations, flag survivors as infected, and connect to the robot CPU system to retrieve information about robots.

Prerequisites Before running the application, ensure you have the following prerequisites installed:

Postman

Download and install Postman to test API endpoints. JDK (Java Development Kit) - Version 21

Download and install JDK 21. PostgreSQL

Download and install PostgreSQL. Create a PostgreSQL database for the application. IntelliJ IDEA

Download and install IntelliJ IDEA. Setup

Clone the repository: git clone https://github.com/your-username/survivors-robots-api.git cd survivors-robots-api 2.Open the project in IntelliJ IDEA.
3.Configure PostgreSQL database connection in application.properties: spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name spring.datasource.username=your_database_username spring.datasource.password=your_database_password 4.Install dependencies: 5.Run the application: 6.Access the API at http://localhost:8080/appcalyse.

Testing with Postman Import the provided Postman collection (Survivors_Robots_API.postman_collection.json) into Postman. The collection includes sample requests for each API endpoint.

Notes This README assumes you have basic knowledge of Java, Spring Boot, and Gradle. Adjustments may be needed based on your specific project structure and requirements. Make sure to update the PostgreSQL database connection details according to your setup in the application.properties file. Update the GitHub repository link accordingly in the README. Feel free to enhance and adapt this README based on your specific project characteristics and user needs.
