FROM openjdk:8-jre-alpine

COPY build/libs/flyway-demo-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "flyway-demo-0.0.1-SNAPSHOT.jar"]
