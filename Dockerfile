FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Step 1: Use lightweight JDK base image
FROM openjdk:17-jdk-slim

# Step 2: Create app directory inside container
WORKDIR /app

# Step 3: Copy jar file into container
COPY --from=build /app/target/my-rest-api-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

# Step 4: Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
