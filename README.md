Spring boot dummy project for rollbar including swagger-ui.

## Requirements
1. [Java 11](https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html)
2. [Gradle](https://gradle.org/install/)

## Setup
  Replace access_token to your post_server_item in application.yml

```shell
access_token : "your post_server_item token"
```
## Build
Build project from project root dir 

```shell
Build: ./gradlew build
```

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.rollbar.rollbardemo.RollbarDemoApplication` class from your IDE.

Alternatively you can use below command from project root dir.

```shell
./gradlew bootRun 
```

## Check rollbar test Api documentation on swagger
```shell
 http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
```