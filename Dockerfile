# ---------- Build Stage ----------
FROM gradle:8.7-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean :app:build -x test

# ---------- Run Stage ----------
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
