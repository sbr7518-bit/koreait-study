FROM gradle:9.3-jdk21 AS build
WORKDIR /GitOps
COPY . .
RUN gradle clean bootJar -x test

FROM eclipse-temurin:21-jre
WORKDIR /GitOps
COPY --from=build /GitOps/build/libs/*SNAPSHOT.jar GitOps.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "GitOps.jar" ]