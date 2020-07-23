FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} springboot_app.jar

MAINTAINER "dbasak2013@gmail.com"

ENTRYPOINT ["java", "-jar", "springboot_app.jar"]
