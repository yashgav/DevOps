## Use an official OpenJDK runtime as a parent image
#FROM openjdk:17-jdk-alpine
#
## Set the working directory in the container
#WORKDIR /app
#
## Copy the packaged jar file into the container
#
## Expose port 8080
#EXPOSE 8080
#
#COPY target/yash-0.0.1-SNAPSHOT.jar app.jar
## Run the jar file
#ENTRYPOINT ["java", "-jar", "app.jar"]


FROM openjdk:17
EXPOSE 8080
ADD target/yash-0.0.1-SNAPSHOT.jar yash-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/yash-0.0.1-SNAPSHOT.jar"]