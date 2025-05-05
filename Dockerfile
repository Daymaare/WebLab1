
FROM openjdk:24-jdk-slim

LABEL maintainer="Daymaare" \
      version="1.0" \
      description="An application for sorting numbers from lowest to biggest with two different sortings."

WORKDIR /app

COPY service/target/service-1.0-SNAPSHOT.jar service.jar
COPY bubblesorter/target/bubblesorter-1.0-SNAPSHOT.jar bubblesorter.jar
COPY quicksorter/target/quicksorter-1.0-SNAPSHOT.jar quicksorter.jar
COPY sortingrunner/target/sortingrunner-1.0-SNAPSHOT.jar sortingrunner.jar

EXPOSE 8080

ENTRYPOINT ["java", "--module-path", "service.jar:bubblesorter.jar:quicksorter.jar:sortingrunner.jar", "-m", "se.iths.java.sortingrunner/se.iths.java24.sortingrunner.main.Main"]
