FROM eclipse-temurin:22-jdk-alpine

WORKDIR /app

COPY target/agendamento-service.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]