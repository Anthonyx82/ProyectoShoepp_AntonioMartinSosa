# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR al contenedor
COPY target/store-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto (debe coincidir con el de application.properties)
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
