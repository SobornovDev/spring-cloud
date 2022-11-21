FROM openjdk:17-alpine
ARG JAR_FILE=target/room-service-*.jar
COPY ${JAR_FILE} room-service.jar
EXPOSE 7071
ENTRYPOINT ["java","-jar","/room-service.jar"]