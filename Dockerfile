FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/Authorization-service-0.0.1-SNAPSHOT.jar your_app.jar

ENTRYPOINT ["java", "-jar", "your_app.jar"]