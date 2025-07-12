# Stage 1: Build con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiar pom.xml y src para build
COPY pom.xml .
COPY src ./src

# Ejecutar build y empaquetado
RUN mvn clean package -DskipTests

# Stage 2: Imagen final con solo Java y el jar compilado
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copiar el jar compilado desde el stage anterior
COPY --from=build /app/target/store-1.0-SNAPSHOT.jar ./app.jar

# Exponer puerto
EXPOSE 8080

# Ejecutar la app
CMD ["java", "-jar", "app.jar"]
