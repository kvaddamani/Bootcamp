FROM ubuntu:latest
FROM eclipse-temurin:17-jdk
EXPOSE 8081
EXPOSE 8080
VOLUME /tmp
RUN apt update
RUN apt install maven -y
COPY . .
RUN ./mvnw install
RUN cp ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]