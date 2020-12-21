FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /target/itp-0.0.1-SNAPSHOT.jar  itp.jar
ENTRYPOINT ["java", "-jar", "itp.jar"]