# Project Setup Guide

This project is providing the baseline for the pair programming session that will be extended during
the interview in a pair programming session. The project contains a basic setup with some useful dependencies.

For a smooth interview process, please ensure you go through the following steps before the interview takes place.
This will help you to set up the local development environment, ensure successful build and start of the application.

If you come across any issue during the setup, please do not hesitate to get in touch.
 
## 1. Preparing your local environment

Before you check out the repository, ensure you have the following installed on your machine:

- **Java Development Kit (JDK)**: Version 17 or higher
- **Maven**: Version 3.9.3 or higher
- **Git**: Version control system to clone the repository
- **IDE**: Any Java IDE of your choice (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 2. Cloning the repository

After setting up the local environment, clone the repository to your local workspace using git.

```bash
git clone <Repository_URL>
```

## 3. Open project in IDE

You are free to use any IDE you are comfortable with. 
Open the project in your IDE and ensure that the project is imported successfully.

You should be able to build the project without any errors and run the application and execute tests from your IDE.

## 4. Building the Project

Open the terminal in the project's root directory `spring-exam` and build the application.

```bash
mvn clean install
```

## 5. Running the application

Start the application from your IDE or use the Spring Boot Maven plugin command:

```bash
mvn spring-boot:run
```
This will start the Spring Boot application on a default port `8080`.
Change the port in `application.properties` if port `8080` is already in use.

## 6. Testing /greet endpoint

To test if the application runs successful access the `/greet` endpoint,
by navigating to http://localhost:8080/greet in your web browser. 

Alternatively, you can also use the `curl` command in the terminal:

```bash
curl http://localhost:8080/greet
```
You should get a successful response, indicating that the `/greet` endpoint is working fine.



