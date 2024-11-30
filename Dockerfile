FROM openjdk:21-jdk

EXPOSE 8080

ADD target/Authorization-service-0.0.1-SNAPSHOT.jar your_app.jar

ENTRYPOINT ["java", "-jar", "your_app.jar"]