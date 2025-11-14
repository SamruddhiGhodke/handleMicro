# Use official OpenJDK 21 image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy jar file from target folder (after mvn clean package)
COPY target/handleMicro-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Set environment variables (optional)
ENV SPRING_PROFILES_ACTIVE=prod

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
