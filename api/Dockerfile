# Use OpenJDK as base image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the JAR file
COPY target/api-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
