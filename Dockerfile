FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app-build

COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app-run

COPY --from=build /app-build/target/quarkus-app/ .

ENTRYPOINT ["java","-jar","quarkus-run.jar"]