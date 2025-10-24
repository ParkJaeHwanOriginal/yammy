FROM eclipse-temurin:17-jdk-alpine
COPY ./yammy_back/build/libs/*SNAPSHOT.jar project.jar
ENTRYPOINT ["java", "-jar", "project.jar"]
