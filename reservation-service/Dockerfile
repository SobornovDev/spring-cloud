FROM openjdk:17-alpine
ARG JAR_FILE=target/reservation-service-*.jar
COPY ${JAR_FILE} reservation-service.jar
EXPOSE 7072
ENTRYPOINT ["java","-jar","/reservation-service.jar"]