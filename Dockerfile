FROM ubuntu:18.04
FROM eclipse-temurin:17-jdk
EXPOSE 8081
EXPOSE 8080
VOLUME /tmp

COPY target/*.jar app.jar
RUN echo "Starting entrypoint"
ENTRYPOINT ["java","-jar","/app.jar"]