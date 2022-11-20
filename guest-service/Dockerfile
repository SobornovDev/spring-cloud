FROM openjdk:17-alpine
ARG JAR_FILE=target/guest-service-*.jar
COPY ${JAR_FILE} guest-service.jar
EXPOSE 7070
ENTRYPOINT ["java","-jar","/guest-service.jar"]