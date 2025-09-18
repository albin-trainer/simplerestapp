# Step 1: Use lightweight JDK base image
FROM openjdk:17-jdk-slim

# Step 2: Create app directory inside container
WORKDIR /app

# Step 3: Copy jar file into container
COPY target/my-rest-api-app-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
