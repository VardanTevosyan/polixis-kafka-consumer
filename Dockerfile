FROM gradle:8.5-jdk17-alpine as build
COPY . /home/src
WORKDIR /home/src
RUN gradle clean build

FROM openjdk:17-alpine
COPY --from=build /home/src/build/libs/polixis-kafka-consumer-0.0.1.jar /home/app/polixis-kafka-consumer-0.0.1.jar
EXPOSE 8080:8080
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/home/app/polixis-kafka-consumer-0.0.1.jar"]
