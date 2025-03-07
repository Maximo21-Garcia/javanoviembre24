#Imagen base de Docker con java 17
FROM openjdk:17-jdk-alpine

#crear una carpeta llamada app dentro del contenedor
WORKDIR /app

#Copiar el archivo JAR generado por Maven desde la capeta target

COPY target/*.jar app.jar

#Puerto que va a escuchar
EXPOSE 8080

#Comando apra ejecutar la aplicacion
ENTRYPOINT ["java","-jar","app.jar"]