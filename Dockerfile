
FROM gradle:jdk17 AS build

COPY --chown=gradle:gradle . /project
WORKDIR /project

RUN gradle build --no-daemon

FROM openjdk:17

EXPOSE 8080

COPY --from=build /project/build/libs/demo-jsp-0.0.1-SNAPSHOT.jar demo-jsp.jar

ENTRYPOINT ["java","-jar","demo-jsp.jar"]