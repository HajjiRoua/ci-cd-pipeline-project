# Étape 1 : Build de l'application avec tests
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy pom.xml and the source code
COPY pom.xml ./
COPY src ./src

# Build the project and run tests (remove -DskipTests to run tests)
RUN mvn clean package 

# Étape 2 : Exécution de l'application
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
